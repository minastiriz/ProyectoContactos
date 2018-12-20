package dataStructure;

import java.io.Serializable;

public class Telefono implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int tlf;
	private int idOwner;
	
	public int getTlf() {
		return tlf;
	}
	public void setTlf(int tlf) {
		this.tlf = tlf;
	}
	public int getIdOwner() {
		return idOwner;
	}
	public void setIdOwner(int idOwner) {
		this.idOwner = idOwner;
	}
	
	@Override
	public boolean equals(Object o) {
		if (!o.getClass().equals(this.getClass())) {
			return false;
		}
		Telefono t = (Telefono) o;
		return this.tlf == t.getTlf();
		
	}

}
