package br.com.eteczonaleste;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCadHardware extends TelaDeCadastro{
	
	JLabel lblDescricao = new JLabel("Descri��o");
	JTextField txtDescricao = new JTextField();
	
	JLabel lblPrUnit = new JLabel ("Pre�o unit�rio");
	JTextField txtPrUnit = new JTextField();
	
	JLabel lblQtdeAtual = new JLabel ("Quantidade atual");
	JTextField txtQtdeAtual = new JTextField();
	
	JLabel lblQtdeMin = new JLabel ("Quantidade m�nima");
	JTextField txtQtdeMin = new JTextField();
	
	public TelaCadHardware() {
		super(4,2);
		
		this.painelParaCampos.add(lblDescricao);
		this.painelParaCampos.add(txtDescricao);
		
		this.painelParaCampos.add(lblPrUnit);
		this.painelParaCampos.add(txtPrUnit);
		
		this.painelParaCampos.add(lblQtdeAtual);
		this.painelParaCampos.add(txtQtdeAtual);
		
		this.painelParaCampos.add(lblQtdeMin);
		this.painelParaCampos.add(txtQtdeMin);
	}
}
