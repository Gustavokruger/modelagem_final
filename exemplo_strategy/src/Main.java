import br.com.dominio.startegy.operacoes.Dividir;
import br.com.dominio.startegy.operacoes.Multiplicar;
import br.com.dominio.startegy.operacoes.Somar;
import br.com.dominio.startegy.operacoes.Subtrair;
import br.com.dominio.strategy.CalculadoraContext;

public class Main {

	public static void main(String[] args) {
		CalculadoraContext calculadora = new CalculadoraContext(new Dividir());
		
		System.out.println(calculadora.calcular(4.0, 2.0 ));
		
		calculadora  = new CalculadoraContext(new Multiplicar());
		
		System.out.println(calculadora.calcular(4.0, 2.0 ));		
		calculadora  = new CalculadoraContext(new Subtrair());
		
		System.out.println(calculadora.calcular(4.0, 2.0 ));		
		calculadora  = new CalculadoraContext(new Somar());
		
		System.out.println(calculadora.calcular(4.0, 2.0));	}

}
