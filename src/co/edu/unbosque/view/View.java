package co.edu.unbosque.view;

import java.io.File;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import co.edu.unbosque.controller.Controller;

public class View  extends JFrame{
	
	
	private JSplitPane splitPane;
	private SelectionPanel selectionPanel;
	private MenuPanel showPanel;
	
	public View(Controller controller) {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(900, 400);
		this.setTitle("Tokenizador");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		selectionPanel = new SelectionPanel();
		showPanel = new MenuPanel();
		
		splitPane = new JSplitPane();
		splitPane.setLeftComponent(selectionPanel);
		splitPane.setRightComponent(showPanel);
		splitPane.setEnabled(false);
		getContentPane().add(splitPane);
		assignListeners(controller);
		repaint();
		revalidate();
	}

	public void assignListeners(Controller controller) {
		this.selectionPanel.getBtnReadFile().addActionListener(controller);
		this.selectionPanel.getBtnUploadCode().addActionListener(controller);
	}
	
	public File connectFileChooser() {
		WindowFileChooser tf = new WindowFileChooser();
		File fileChooser = tf.checkFile();
		this.showInformationMessage("The selected file is: " + fileChooser.getName());
		return fileChooser;
	}
	
	public void showWarningMessage(String message) {
		JOptionPane.showMessageDialog(null, message, "Mensaje de advertencia", JOptionPane.WARNING_MESSAGE);
	}

	public void showInformationMessage(String message) {
		JOptionPane.showMessageDialog(null, message, "Información", JOptionPane.INFORMATION_MESSAGE);
	}

	public void showErrorMessage(String message) {
		JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
	}

	public JSplitPane getSplitPane() {
		return splitPane;
	}

	public void setSplitPane(JSplitPane splitPane) {
		this.splitPane = splitPane;
	}

	public SelectionPanel getSelectionPanel() {
		return selectionPanel;
	}

	public void setSelectionPanel(SelectionPanel selectionPanel) {
		this.selectionPanel = selectionPanel;
	}

	public MenuPanel getShowPanel() {
		return showPanel;
	}

	public void setShowPanel(MenuPanel showPanel) {
		this.showPanel = showPanel;
	}
	
	
	
}
