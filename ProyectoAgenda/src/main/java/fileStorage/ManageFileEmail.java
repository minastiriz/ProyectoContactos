package fileStorage;

import java.util.HashSet;
import java.util.Set;

import dao.DaoEmail;
import dataStructure.Email;

public class ManageFileEmail implements DaoEmail{
	
	private static final String DEFAULT_PATH = "/emails.txt";
	private static final Set<Email> DEFAULT_DATA_TO_MANAGE = new HashSet<Email>();
	
	private Set<Email> emails;
	
	public ManageFileEmail() {
		
		ManageFile.getInstance().createFile(DEFAULT_PATH, DEFAULT_DATA_TO_MANAGE);
		emails = ManageFile.getInstance().cargar(DEFAULT_PATH);
		
	}
	
	
	@Override
	public void close() {
		ManageFile.getInstance().guardar(DEFAULT_DATA_TO_MANAGE, DEFAULT_PATH);
	}


	@Override
	public Set<Email> getAllEmails() {
		return emails;
	}


	@Override
	public int getIdOfOwner(String nombre) {
		int dev = -1;
		for(Email email:emails) {
			if (email.getNombre() == nombre) {
				dev = email.getIdOwner();
				break;
			}
		}
		return dev;
	}

}
