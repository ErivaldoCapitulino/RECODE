package model;

import java.util.Objects;

public class Pacote {

	private int id;
	private int quantidadeDeDias;
	private String itinerario;
	private double custo;
	private double desconto;
	
	public Pacote() {
		
	}
	
	public Pacote(int id, int quantidadeDeDias, String itinerario, double custo, double desconto) {
		super();
		this.id = id;
		this.quantidadeDeDias = quantidadeDeDias;
		this.itinerario = itinerario;
		this.custo = custo;
		this.desconto = desconto;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantidadeDeDias() {
		return quantidadeDeDias;
	}
	
	public void setQuantidadeDeDias(int quantidadeDeDias) {
		this.quantidadeDeDias = quantidadeDeDias;
	}
	
	public String getItinerario() {
		return itinerario;
	}
	public void setItinerario(String itinerario) {
		this.itinerario = itinerario;
	}
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	@Override
	public String toString() {
		return "Pacote [id=" + id + ", quantidadeDeDias=" + quantidadeDeDias + ", itinerario=" + itinerario + ", custo="
				+ custo + ", desconto=" + desconto + "]";
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
		return Double.doubleToLongBits(custo) == Double.doubleToLongBits(other.custo)
				&& Double.doubleToLongBits(desconto) == Double.doubleToLongBits(other.desconto) && id == other.id
				&& Objects.equals(itinerario, other.itinerario) && quantidadeDeDias == other.quantidadeDeDias;
	}
}
