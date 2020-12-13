package CC4P.Unip.Pizzaria.MVC.model;

public class PizzariaModel {

	private double resultado;

	// Função de soma dos valores 
	public void soma(double indPep, double regPep, double famPep, double indMus, double regMus, double famMus,
			double indSup, double regSup, double famSup, double extBacon, double extCebola, double extChamp,
			double extTom, double extCat, double extPres) {
		resultado = indPep + regPep + famPep + indMus + regMus + famMus + indSup + regSup + famSup + extBacon
				+ extCebola + extChamp + extTom + extCat + extPres;
	}
	
	public double getResultado() {
		return resultado;
	}
}
