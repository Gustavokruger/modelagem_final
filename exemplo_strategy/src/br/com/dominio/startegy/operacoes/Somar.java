package br.com.dominio.startegy.operacoes;

import br.com.dominio.strategy.CalculadoraStrategy;

public class Somar implements CalculadoraStrategy {

	@Override
	public Double efetuarOperacao(Double numero1, Double numero2) {
		// TODO Auto-generated method stub
		return numero1 + numero2;
	}

}
