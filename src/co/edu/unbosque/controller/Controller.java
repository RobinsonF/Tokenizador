package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Model;
import co.edu.unbosque.model.Tokenizer;
import co.edu.unbosque.model.persistence.ReadFileRule;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{
	
	private View view;
	private Model model;
	private ReadFileRule per;
	
	public Controller() {
		view = new View(this);
		model = new Model();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();

		if (command.equals(view.getSelectionPanel().getCOMMAND_UPLOAD_CODE())) {
			
			model.uploadFile(view.connectFileChooser());
			System.out.print(model.getAllFile());
			
		}
		if (command.equals(view.getSelectionPanel().getCOMMAND_READ_FILE())) {
			view.connectFileChooser();//Seleccionar archivo, devuelve file
			
			System.out.print("hola");
		}
		
	}
	

}
