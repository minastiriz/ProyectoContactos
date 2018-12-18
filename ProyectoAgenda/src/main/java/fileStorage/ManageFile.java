package fileStorage;

import java.io.IOException;

public class ManageFile {
	
	//Constants
	
	private static final String DEFAULT_PATH = "agenda";
	
	//Static body
	
	private static ManageFile mg;
	
	public static ManageFile getInstance() {
		if (mg == null)
			mg = new ManageFile();
		return mg;
	}
	
	public static String getDefaultPath() {
		return DEFAULT_PATH;
	}
	
	//Instanciate body
	
	public ManageFile() {
		LoadStore.createDirectorySave(DEFAULT_PATH);
	}
	
	public <T> void guardar(T objeto, String fichero){
		try {
			LoadStore.guardar(objeto, DEFAULT_PATH + fichero);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public <T> void createFile(String filePath, T object) {
		try {
			LoadStore.createFile(DEFAULT_PATH + filePath, object);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public <T> T cargar(String filePath) {
		try {
			return LoadStore.cargar(DEFAULT_PATH + filePath);
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

}
