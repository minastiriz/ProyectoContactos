package dao;

import java.util.Set;

import abstractFeatures.IComponent;
import dataStructure.Email;

public interface DaoEmail extends IComponent{
	
	public Set<Email> getAllEmails();
	public int getIdOfOwner(String nombre);

}
