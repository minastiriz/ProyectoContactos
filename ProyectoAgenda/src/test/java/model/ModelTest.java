package model;

import org.junit.Before;
import org.junit.Test;

import configuration.ConfigureDaoFile;
import dataStructure.Contacto;

public class ModelTest {
	
	private Model model;
	private ConfigureDaoFile config;
	
	@Before
	public void prepareTest() {
		config = new ConfigureDaoFile();
		model = new Model(config);
	}

	@Test
	public void addContacto_normal_added() {
		Contacto c = new Contacto();
		c.setId(1);
		model.addContacto(c);
	}
	
	@Test
	public void removeContacto_noExists_ok() {
		Contacto c = new Contacto();
		c.setId(1);
		model.removeContacto(c);
	}
	
	@Test
	public void updateContacto_noExists_ok() {
		Contacto c = new Contacto();
		c.setId(1);
		model.updateContacto(c);
	}

}
