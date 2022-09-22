package leasutam.domain;

import java.io.Serializable;
import java.util.Objects;

public class Categoria implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	private Integer ID;
	private String  Nome;
	
	public Categoria () {
		

	}
	public Categoria(Integer iD, String nome) {
		super();
		ID = iD;
		Nome = nome;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(ID, other.ID);
	}
	
	
	
}
