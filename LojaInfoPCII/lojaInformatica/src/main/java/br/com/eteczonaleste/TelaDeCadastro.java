package br.com.eteczonaleste;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public abstract class TelaDeCadastro extends JPanel{
	
	JPanel painelDeBotoes = new JPanel();
	JPanel painelParaCampos = new JPanel();
	JPanel painelListagem = new JPanel();
	JButton btnSalvar = new JButton("Salvar");
	JButton btnLimpar = new JButton("Limpar");
	JButton btnCancelar = new JButton("Cancelar");
	JButton btnListar = new JButton ("Listar");
	JButton btnAlterar = new JButton("Alterar");
	JTextField txtId = new JTextField("Digite ID para alterar");

	public TelaDeCadastro (int nLinhas, int nColunas){
		
		BorderLayout borderLayout = new BorderLayout();
		this.setLayout(borderLayout);
		
			GridLayout layoutParaCampos = new GridLayout(nLinhas, nColunas);
			painelParaCampos.setLayout(layoutParaCampos);
			this.add(painelParaCampos, BorderLayout.CENTER);
			
			this.painelDeBotoes = new JPanel();
			this.btnSalvar = new JButton("Salvar");
			this.btnLimpar = new JButton("Limpar");
			this.btnCancelar = new JButton("Cancelar");
			this.painelDeBotoes.add(btnSalvar);
			this.painelDeBotoes.add(btnLimpar);
			this.painelDeBotoes.add(btnCancelar);
			this.painelDeBotoes.add(btnListar);
			this.painelDeBotoes.add(btnAlterar);
			this.painelDeBotoes.add(txtId);
			
			this.add(painelDeBotoes, BorderLayout.SOUTH);
	}	
}
