package br.ufpb.dcx.AtividadePoo2;

public class Administrador extends Empregado {
	private double AjudaDeCusto;


	public Administrador(String nome, String telefone, String endereco, double salario, double ajudaDeCusto) {
		super(nome, telefone, endereco, salario);
		AjudaDeCusto = ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return AjudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		AjudaDeCusto = ajudaDeCusto;
	}

	public double CalcularSalario() {
		return this.getSalario() + AjudaDeCusto;
	}
}

