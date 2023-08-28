package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFileClass {
	
	private File file;

	
	public ReadFileClass(File fileC) {
		this.file = fileC;
	}

	public String readFile() {

		String line = "";
		String chain = "";

		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
			while ((line = in.readLine()) != null) {
				chain += line + "\n";
			}
			in.close();
		} catch (IOException e) {
			return null;
		}
		return chain;
	}

}
