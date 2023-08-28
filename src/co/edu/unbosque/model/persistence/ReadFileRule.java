package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileRule {
	
	public static void readRules() {
		 String filePath = "data\\ejemplo.txt"; 
		 String line = "";
	        
	        try {
	            File file = new File(filePath);
	            Scanner scanner = new Scanner(file);
	            
	            while (scanner.hasNextLine()) {
	                line = line + scanner.nextLine()+ "\n";
	                
	            }
	            System.out.println(line);
	            
	            scanner.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }
	}
}
