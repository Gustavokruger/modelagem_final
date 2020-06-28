package br.com.dominio.model;

public class IMCModel {
	private Double resultado;
	public void calcularIMC(Double peso, Double altura) {
		
		this.resultado = peso/(altura*altura);
		
	}
	public Double getResultado() {
		return resultado;
	}
}
