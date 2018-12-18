package fileStorage;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import dataStructure.Telefono;

public class ManageFileTelefonoTest {
	
	private ManageFileTelefono mft;
	
	@Before
	public void setUp() {
		mft = new ManageFileTelefono();
	}

	@Test
	public void testGetAllTelefonos_none_emptySet() {
		Set<Telefono> s = mft.getAllTelefonos();
		assertEquals(s.size(), 0);
	}

	@Test
	public void testAdd_normal_added() {
		Telefono telefono = new Telefono();
		telefono.setTlf(0);
		mft.add(telefono);
	}

	@Test
	public void testRemove_noExists_ok() {
		Telefono telefono = new Telefono();
		telefono.setTlf(0);
		mft.remove(telefono);
	}

	@Test
	public void testUpdate_noExists_ok() {
		Telefono telefono = new Telefono();
		telefono.setTlf(0);
		mft.update(telefono);
	}
	
	@Test
	public void writingFile_normal_ok() {
		mft.close();
	}

}
