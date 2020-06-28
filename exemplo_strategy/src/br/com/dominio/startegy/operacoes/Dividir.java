package br.com.dominio.startegy.operacoes;

import br.com.dominio.strategy.CalculadoraStrategy;

public class Dividir implements CalculadoraStrategy {

	@Override
	public Double efetuarOperacao(Double numero1, Double numero2) {
	
		return numero1/numero2;
	}

}
