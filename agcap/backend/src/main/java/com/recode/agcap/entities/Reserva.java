package com.recode.agcap.entities;

import java.sql.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "reservas")
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date dataDaReserva;
	private Date dataSaida;
	private String tipoPagamento;
	private Integer numeroAcompanhante;
	private Double valorTotal;
	
	public Reserva() {
		
	}

	public Reserva(Integer id, Date dataDaReserva, Date dataSaida, String tipoPagamento, Integer numeroAcompanhante,
			Double valorTotal) {
		super();
		this.id = id;
		this.dataDaReserva = dataDaReserva;
		this.dataSaida = dataSaida;
		this.tipoPagamento = tipoPagamento;
		this.numeroAcompanhante = numeroAcompanhante;
		this.valorTotal = valorTotal;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Integer getNumeroAcompanhante() {
		return numeroAcompanhante;
	}

	public void setNumeroAcompanhante(Integer numeroAcompanhante) {
		this.numeroAcompanhante = numeroAcompanhante;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataDaReserva, dataSaida, id, numeroAcompanhante, tipoPagamento, valorTotal);
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
				&& Objects.equals(id, other.id) && Objects.equals(numeroAcompanhante, other.numeroAcompanhante)
				&& Objects.equals(tipoPagamento, other.tipoPagamento) && Objects.equals(valorTotal, other.valorTotal);
	}

	@Override
	public String toString() {
		return "Reserva [id=" + id + ", dataDaReserva=" + dataDaReserva + ", dataSaida=" + dataSaida
				+ ", tipoPagamento=" + tipoPagamento + ", numeroAcompanhante=" + numeroAcompanhante + ", valorTotal="
				+ valorTotal + "]";
	}
}
