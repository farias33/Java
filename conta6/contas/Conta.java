package conta6.contas;

import java.util.ArrayList;

import conta6.Agencia;
import conta6.Cliente;

public class Conta {

	private final Agencia agencia;
	private final int numero;
	private final Cliente titular;

	private ArrayList<Transacao> transacoes = new ArrayList<>();

	public Conta(Agencia agencia, int numero, Cliente titular) {
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public double getSaldo() {

		double saldo = 0.0;

		for (Transacao transacao : transacoes) {

			if (transacao.getTipoOperacao() == ETipoOperacao.CREDITO)
				saldo += transacao.getValor();
			else if (transacao.getTipoOperacao() == ETipoOperacao.DEBITO)
				saldo -= transacao.getValor();
		}

		return saldo;
	}

	public void depositar(double valor) {

		if (valor <= 0) {
			System.out.println("Valor para deposito deve ser maior que zero");
			return;
		}

		addTransacao(ETipoOperacao.CREDITO, valor);
	}

	public void sacar(double valor) {

		if (valor <= 0) {
			System.out.println("Valor para saque deve ser maior que zero");
			return;
		}

		if (valor > getSaldo()) {
			System.out.println("Saldo insuficiente");
			return;
		}

		addTransacao(ETipoOperacao.DEBITO, valor);
	}

	protected void addTransacao(ETipoOperacao tipo, double valor) {
		Transacao t = new Transacao(tipo, valor);
		transacoes.add(t);		
	}
	
	public StringBuilder listarExtrato() {

		StringBuilder sb = new StringBuilder();

		sb.append("\nAgencia Codigo: " + getAgencia().getCodigo());
		sb.append("\nConta Numero: " + getNumero());
		sb.append("\nTitular: " + titular.getCpf() + " - " + titular.getNome());

		sb.append("\n\nListagem");
		for (Transacao t : transacoes) {
			sb.append("\n" + t.getData() + "\t" + t.getValor() + " " + t.getTipoOperacao());
		}

		sb.append("\n\nSALDO: " + getSaldo());

		return sb;
	}

}
