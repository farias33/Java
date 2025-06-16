package conta6.contas;

import java.util.Date;

public class Transacao {

	private final ETipoOperacao tipoOperacao;
	private final Date data;
	private final double valor;

	public Transacao(ETipoOperacao tipoOperacao, double valor) {
		this.tipoOperacao = tipoOperacao;
		this.data = new Date();
		this.valor = valor;
	}

	public ETipoOperacao getTipoOperacao() {
		return tipoOperacao;
	}

	public Date getData() {
		return data;
	}

	public double getValor() {
		return valor;
	}

}
