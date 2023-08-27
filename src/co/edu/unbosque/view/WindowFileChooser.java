package co.edu.unbosque.view;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class WindowFileChooser extends JPanel{
	
	private JFileChooser jf;
	
	private FileNameExtensionFilter filter;
	
	public WindowFileChooser() {
		jf = new JFileChooser();
		jf.showOpenDialog(WindowFileChooser.this);
		filter = new FileNameExtensionFilter("TEXT FILES", "java", "text");
		jf.setFileFilter(filter);
	}
	
	public File checkFile() {
		File f = jf.getSelectedFile();
		while (f == null) {
			this.printWarningMessage("You must choose a .txt file format");
			jf.showOpenDialog(WindowFileChooser.this);
			jf.setFileFilter(filter);
			f = jf.getSelectedFile();
		}
		return f;
	}
	
	public void printWarningMessage(String message) {
		JOptionPane.showMessageDialog(null, message, "Warning message", JOptionPane.WARNING_MESSAGE);
	}

	public JFileChooser getJf() {
		return jf;
	}

	public void setJf(JFileChooser jf) {
		this.jf = jf;
	}

	public FileNameExtensionFilter getFilter() {
		return filter;
	}

	public void setFilter(FileNameExtensionFilter filter) {
		this.filter = filter;
	}
	
	

}
