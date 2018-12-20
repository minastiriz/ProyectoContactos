package dataStructure;

import java.io.Serializable;
import java.util.List;

public class Contacto implements Serializable{
	
	//Falta constructor por defecto
	//Falta controlar valores no válidos listas
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nombre;
	private String apellido;
	private List<Email> emails;
	private List<Telefono> telefonos;
	private List<String> grupos;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public List<Email> getEmails() {
		return emails;
	}

	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}

	public List<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public List<String> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<String> grupos) {
		this.grupos = grupos;
	}
	
	public void addEmail(Email email) {
		emails.add(email);
	}
	
	public void removeEmail(Email email) {
		emails.remove(email);
	}
	
	public void addTelefono(Telefono telefono) {
		telefonos.add(telefono);
	}
	
	public void removeTelefono(Telefono telefono) {
		telefonos.remove(telefono);
	}
	
	public void addGrupo(String grupo) {
		grupos.add(grupo);
	}
	
	public void removeGrupo(String grupo) {
		grupos.remove(grupo);
	}
	
	@Override
	public boolean equals(Object o) {
		if (!o.getClass().equals(this.getClass())) {
			return false;
		}
		Contacto c = (Contacto) o;
		return this.id == c.getId();
		
	}

}
