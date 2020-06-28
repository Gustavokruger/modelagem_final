package br.com.dominio.strategy;

public class CalculadoraContext {
	CalculadoraStrategy calculadora;
	
	public CalculadoraContext(CalculadoraStrategy calculadora) {
		this.calculadora = calculadora;
	}
	
	public Double calcular(Double numero1, Double numero2) {
		return calculadora.efetuarOperacao(numero1, numero2);
	}
}
