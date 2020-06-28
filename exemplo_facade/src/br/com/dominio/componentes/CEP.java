package br.com.dominio.componentes;

public class CEP {
	public String numero;
	public String cidade;
	public String estado;
	
	public CEP() {
		return;
	}
	
	public CEP consultarNaApi(String numero) {
		System.out.println("consultando dados do CEP na API...");
		
		this.numero = numero;
		this.cidade = "Almirante Tamandaré";
		this.estado = "Paraná";
		
		return this;
		
	}
	
}
