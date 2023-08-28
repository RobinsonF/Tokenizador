package co.edu.unbosque.model;

import java.io.File;

import co.edu.unbosque.model.persistence.ReadFileClass;

public class Model {
	
	private String allFile;
	
	private File file;
	
	private ReadFileClass readFileClass;
	
	public Model(){
		file = null;
	}
	
	public void uploadFile(File file) {
		this.file = file;
		if (file != null) {
			readFileClass = new ReadFileClass(file);
			allFile = readFileClass.readFile();
		}
	}

	public String getAllFile() {
		return allFile;
	}

	public void setAllFile(String allFile) {
		this.allFile = allFile;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public ReadFileClass getReadFileClass() {
		return readFileClass;
	}

	public void setReadFileClass(ReadFileClass readFileClass) {
		this.readFileClass = readFileClass;
	}
	

}
