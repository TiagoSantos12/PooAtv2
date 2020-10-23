package br.ufpb.dcx.AtividadePoo2;

public class Vendedor extends Empregado {

	private double ValorVenda;
	private double Comiss�o;
	
	public Vendedor(String nome, String telefone, String endereco, double salario, double valorVends, double comiss�o) {
		super(nome, telefone, endereco, salario);
		ValorVenda = valorVends;
		Comiss�o = comiss�o;
	}

	public double getValorVends() {
		return ValorVenda;
	}

	public void setValorVends(double valorVends) {
		ValorVenda = valorVends;
	}

	public double getComiss�o() {
		return Comiss�o;
	}

	public void setComiss�o(double comiss�o) {
		Comiss�o = comiss�o;
	}
	
	public double CalcularSalario() {
		return this.getSalario() + ValorVenda * Comiss�o;
	}
	
	
	
	

}
