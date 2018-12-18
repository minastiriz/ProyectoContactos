package generals;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import fileStorage.ManageFileContactoTest;
import fileStorage.ManageFileEmailTest;
import fileStorage.ManageFileTelefonoTest;
import messages.NotificationCenterTest;
import model.ModelTest;

@RunWith(Suite.class)
@SuiteClasses( { ModelTest.class, 
	NotificationCenterTest.class, 
	ManageFileContactoTest.class,
	ManageFileEmailTest.class,
	ManageFileTelefonoTest.class})
public class GeneralModelTest {}
