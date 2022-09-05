package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Endereco;
import util.ConnectionFactory;

public class EnderecoDAO {

	public void save (Endereco endereco) {
        String sql = "INSERT INTO endereco(rua, "
        		   + "numero, "
        		   + "bairro, "
        		   + "cidade, "
        		   + "estado, "
        		   + "cep,"
        		   + "id_cliente) VALUES (?,?,?,?,?,?,?)";

        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);

            statement.setString(1, endereco.getRua());
            statement.setInt(2, endereco.getNumero());
            statement.setString(3, endereco.getBairro());
            statement.setString(4, endereco.getCidade());
            statement.setString(5, endereco.getEstado());
            statement.setString(6, endereco.getCep());
            statement.setInt(7, endereco.getId_cliente());
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

	public void update(Endereco endereco) {

        String sql = "UPDATE endereco SET rua = ?,"
        		   + "numero = ?,"
        		   + "bairro = ?,"
        		   + "cidade = ?,"
        		   + "estado = ?,"
        		   + "cep = ?,"
        		   + "id_cliente = ?" + " WHERE id = ?";

        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);

            statement.setString (1, endereco.getRua());
            statement.setInt(2, endereco.getNumero());
            statement.setString(3, endereco.getBairro());
            statement.setString(4, endereco.getCidade());
            statement.setString(5, endereco.getEstado());
            statement.setString(6, endereco.getCep());
            statement.setInt(7, endereco.getId_cliente());
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

	public void removeById(int enderecoId) {

		String sql = "DELETE FROM endereco WHERE id = ?";
		Connection conn = null;
		PreparedStatement statement = null;

		try {
			conn = ConnectionFactory.getConnection();
			statement = conn.prepareStatement(sql);
			statement.setInt(1, enderecoId);
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

	public List<Endereco> getAll() {
		
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rset = null;
        
		String sql = "SELECT * FROM endereco";
		List<Endereco> enderecos = new ArrayList<Endereco>();
		
		try {
			conn = ConnectionFactory.getConnection();
			statement = conn.prepareStatement(sql);
			rset = statement.executeQuery();
			
			while(rset.next()) {
				Endereco endereco = new Endereco();
				endereco.setRua(rset.getString("rua"));
				endereco.setNumero(rset.getInt("numero"));
				endereco.setBairro(rset.getString("bairro"));
				endereco.setCidade(rset.getString("cidade"));
				endereco.setEstado(rset.getString("estado"));
				endereco.setId_cliente(rset.getInt("id_cliente"));
				enderecos.add(endereco);
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