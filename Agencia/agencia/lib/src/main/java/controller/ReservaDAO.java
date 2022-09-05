package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Reserva;
import util.ConnectionFactory;

public class ReservaDAO {
	public void save (Reserva reserva) {
        String sql = "INSERT INTO reserva(dataDaReserva, "
        		   + "dataSaida, "
        		   + "tipoPagamento, "
        		   + "numeroAcompanhante,"
        		   + "valorTotal,"
        		   + "id_cliente,"
        		   + "id_pacote) VALUES (?,?,?,?,?,?,?)";

        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);

            statement.setDate(1, reserva.getDataDaReserva());
            statement.setDate(2, reserva.getDataSaida());
            statement.setString(3, reserva.getTipoPagamento());
            statement.setInt(4, reserva.getNumeroAcompanhante());
            statement.setDouble(5, reserva.getValorTotal());
            statement.setDouble(6, reserva.getId_cliente());
            statement.setDouble(7, reserva.getId_pacote());
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

	public void update(Reserva reserva) {

        String sql = "UPDATE reserva SET dataDaReserva = ?, "
        		+ "dataSaida = ?,"
        		+ "tipoPagamento = ?,"
        		+ "numeroAcompanhante = ?,"
        		+ "valorTotal = ?,"
        		+ "id_cliente = ?,"
        		+ "id_pacote = ?" + " WHERE id = ?";

        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);

            statement.setDate(1, reserva.getDataDaReserva());
            statement.setDate(2, reserva.getDataSaida());
            statement.setString(3, reserva.getTipoPagamento());
            statement.setInt(4, reserva.getNumeroAcompanhante());
            statement.setDouble(5, reserva.getValorTotal());
            statement.setDouble(6, reserva.getId_cliente());
            statement.setDouble(7, reserva.getId_pacote());
            statement.setInt(8, reserva.getId());
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

	public void removeById(int reservaId) {

		String sql = "DELETE FROM reserva WHERE id = ?";
		Connection conn = null;
		PreparedStatement statement = null;

		try {
			conn = ConnectionFactory.getConnection();
			statement = conn.prepareStatement(sql);
			statement.setInt(1, reservaId);
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

	public List<Reserva> getAll() {
		
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rset = null;
        
		String sql = "SELECT * FROM reserva";
		List<Reserva> reservas = new ArrayList<Reserva>();
		
		try {
			conn = ConnectionFactory.getConnection();
			statement = conn.prepareStatement(sql);
			rset = statement.executeQuery();
			
			while(rset.next()) {
				Reserva reserva = new Reserva();
				reserva.setDataDaReserva(rset.getDate("dataDaReserva"));
				reserva.setDataSaida(rset.getDate("dataSaida"));
				reserva.setTipoPagamento(rset.getString("tipoPagamento"));
				reserva.setNumeroAcompanhante(rset.getInt("numeroAcompanhante"));
				reserva.setValorTotal(rset.getInt("valorTotal"));
				reserva.setId_cliente(rset.getInt("id_cliente"));
				reserva.setId_pacote(rset.getInt("id_pacote"));
				reservas.add(reserva);
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
