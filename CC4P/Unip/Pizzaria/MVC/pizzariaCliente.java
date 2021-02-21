package CC4P.Unip.Pizzaria.MVC;

import CC4P.Unip.Pizzaria.MVC.controller.PizzariaController;
import CC4P.Unip.Pizzaria.MVC.model.PizzariaModel;
import CC4P.Unip.Pizzaria.MVC.view.PizzariaView;

public class pizzariaTeste {

	public static void main(String[] args) {

		PizzariaView view = new PizzariaView();
		view.initialize();
		view.getFrame().setVisible(true);
		PizzariaModel model = new PizzariaModel();
		@SuppressWarnings("unused")
		PizzariaController controller = new PizzariaController(view, model);

	}

}
