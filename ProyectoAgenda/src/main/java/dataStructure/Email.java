package dataStructure;

import java.io.Serializable;

public class Email implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private int idOwner;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		Email e = (Email) o;
		return this.nombre == e.getNombre();
		
	}


}
