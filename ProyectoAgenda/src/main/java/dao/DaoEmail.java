package dao;

import java.util.Set;

import abstractFeatures.IComponent;
import dataStructure.Email;

public interface DaoEmail extends IComponent{
	
	public Set<Email> getAllEmails();
	public int getIdOfOwner(String nombre);
	public void add (Email email);
	public void remove(Email email);
	public void update(Email email);

}
