package conta6;

import conta6.contas.Conta;
import conta6.contas.ContaEspecial;

public class TesteConta {

	public static void main(String[] args) {
		
		Agencia a1 = new Agencia();
		
		Cliente x1 = new Cliente("12345678901", "Jose da Silva");
		Cliente x2 = new Cliente("22222222222", "Maria da Silva");

		Conta c1 = a1.abrirConta(x1);
		Conta c2 = a1.abrirConta(x2, 2000.0);
		
		c1.depositar(5000);
		c1.sacar(2500);
		c1.sacar(-1000);
		c1.sacar(2500);
		c1.sacar(500);
		c1.depositar(2000);
		
		c2.depositar(5000.0);
		c2.sacar(2000);
		c2.sacar(4000);
		
		System.out.println(c1.listarExtrato());
		System.out.println(c2.listarExtrato());
		
		System.out.println("\n\nSaldo da Agencia: " + a1.getSaldoAgencia());
	}
}
