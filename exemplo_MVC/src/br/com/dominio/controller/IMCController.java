package br.com.dominio.controller;

import br.com.dominio.model.IMCModel;
import br.com.dominio.view.IMCView;

public class IMCController {
	private IMCView view;
	private IMCModel model;
	
	public IMCController(IMCView view, IMCModel model) {
		this.view = view;
		this.model = model;
		
	}
	public Double obterResultado() {
		this.model.calcularIMC(this.view.getPeso(), this.view.getAltura());
		return this.model.getResultado();
	}
}
