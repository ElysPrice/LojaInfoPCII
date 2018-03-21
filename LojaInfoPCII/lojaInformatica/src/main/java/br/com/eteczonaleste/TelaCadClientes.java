package br.com.eteczonaleste;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class TelaCadClientes extends TelaDeCadastro{
	
	
	JLabel lblNome = new JLabel("Nome");
	JTextField txtNome = new JTextField();
	
	JLabel lblEndereco = new JLabel ("Endere�o");
	JTextField txtEndereco = new JTextField();
	
	JLabel lblTelefone = new JLabel("Telefone");
	JTextField txtTelefone = new JTextField();
	
	JLabel lblEmail = new JLabel("Email");
	JTextField txtEmail = new JTextField();
	
	public TelaCadClientes(){
		super(4, 2);
		
		this.painelParaCampos.add(lblNome);
		this.painelParaCampos.add(txtNome);
		
		this.painelParaCampos.add(lblEndereco);
		this.painelParaCampos.add(lblEndereco);
		
		this.painelParaCampos.add(lblTelefone);
		this.painelParaCampos.add(txtTelefone);
		
		this.painelParaCampos.add(lblEmail);
		this.painelParaCampos.add(txtEmail);
		System.out.println("Terminando de adicionar os campos, adiciona agora ActionListener...");
		
		/*JScrollPane listScroller = new JScrollPane(list);
		listScroller.setPreferredSize(new Dimension (250, 80));
		this.painelListagem.add(list);*/
		
		this.btnLimpar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//TelaCadClientes.this.limparFormulario();
			}
		});
		
		;
	}
}
