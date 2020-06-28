import br.com.dominio.controller.IMCController;
import br.com.dominio.model.IMCModel;
import br.com.dominio.view.IMCView;

public class IMC {

	public static void main(String[] args) {
		IMCView view = new IMCView();
		IMCModel model = new IMCModel();
		
		view.obterPesoEAltura(70.0, 1.80);
		
		IMCController controller = new IMCController(view,model);
		System.out.println(controller.obterResultado());
	}

}
