package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import co.edu.unbosque.model.Model;
import co.edu.unbosque.model.Token;
import co.edu.unbosque.model.Tokenizer;
import co.edu.unbosque.model.persistence.ReadFileRule;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{
	
	private View view;
	private Model model;
	private String codigo = "";
	
	public Controller() {
		view = new View(this);
		model = new Model();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();

		if (command.equals(view.getSelectionPanel().getCOMMAND_UPLOAD_CODE())) {
			
			model.uploadFile(view.connectFileChooser());
			this.codigo = model.getAllFile();
			this.codigo = model.removeComments(this.codigo);
			this.view.getShowPanel().getShowPanel().getTxtAreaShow().setText(this.codigo);
			
		}
		if (command.equals(view.getSelectionPanel().getCOMMAND_READ_FILE())) {
			this.model.uploadFileRule(view.connectFileChooser());
			Tokenizer tokenizer = this.model.getTokenizer();
			tokenizer.tokenize(this.codigo);
			String result = "";
			for (Token tok : tokenizer.getTokens()) {
				result += "[Token:" + tok.token + " Lexema:" + tok.lexeme + " Posicion:" + tok.pos + "]\n";
            }
			this.view.getShowPanel().getShowPanel().getTxtAreaShowResult().setText(result);
			
		}
		
	}
	

}
