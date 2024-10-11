package br.com.banco.creditobancario.model;

public abstract class Conta {
	private String numeroAgencia;
	private String numeroConta;
	private float credito;
	private float debito;
	private float saldo;
	private String cliente;
	
	
	
	public String getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public float getCredito() {
		return credito;
	}
	public void setCredito(float credito) {
		this.credito = credito;
	}
	public float getDebito() {
		return debito;
	}
	public void setDebito(float debito) {
		this.debito = debito;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	
	
	protected abstract void sacar(float valor);
	protected abstract void depositar(float valor);
	protected abstract void exibirSaldo();
}
