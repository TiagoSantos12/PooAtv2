package br.ufpb.dcx.AtividadePoo2;

public class Fornecedor extends Pessoa  {
	private double ValorCredito;
	private double ValorDivida;
	
	public Fornecedor(String nome, String telefone, String endereco, double valorCredito, double valorDivida) {
		super(nome, telefone, endereco);
		ValorCredito = valorCredito;
		ValorDivida = valorDivida;
	}

	public double getValorCredito() {
		return ValorCredito;
	}

	public void setValorCredito(double valorCredito) {
		ValorCredito = valorCredito;
	}

	public double getValorDivida() {
		return ValorDivida;
	}

	public void setValorDivida(double valorDivida) {
		ValorDivida = valorDivida;
	}

	
	public double obterSaldo() {
		return ValorCredito - ValorDivida;
	}
	
	
}

