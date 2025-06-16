package conta6;

import java.util.ArrayList;

import conta6.contas.Conta;
import conta6.contas.ContaEspecial;

public class Agencia {

	private static int count = 1000;
	
	private final int codigo;
	
	private ArrayList<Conta> contas = new ArrayList<>();

	public Agencia() {
		this.codigo = ++count;
	}

	public int getCodigo() {
		return codigo;
	}

	private int nextNumero() {
		return contas.size() + 1;
	}
	
	public Conta abrirConta(Cliente titular) {
				
		Conta conta = new Conta(this, nextNumero(), titular);
		contas.add(conta);
		
		return conta;
	}

	public ContaEspecial abrirConta(Cliente titular, double limite) {
		
		ContaEspecial conta = new ContaEspecial(this, nextNumero(), titular, limite);
		contas.add(conta);
		
		return conta;
	}
	
	public double getSaldoAgencia() {
		
		double saldo = 0.0;
		
		for (Conta conta : contas) {
			saldo += conta.getSaldo();
		}
		
		return saldo;
	}
	
}
