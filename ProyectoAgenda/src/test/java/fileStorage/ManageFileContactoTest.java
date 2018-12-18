package fileStorage;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import dataStructure.Contacto;

public class ManageFileContactoTest {
	
	private ManageFileContacto mfc;
	
	@Before
	public void setUp() {
		mfc = new ManageFileContacto();
	}

	@Test
	public void testGetAllContactos_none_emptySet() {
		Set<Contacto> s = mfc.getAllContactos();
		assertEquals(s.size(), 0);
	}

	@Test
	public void testGetContacto_noExists_null() {
		Contacto c = mfc.getContacto(0);
		assertEquals(c, null);
	}

	@Test
	public void testAdd_normal_added() {
		Contacto c = new Contacto();
		c.setId(1);
		mfc.add(c);
	}

	@Test
	public void testRemove_noExists_ok() {
		Contacto c = new Contacto();
		c.setId(1);
		mfc.remove(c);
	}

	@Test
	public void testUpdate_noExists_ok() {
		Contacto c = new Contacto();
		c.setId(1);
		mfc.update(c);
	}
	
	@Test
	public void writingFile_normal_ok() {
		mfc.close();
	}

}
