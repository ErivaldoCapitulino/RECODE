package model;

import java.util.Objects;

public class Destino {

	private int id;
	private String lugar;
	private int id_pacote;
	
	
	public Destino() {
		
	}
	
	
	public Destino(int id, String lugar, int id_pacote) {
		super();
		this.id = id;
		this.lugar = lugar;
		this.id_pacote = id_pacote;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public int getId_pacote() {
		return id_pacote;
	}
	public void setId_pacote(int id_pacote) {
		this.id_pacote = id_pacote;
	}
	
	
	@Override
	public String toString() {
		return "Destino [id=" + id + ", lugar=" + lugar + ", id_pacote=" + id_pacote + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, id_pacote, lugar);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Destino other = (Destino) obj;
		return id == other.id && id_pacote == other.id_pacote && Objects.equals(lugar, other.lugar);
	}
	

}
