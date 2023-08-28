package co.edu.unbosque.model;

import java.io.File;

import co.edu.unbosque.model.persistence.ReadFileClass;
import co.edu.unbosque.model.persistence.ReadFileRule;

public class Model {
	
	private String allFile;
	
	private Tokenizer tokenizer;
	
	private File file;
	
	private ReadFileClass readFileClass;
	
	private ReadFileRule readFileRule;
	
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
	
	public void uploadFileRule(File file) {
		this.file = file;
		if (file != null) {
			readFileRule = new ReadFileRule(file);
			this.tokenizer = readFileRule.readFile();
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

	public ReadFileRule getReadFileRule() {
		return readFileRule;
	}

	public void setReadFileRule(ReadFileRule readFileRule) {
		this.readFileRule = readFileRule;
	}

	public Tokenizer getTokenizer() {
		return tokenizer;
	}

	public void setTokenizer(Tokenizer tokenizer) {
		this.tokenizer = tokenizer;
	}

}
