package dao;

import java.util.Set;

import abstractFeatures.IComponent;
import dataStructure.Telefono;

public interface DaoTelefono extends IComponent{
	
	public Set<Telefono> getAllTelefonos();
	public int getIdOfOwner(int telefono);
	public void add(Telefono telefono);
	public void remove(Telefono telefono);
	public void update(Telefono telefono);

}
