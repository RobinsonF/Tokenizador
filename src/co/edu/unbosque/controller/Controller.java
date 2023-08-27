package co.edu.unbosque.controller;

import co.edu.unbosque.model.Model;
import co.edu.unbosque.view.View;

public class Controller {
	
	private View view;
	private Model model;
	
	public Controller() {
		view = new View(this);
		model = new Model();
	}

}
