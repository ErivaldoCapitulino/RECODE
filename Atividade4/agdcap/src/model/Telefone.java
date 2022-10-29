package model;

import java.util.Objects;


public class Telefone {

	private int id;
	private String numero;
	private Cliente cliente;
	private int id_cliente;
	
	
	public Telefone() {
		
	}
	
	
	public Telefone(int id, String numero, Cliente cliente, int id_cliente) {
		super();
		this.id = id;
		this.numero = numero;
		this.cliente = cliente;
		this.id_cliente = id_cliente;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	
	@Override
	public String toString() {
		return "Telefone [id=" + id + ", numero=" + numero + ", cliente=" + cliente + ", id_cliente=" + id_cliente
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cliente, id, id_cliente, numero);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		return Objects.equals(cliente, other.cliente) && id == other.id && id_cliente == other.id_cliente
				&& Objects.equals(numero, other.numero);
	}
	
	
}
