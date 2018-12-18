package fileStorage;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import dataStructure.Email;

public class ManageFileEmailTest {
	
	private ManageFileEmail mfe;
	
	@Before
	public void setUp() {
		mfe = new ManageFileEmail();
	}

	@Test
	public void testGetAllEmails_none_emptySet() {
		Set<Email> s = mfe.getAllEmails();
		assertEquals(s.size(), 0);
	}

	@Test
	public void testAdd_normal_added() {
		Email email = new Email();
		email.setNombre("a");
		mfe.add(email);
	}

	@Test
	public void testRemove_noExists_ok() {
		Email email = new Email();
		email.setNombre("a");
		mfe.remove(email);
	}

	@Test
	public void testUpdate_noExists_ok() {
		Email email = new Email();
		email.setNombre("a");
		mfe.update(email);
	}
	
	@Test
	public void writingFile_normal_ok() {
		mfe.close();
	}

}
