package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Destino;
import util.ConnectionFactory;

public class DestinoDAO {

	public void save (Destino destino) {
        String sql = "INSERT INTO destino(lugares, id_pacote) VALUES (?,?)";

        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);

            statement.setString(1, destino.getLugar());
            statement.setInt(2, destino.getId_pacote());
            statement.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao salvar a tarefa " + ex.getMessage(), ex);
        } finally {
            try {
                if (statement != null) {
                	statement.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar a conexão", ex);
            }
        }
	}

	public void update(Destino destino) {

        String sql = "UPDATE destino SET lugar = ?,"
        		   + "id_pacote = ?," + " WHERE id = ?";

        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);

            statement.setString (1, destino.getLugar());
            statement.setInt(2, destino.getId_pacote());
            statement.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro em atualizar a tarefa", ex);
        } finally {
            try {
                if (statement != null) {
                	statement.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar a conexão", ex);
            }
        }
	}

	public void removeById(int destinoId) {

		String sql = "DELETE FROM destino WHERE id = ?";
		Connection conn = null;
		PreparedStatement statement = null;

		try {
			conn = ConnectionFactory.getConnection();
			statement = conn.prepareStatement(sql);
			statement.setInt(1, destinoId);
			statement.execute();
		} catch (SQLException ex) {
			throw new RuntimeException("Erro ao deletar a tarefa", ex);
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {
				throw new RuntimeException("Erro ao fechar a conexão", ex);
			}
		}
	}

	public List<Destino> getAll() {
		
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rset = null;
        
		String sql = "SELECT * FROM destino";
		List<Destino> destinos = new ArrayList<Destino>();
		
		try {
			conn = ConnectionFactory.getConnection();
			statement = conn.prepareStatement(sql);
			rset = statement.executeQuery();
			
			while(rset.next()) {
				Destino destino = new Destino();
				destino.setLugar(rset.getString("lugar"));
				destino.setId_pacote(rset.getInt("id_pacote"));
				destinos.add(destino);
			}
		}catch (SQLException ex) {
			throw new RuntimeException("Erro ao buscar os cliente ", ex);
		}finally {
            try {
                if (rset != null) {
                    rset.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar a conexão", ex);
            }
        }
		
		return null;
	}
}
