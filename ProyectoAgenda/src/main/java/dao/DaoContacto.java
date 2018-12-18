package dao;
import java.util.List;

import abstractFeatures.IComponent;
import dataStructure.Contacto;

public interface DaoContacto extends IComponent{
	
	public List<Contacto> getAllContactos();
	public Contacto getContacto(int id);

}
