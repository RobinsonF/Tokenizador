package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class SelectionPanel extends JPanel{
	
	private final String COMMAND_UPLOAD_CODE = "UPLOADCODE";
	private final String COMMAND_READ_FILE = "READFILE";

	private JButton btnUploadCode, btnReadFile;
	
	public SelectionPanel() {
		setLayout(new GridLayout(2, 1));
		btnUploadCode = new JButton("Subir código");
		btnReadFile = new JButton("Leer token");
		add(btnUploadCode);
		add(btnReadFile);
		btnUploadCode.setActionCommand(COMMAND_UPLOAD_CODE);
		btnReadFile.setActionCommand(COMMAND_READ_FILE);
	}

	public JButton getBtnUploadCode() {
		return btnUploadCode;
	}

	public void setBtnUploadCode(JButton btnUploadCode) {
		this.btnUploadCode = btnUploadCode;
	}

	public JButton getBtnReadFile() {
		return btnReadFile;
	}

	public void setBtnReadFile(JButton btnReadFile) {
		this.btnReadFile = btnReadFile;
	}

	public String getCOMMAND_UPLOAD_CODE() {
		return COMMAND_UPLOAD_CODE;
	}

	public String getCOMMAND_READ_FILE() {
		return COMMAND_READ_FILE;
	}
	
}
