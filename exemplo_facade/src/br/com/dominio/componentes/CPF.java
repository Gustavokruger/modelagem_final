package br.com.dominio.componentes;


public class CPF {
	public String numero;
	public String nome;
	public String dataEmissao;
	public String estado;
	
	public CPF() {
		return;
	}
	
	public CPF consultarNaApi(String numero) {
		System.out.println("consultando dados do CPF na API...");
		
		this.numero = numero;
		this.nome = "Gustavo Von Kruger";
		this.dataEmissao = "10/12/2017";
		this.estado = "Paraná";
		return this;
	}
}
