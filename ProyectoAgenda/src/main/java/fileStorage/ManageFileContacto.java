package fileStorage;

import java.util.ArrayList;
import java.util.List;

import dao.DaoContacto;
import dataStructure.Contacto;

public class ManageFileContacto implements DaoContacto{
	
	private static final String DEFAULT_PATH = "/contactos.txt";
	private static final List<Contacto> DEFAULT_DATA_TO_MANAGE = new ArrayList<Contacto>();
	
	private List<Contacto> contactos;
	
	public ManageFileContacto() {
		
		ManageFile.getInstance().createFile(DEFAULT_PATH, DEFAULT_DATA_TO_MANAGE);
		contactos = ManageFile.getInstance().cargar(DEFAULT_PATH);
	}

	@Override
	public List<Contacto> getAllContactos() {
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

}
