package br.com.banco.creditobancario.teste;

import br.com.banco.creditobancario.model.ContaCorrente;
import br.com.banco.creditobancario.model.ContaPoupanca;
/*
 * Check Point 2 – Primeiro Semestre

Turma: 2ESPR
Disciplina: Domain Driven Design com Java

Questões para avaliação

Domínio da empresa: www.banco.com.br

Nome do sistema: Crédito Bancário

	•	Crie os pacotes com a semântica e convenção de nomenclatura correta.
	Nota: 10 (10 pontos)
	Comentário: OK.

	•	Crie uma classe para Conta Corrente com os campos: numeroAgencia, numeroConta, credito, debito, saldo, limite e cliente.
	Nota: 10 (10 pontos)
	Comentário: OK.

	•	Crie uma classe para Conta Poupança com os campos: numeroAgencia, numeroConta, credito, debito, saldo, rendimento e cliente.
	Nota: 10 (10 pontos)
	Comentário: OK.

	•	Crie uma classe Conta e normalize os campos comuns das classes Conta Corrente e Conta Poupança, aplicando o conceito de Herança. O saldo deve apenas ser visualizado e alterado pela superclasse e classes filhas.
	Nota: 15 (20 pontos)
	Comentário: Os métodos de saldo estão público.

	•	Na classe Conta crie um método para sacar, depositar e exibir o saldo. Deixe obrigatório a sobrescrita dos métodos nas classes filhas.
	Nota: 10 (10 pontos)
	Comentário: OK.

	•	Implemente nas subclasses as regras para sacar e depositar no sistema. Regra: Ao sacar ou depositar um valor o campo saldo deve ser alterado.
	Nota: 20 (20 pontos)
	Comentário: OK.

	•	Crie uma classe que implemente os testes e que possa ser verificado o comportamento de todos os métodos: sacar, depositar e exibir o saldo.
	Nota: 20 (20 pontos)
	Comentário: OK.

	Total: 95 pontos

 *
 */
public class Teste {

	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente("12345", "3542", "Enzo");
		
		contaCorrente.exibirSaldo();
		contaCorrente.depositar(100);
		contaCorrente.depositar(200);
		contaCorrente.sacar(150);

		System.out.println("_________________________________________________________\n");
		
		ContaPoupanca contaPoupanca = new ContaPoupanca("12345", "3542", "Enzo");
		
		contaPoupanca.exibirSaldo();
		contaPoupanca.depositar(100);
		contaPoupanca.depositar(200);
		contaPoupanca.sacar(150);
	}

}
