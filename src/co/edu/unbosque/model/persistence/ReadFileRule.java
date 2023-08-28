package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import com.arithmeticparser.tokens.Tokenizer;

public class ReadFileRule {
	
private File file;

	
	public ReadFileRule(File fileC) {
		this.file = fileC;
	}

	public String readFile() {

		String line = "";
		String chain = "";

		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
			while ((line = in.readLine()) != null) {
				String[] splitArray = line.split(";");
				Tokenizer tokenizer = new Tokenizer();
				tokenizer.add(splitArray[0],Integer.parseInt(splitArray[2].trim()));
				chain += line + "\n";
			}
			in.close();
		} catch (IOException e) {
			return null;
		}
		return chain;
	}
}
