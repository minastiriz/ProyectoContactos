package dao;
import java.util.Set;

import abstractFeatures.IComponent;
import dataStructure.Contacto;
//prueba
public interface DaoContacto extends IComponent{
	
	public Set<Contacto> getAllContactos();
	public Contacto getContacto(int id);
	public void add(Contacto contacto);
	public void remove(Contacto contacto);
	public void update(Contacto contacto);

}
