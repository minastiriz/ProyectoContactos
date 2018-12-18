package abstractFeatures;

import dataStructure.Contacto;
import dataStructure.Email;
import dataStructure.Telefono;

public interface IModelFunctionality {
	
	public void getAllContactos();
	public void getContacto(int id);
	public void addContacto(Contacto contacto);
	public void removeContacto(Contacto contacto);
	public void updateContacto(Contacto contacto);
	
	public void getAllEmails();
	public void getIdOfOwnerEmail(String nombre);
	public void addEmail (Email email);
	public void removeEmail(Email email);
	public void updateEmail(Email email);
	
	public void getAllTelefonos();
	public void getIdOfOwnerTelefono(int telefono);
	public void addTelefono(Telefono telefono);
	public void removeTelefono(Telefono telefono);
	public void updateTelefono(Telefono telefono);

}
