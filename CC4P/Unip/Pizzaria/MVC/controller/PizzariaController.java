package CC4P.Unip.Pizzaria.MVC.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CC4P.Unip.Pizzaria.MVC.model.PizzariaModel;
import CC4P.Unip.Pizzaria.MVC.view.PizzariaView;

public class PizzariaController {

	private PizzariaView pizzariaView;
	private PizzariaModel pizzariaModel;

	public PizzariaController(PizzariaView view, PizzariaModel model) {
		this.pizzariaView = view;
		this.pizzariaModel = model;
		this.pizzariaView.addPizzariaListener(new PizzariaListener());
	}

	class PizzariaListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			// Setando os atributos com valor inicial = 0
			double indPep = 0, regPep = 0, famPep = 0, indMus = 0, regMus = 0, famMus = 0, indSup = 0, regSup = 0,
					famSup = 0, extBacon = 0, extCebola = 0, extChamp = 0, extTom = 0, extCat = 0, extPres = 0;

			try {

				//
				indPep = pizzariaView.getIndPepperoni();
				indMus = pizzariaView.getIndMussarela();
				indSup = pizzariaView.getIndSupreme();

				regPep = pizzariaView.getRegPepperoni();
				regMus = pizzariaView.getRegMussarela();
				regSup = pizzariaView.getRegSupreme();

				famPep = pizzariaView.getFamPepperoni();
				famMus = pizzariaView.getFamMussarela();
				famSup = pizzariaView.getFamSupreme();

				extBacon = pizzariaView.getBacon();
				extCebola = pizzariaView.getCebola();
				extChamp = pizzariaView.getChampignon();
				extTom = pizzariaView.getTomate();
				extCat = pizzariaView.getCatupiry();
				extPres = pizzariaView.getPresunto();

				if (e.getActionCommand() == "ConcluirCompra") {
					pizzariaModel.soma(indPep, regPep, famPep, indMus, regMus, famMus, indSup, regSup, famSup, extBacon,
							extCebola, extChamp, extTom, extCat, extPres);
					pizzariaView.setResultado(pizzariaModel.getResultado());
				}

			} catch (Exception e2) {
				pizzariaView.mostrarErro("Colocar Quantidade");
			}

		}
	}

}
