package model;

import java.sql.Date;
import java.util.Objects;

public class Reserva {
	
	private int id;
	private Date dataDaReserva;
	private Date dataSaida;
	private String tipoPagamento;
	private int numeroAcompanhante;
	private int valorTotal;
	private int id_cliente;
	private int id_pacote;
	
	
	public Reserva() {
		
	}
		
	
	public Reserva(int id, Date dataDaReserva, Date dataSaida, String tipoPagamento, int numeroAcompanhante,
			int valorTotal, int id_cliente, int id_pacote) {
		super();
		this.id = id;
		this.dataDaReserva = dataDaReserva;
		this.dataSaida = dataSaida;
		this.tipoPagamento = tipoPagamento;
		this.numeroAcompanhante = numeroAcompanhante;
		this.valorTotal = valorTotal;
		this.id_cliente = id_cliente;
		this.id_pacote = id_pacote;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDataDaReserva() {
		return dataDaReserva;
	}
	public void setDataDaReserva(Date dataDaReserva) {
		this.dataDaReserva = dataDaReserva;
	}
	public Date getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
	public String getTipoPagamento() {
		return tipoPagamento;
	}
	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	public int getNumeroAcompanhante() {
		return numeroAcompanhante;
	}
	public void setNumeroAcompanhante(int numeroAcompanhante) {
		this.numeroAcompanhante = numeroAcompanhante;
	}
	public int getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public int getId_pacote() {
		return id_pacote;
	}
	public void setId_pacote(int id_pacote) {
		this.id_pacote = id_pacote;
	}
	
	@Override
	public String toString() {
		return "Reserva [id=" + id + ", dataDaReserva=" + dataDaReserva + ", dataSaida=" + dataSaida
				+ ", tipoPagamento=" + tipoPagamento + ", numeroAcompanhante=" + numeroAcompanhante + ", valorTotal="
				+ valorTotal + ", id_cliente=" + id_cliente + ", id_pacote=" + id_pacote + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dataDaReserva, dataSaida, id, id_cliente, id_pacote, numeroAcompanhante, tipoPagamento,
				valorTotal);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserva other = (Reserva) obj;
		return Objects.equals(dataDaReserva, other.dataDaReserva) && Objects.equals(dataSaida, other.dataSaida)
				&& id == other.id && id_cliente == other.id_cliente && id_pacote == other.id_pacote
				&& numeroAcompanhante == other.numeroAcompanhante && Objects.equals(tipoPagamento, other.tipoPagamento)
				&& valorTotal == other.valorTotal;
	}
	
	
}
