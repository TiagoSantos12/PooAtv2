package br.ufpb.dcx.AtividadePoo2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Executavel {
	private static Scanner leitor;

	public static void main(String[]args) {
		leitor = new Scanner(System.in);
		Fornecedor novo = new Fornecedor("",""," ",0.0,0.0);
		Administrador adm = new Administrador("", "", " ",0.0,0.0);
		Vendedor vendas = new Vendedor("","","",0.0,0.0,0.0);
		
		boolean sair = false;
		while (!sair) {
			int opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"Digite uma op��o:\n1.Acessar Administra��o.\n"
							+"2.Acessar Fornecedores\n"
							+ "3.Acessar Vendas"
							+"\n4.Sair\n"));
			switch(opcao) {
			case 1:
		
			System.out.println("Valor em Credito do cliente?");
			double salario = leitor.nextDouble();
			String telefonepessoa = JOptionPane.showInputDialog("Qual o telefone da pessoa? " );
			String enderecopessoa = JOptionPane.showInputDialog("Qual o endere�o da pessoa?");
			adm.setSalario(salario);
			adm.setEndereco(enderecopessoa);
			adm.setTelefone(telefonepessoa);
			System.out.println(adm.toString());
			System.out.printf("SeuSaldo: R$" +adm.CalcularSalario());
			break;
			case 2:
			
			String nome = JOptionPane.showInputDialog("Qual o nome da pessoa ?");
			String telefone = JOptionPane.showInputDialog("Qual o telefone da pessoa? " );
			String endereco = JOptionPane.showInputDialog("Qual o endere�o da pessoa?");
			System.out.println("Valor em Credito do cliente?");
			double credito = leitor.nextDouble();
			System.out.println("Divida Do cliente? \n");
			double divida = 	leitor.nextDouble();
			novo.setNome(nome);
			novo.setTelefone(telefone);
			novo.setEndereco(endereco);
			novo.setValorCredito(credito);
			novo.setValorDivida(divida);
			System.out.println("Cr�dito: R$" +novo.getValorCredito()+"   D�vida: R$"+novo.getValorDivida() + "\n");
			System.out.printf("Saldo: R$" +novo.obterSaldo() + "\n");
			System.out.println("\n" + novo.toString());
			break;
			case 3:
		
			String nomevendas = JOptionPane.showInputDialog("Qual o nome da pessoa ?");
			String telefonevendas = JOptionPane.showInputDialog("Qual o telefone da pessoa? " );
			String enderecovendas = JOptionPane.showInputDialog("Qual o endere�o da pessoa?");
			System.out.println("Valor do salario da pessoa?");
			double salariovendas = leitor.nextDouble();
			System.out.println("Valor do Valor de vendas da pessoa?");
			double valorVendas = leitor.nextDouble();
			System.out.println("Valor das comi��es do cliente ?");
			double comicaovendas = leitor.nextDouble();
			vendas.setNome(nomevendas);
			vendas.setTelefone(telefonevendas);
			vendas.setEndereco(enderecovendas);
			vendas.setValorVends(valorVendas);
			vendas.setComiss�o(comicaovendas);
			vendas.setSalario(salariovendas);
			System.out.println(vendas.toString());
			System.out.printf("Seu Saldo: R$" +vendas.CalcularSalario());
			break;
			 case 4:
					sair = true;
					break;
			}
		}
	}
}