package br.com.eteczonaleste;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCadVendas extends TelaDeCadastro{
	
	Vendas vendas = new Vendas();
	
	JLabel lblIDCliente = new JLabel("ID Cliente");
	JTextField txtIDCliente = new JTextField();
	
	JLabel lblIDVenda = new JLabel("ID Venda");
	JTextField txtIDVenda = new JTextField();
	
	JLabel lblData = new JLabel("Data");
	JTextField txtData = new JTextField();
	
	JLabel lblValorTotal = new JLabel("Valor total");
	JTextField txtValorTotal = new JTextField();
	
	JLabel lblDesc = new JLabel("Desconto");
	JTextField txtDesc = new JTextField();
	
	JLabel lblVlrPago = new JLabel ("Valor pago");
	JTextField txtVlrPago = new JTextField();
	
	public TelaCadVendas() {
		super(12, 2);
		
		this.painelParaCampos.add(lblIDCliente);
		this.painelParaCampos.add(txtIDCliente);

		this.painelParaCampos.add(lblIDVenda);
		this.painelParaCampos.add(txtIDVenda);

		this.painelParaCampos.add(lblData);
		this.painelParaCampos.add(txtData);

		this.painelParaCampos.add(lblValorTotal);
		this.painelParaCampos.add(txtValorTotal);

		this.painelParaCampos.add(lblDesc);
		this.painelParaCampos.add(txtDesc);

		this.painelParaCampos.add(lblVlrPago);
		this.painelParaCampos.add(txtVlrPago);
	}
}
