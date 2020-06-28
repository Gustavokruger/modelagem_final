package br.com.dominio;

import br.com.dominio.facade.ConsultaFacade;

public class Consulta {

	public static void main(String[] args) {
		
		ConsultaFacade facade = new ConsultaFacade();
		facade.consultarDados("83514510", "Gustavo Von Kruger");
	}

}
