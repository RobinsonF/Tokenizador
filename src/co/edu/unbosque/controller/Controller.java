package co.edu.unbosque.controller;

import co.edu.unbosque.model.Model;
import co.edu.unbosque.model.persistence.ReadFileRule;
import co.edu.unbosque.view.View;

public class Controller {
	
	private View view;
	private Model model;
	private ReadFileRule per;
	
	public Controller() {
		view = new View(this);
		model = new Model();
		per = new ReadFileRule();
		funcionar ();
	}
	
	public void funcionar () {
		per.readRules();
			
	}
	

}
