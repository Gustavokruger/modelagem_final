package br.com.dominio.view;

public class IMCView {
	private Double peso;
	private Double altura;
	
	public IMCView() {
		System.out.println("obtendo peso e altura...");
	}
	
	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	
	public void obterPesoEAltura(Double peso, Double altura) {
		
		this.setPeso(peso);
		this.setAltura(altura);
		
	}
}
