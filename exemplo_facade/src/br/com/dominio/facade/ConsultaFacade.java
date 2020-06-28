package br.com.dominio.facade;

import br.com.dominio.componentes.CEP;
import br.com.dominio.componentes.CPF;

public class ConsultaFacade {
	private CPF cpf;
	private CEP cep;
	
	public ConsultaFacade() {
		this.cpf = new CPF();
		this.cep = new CEP();
	}
	
	public void consultarDados(String nome, String numero) {
		System.out.println("consultando dados...");
		
		this.cep.consultarNaApi(nome);
		this.cpf.consultarNaApi(numero);
		
		System.out.println("dados recebidos: \n");
		System.out.println("CEP: \n");
		System.out.println(this.cep.cidade + "\n");
		System.out.println(this.cep.estado + "\n");
		
		
		System.out.println("\nCPF: \n");
		System.out.println(this.cpf.nome + "\n");
		System.out.println(this.cpf.dataEmissao + "\n");
		System.out.println(this.cpf.estado + "\n");
	}
}
