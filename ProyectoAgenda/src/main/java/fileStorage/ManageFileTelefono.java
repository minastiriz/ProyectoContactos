package fileStorage;

import java.util.HashSet;
import java.util.Set;

import dao.DaoTelefono;
import dataStructure.Telefono;

public class ManageFileTelefono implements DaoTelefono{
	
	private static final String DEFAULT_PATH = "/telefonos.txt";
	private static final Set<Telefono> DEFAULT_DATA_TO_MANAGE = new HashSet<Telefono>();
	
	private Set<Telefono> telefonos;
	
	public ManageFileTelefono() {
		
		ManageFile.getInstance().createFile(DEFAULT_PATH, DEFAULT_DATA_TO_MANAGE);
		telefonos = ManageFile.getInstance().cargar(DEFAULT_PATH);
		
	}

	
	@Override
	public void close() {
		ManageFile.getInstance().guardar(DEFAULT_DATA_TO_MANAGE, DEFAULT_PATH);
	}


	@Override
	public Set<Telefono> getAllTelefonos() {
		return telefonos;
	}


	@Override
	public int getIdOfOwner(int telefono) {
		int dev = -1;
		for(Telefono tlf:telefonos) {
			if (tlf.getTlf() == telefono) {
				dev = tlf.getIdOwner();
				break;
			}
		}
		return dev;
	}

}
