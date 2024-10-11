package br.com.banco.creditobancario.model;

public class ContaCorrente extends Conta {
	private float limite;

	
	
	public ContaCorrente() {
		super();
	}
	
	public ContaCorrente(String numeroAgencia, String numeroConta, String cliente) {
		super();

		this.setNumeroAgencia(numeroAgencia);
		this.setNumeroConta(numeroConta);
		this.setCliente(cliente);
		this.setSaldo(0);
	}
	
	
	
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	
	@Override
	public void sacar(float valor) {
		if (this.getSaldo() < valor) {
			System.out.println("Saldo da Conta Corrente insuficiente!");
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
		System.out.println("Saldo da Conta Corrente atual: R$" + this.getSaldo());
	}
}
