package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Pacote;
import util.ConnectionFactory;

public class PacoteDAO {
	public void save (Pacote pacote) {
        String sql = "INSERT INTO pacote(quantidadeDeDias, itinerario,"
        		   + " custo,"
        		   + " desconto) VALUES (?,?,?,?)";

        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);

            statement.setInt(1, pacote.getQuantidadeDeDias());
            statement.setString(2, pacote.getItinerario());
            statement.setDouble(3, pacote.getCusto());
            statement.setDouble(4, pacote.getDesconto());
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

	public void update(Pacote pacote) {

        String sql = "UPDATE pacote SET quantidadeDeDias = ?, itinerario = ?,custo = ?,desconto = ?"
        	    + " WHERE id = ?";

        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);

            statement.setInt(1, pacote.getQuantidadeDeDias());
            statement.setString(2, pacote.getItinerario());
            statement.setDouble(3, pacote.getCusto());
            statement.setDouble(4, pacote.getDesconto());
            statement.setInt(5, pacote.getId());
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

	public void removeById(int pacoteId) {

		String sql = "DELETE FROM pacote WHERE id = ?";
		Connection conn = null;
		PreparedStatement statement = null;

		try {
			conn = ConnectionFactory.getConnection();
			statement = conn.prepareStatement(sql);
			statement.setInt(1, pacoteId);
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

	public List<Pacote> getAll() {
		
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rset = null;
        
		String sql = "SELECT * FROM pacote";
		List<Pacote> pacotes = new ArrayList<Pacote>();
		
		try {
			conn = ConnectionFactory.getConnection();
			statement = conn.prepareStatement(sql);
			rset = statement.executeQuery();
			
			while(rset.next()) {
				Pacote pacote = new Pacote();
				pacote.setQuantidadeDeDias(rset.getInt("quantidadeDeDias"));
				pacote.setItinerario(rset.getString("itinerario"));
				pacote.setCusto(rset.getDouble("custo"));
				pacote.setDesconto(rset.getDouble("desconto"));
				pacotes.add(pacote);
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
