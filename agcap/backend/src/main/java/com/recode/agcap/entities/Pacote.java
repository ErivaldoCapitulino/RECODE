package com.recode.agcap.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pacote")
public class Pacote {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer quantidadeDeDias;
	private String itinerario;
	private Double custo;
	private Double desconto;
	
	public Pacote() {
		
	}

	public Pacote(Integer id, Integer quantidadeDeDias, String itinerario, Double custo, Double desconto) {
		super();
		this.id = id;
		this.quantidadeDeDias = quantidadeDeDias;
		this.itinerario = itinerario;
		this.custo = custo;
		this.desconto = desconto;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantidadeDeDias() {
		return quantidadeDeDias;
	}

	public void setQuantidadeDeDias(Integer quantidadeDeDias) {
		this.quantidadeDeDias = quantidadeDeDias;
	}

	public String getItinerario() {
		return itinerario;
	}

	public void setItinerario(String itinerario) {
		this.itinerario = itinerario;
	}

	public Double getCusto() {
		return custo;
	}

	public void setCusto(Double custo) {
		this.custo = custo;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(custo, desconto, id, itinerario, quantidadeDeDias);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pacote other = (Pacote) obj;
		return Objects.equals(custo, other.custo) && Objects.equals(desconto, other.desconto)
				&& Objects.equals(id, other.id) && Objects.equals(itinerario, other.itinerario)
				&& Objects.equals(quantidadeDeDias, other.quantidadeDeDias);
	}

	@Override
	public String toString() {
		return "Pacote [id=" + id + ", quantidadeDeDias=" + quantidadeDeDias + ", itinerario=" + itinerario + ", custo="
				+ custo + ", desconto=" + desconto + "]";
	}
}
