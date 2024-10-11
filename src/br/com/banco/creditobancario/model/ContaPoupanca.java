package br.com.banco.creditobancario.model;

public class ContaPoupanca extends Conta {
	private float rendimento;

	
	
	public ContaPoupanca() {
		super();
	}
	
	public ContaPoupanca(String numeroAgencia, String numeroConta, String cliente) {
		super();

		this.setNumeroAgencia(numeroAgencia);
		this.setNumeroConta(numeroConta);
		this.setCliente(cliente);
		this.setSaldo(0);
	}
	
	
	
	public float getRendimento() {
		return rendimento;
	}
	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}
	
	
	
	@Override
	public void sacar(float valor) {
		if (this.getSaldo() < valor) {
			System.out.println("Saldo da Conta Pupança insuficiente!");
		}
		else {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("R$" + valor + " sacado!");
			this.exibirSaldo();
		}
	}
	
	@Override
	public void depositar(float valor) {
		this.setSaldo(this.getSaldo() + valor);
		System.out.println("R$" + valor + " depositado!");
		this.exibirSaldo();
	}
	
	@Override
	public void exibirSaldo() {
		System.out.println("Saldo da Conta Pupança atual: R$" + this.getSaldo());
	}
}
