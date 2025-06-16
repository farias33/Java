package conta6.contas;

import conta6.Agencia;
import conta6.Cliente;

public class ContaEspecial extends Conta {

	private double limite;

	public ContaEspecial(Agencia agencia, int numero, Cliente titular, double limite) {
		super(agencia, numero, titular);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public void sacar(double valor) {

		if (valor <= 0) {
			System.out.println("Valor para saque deve ser maior que zero");
			return;
		}

		if (valor > getSaldo() + getLimite()) {
			System.out.println("Saldo insuficiente");
			return;
		}

		addTransacao(ETipoOperacao.DEBITO, valor);
	}

}
