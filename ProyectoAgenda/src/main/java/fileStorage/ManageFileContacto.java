package fileStorage;

import java.util.HashSet;
import java.util.Set;

import dao.DaoContacto;
import dataStructure.Contacto;

public class ManageFileContacto implements DaoContacto{
	
	private static final String DEFAULT_PATH = "/contactos.txt";
	private static final Set<Contacto> DEFAULT_DATA_TO_MANAGE = new HashSet<Contacto>();
	
	private Set<Contacto> contactos;
	
	public ManageFileContacto() {
		
		ManageFile.getInstance().createFile(DEFAULT_PATH, DEFAULT_DATA_TO_MANAGE);
		contactos = ManageFile.getInstance().cargar(DEFAULT_PATH);
	}

	@Override
	public Set<Contacto> getAllContactos() {
		return contactos;
	}

	@Override
	public Contacto getContacto(int id) {
		Contacto dev = null;
		for (Contacto contacto:contactos) {
			if (contacto.getId() == id) {
				dev = contacto;
				break;
			}
		}
		return dev;
	}

	@Override
	public void close() {
		ManageFile.getInstance().guardar(DEFAULT_DATA_TO_MANAGE, DEFAULT_PATH);
	}

	@Override
	public void add(Contacto contacto) {
		contactos.add(contacto);
	}

	@Override
	public void remove(Contacto contacto) {
		contactos.remove(contacto);
	}

	@Override
	public void update(Contacto contacto) {
		for(Contacto c: contactos) {
			if (c.equals(contacto)) {
				c.setApellido(contacto.getApellido());
				c.setEmails(contacto.getEmails());
				c.setGrupos(contacto.getGrupos());
				c.setNombre(contacto.getNombre());
				c.setTelefonos(contacto.getTelefonos());
			}
		}
		
	}

}

 