package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class ShowPanel extends JPanel{
	
	private JLabel labelResult;

	private JTextArea txtAreaShow;
	
	private JTextArea txtAreaShowResult;
	
	private JPanel panelShowCode;
	
	private JPanel panelShowResult;


	public ShowPanel() {
		setLayout(new GridLayout(1, 2));
		labelResult = new JLabel();
		txtAreaShow = new JTextArea();
		panelShowCode = new JPanel();
		panelShowCode.setLayout(new BorderLayout());
		panelShowCode.add(txtAreaShow);
		txtAreaShowResult = new JTextArea();
		panelShowResult = new JPanel();
		panelShowResult.setLayout(new BorderLayout());
		panelShowResult.add(txtAreaShowResult);
		TitledBorder titledBorder = BorderFactory.createTitledBorder("Código");
        panelShowCode.setBorder(titledBorder);
        TitledBorder titledBorder2 = BorderFactory.createTitledBorder("Resultado");
        panelShowResult.setBorder(titledBorder2);
		this.add(panelShowCode);
		this.add(panelShowResult);

	}

	public JLabel getLabelResult() {
		return labelResult;
	}

	public void setLabelResult(JLabel labelResult) {
		this.labelResult = labelResult;
	}

	public JTextArea getTxtAreaShow() {
		return txtAreaShow;
	}

	public void setTxtAreaShow(JTextArea txtAreaShow) {
		this.txtAreaShow = txtAreaShow;
	}

	public JTextArea getTxtAreaShowResult() {
		return txtAreaShowResult;
	}

	public void setTxtAreaShowResult(JTextArea txtAreaShowResult) {
		this.txtAreaShowResult = txtAreaShowResult;
	}

	public JPanel getPanelShowCode() {
		return panelShowCode;
	}

	public void setPanelShowCode(JPanel panelShowCode) {
		this.panelShowCode = panelShowCode;
	}

	public JPanel getPanelShowResult() {
		return panelShowResult;
	}

	public void setPanelShowResult(JPanel panelShowResult) {
		this.panelShowResult = panelShowResult;
	}
	
	



}
