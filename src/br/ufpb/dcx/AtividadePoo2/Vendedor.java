package br.ufpb.dcx.AtividadePoo2;

public class Vendedor extends Empregado {

	private double ValorVenda;
	private double Comissão;
	
	public Vendedor(String nome, String telefone, String endereco, double salario, double valorVends, double comissão) {
		super(nome, telefone, endereco, salario);
		ValorVenda = valorVends;
		Comissão = comissão;
	}

	public double getValorVends() {
		return ValorVenda;
	}

	public void setValorVends(double valorVends) {
		ValorVenda = valorVends;
	}

	public double getComissão() {
		return Comissão;
	}

	public void setComissão(double comissão) {
		Comissão = comissão;
	}
	
	public double CalcularSalario() {
		return this.getSalario() + ValorVenda * Comissão;
	}
	
	
	
	

}
