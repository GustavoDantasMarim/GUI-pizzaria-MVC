package CC4P.Unip.Pizzaria.MVC.view;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class PizzariaView extends JFrame {

	private JFrame frame;

	// Preços Atribuidos em variáveis constantes
	static double zero = 0;

	// Preço Pepperone
	static double iPep = 15.00;
	static double rPep = 27.00;
	static double fPep = 33.00;
	// Preço Mussarela
	static double iMuss = 12.00;
	static double rMuss = 21.60;
	static double fMuss = 26.40;
	// Preço Supremo
	static double iSup = 17.00;
	static double rSup = 30.60;
	static double fSup = 37.40;
	// Preço Coberturas extras
	static double cBacon = 2.00;
	static double cCebola = 1.50;
	static double cChampignon = 2.50;
	static double cTomate = 1.00;
	static double cCatupiry = 3.00;
	static double cPresunto = 2.50;

	private JLabel saborPizza;
	private JLabel valorInd;
	private JLabel valorReg;
	private JLabel valorFam;
	private JLabel CoberExtra;
	private JLabel total;
	private JLabel totalPagar;
	// Sabor Pizza
	private JLabel peperone;
	private JLabel mussarela;
	private JLabel supreme;

	// Botao Tamanho da Pizza
	private JCheckBox indPepperoni;
	private JCheckBox regPepperoni;
	private JCheckBox famPepperoni;

	private JCheckBox indMussarela;
	private JCheckBox regMussarela;
	private JCheckBox famMussarela;

	private JCheckBox indSupreme;
	private JCheckBox regSupreme;
	private JCheckBox famSupreme;

	// Botão Cobertura Extra
	private JCheckBox coberBacon;
	private JCheckBox coberCebola;
	private JCheckBox coberChampignon;
	private JCheckBox coberTomate;
	private JCheckBox coberCatupiry;
	private JCheckBox coberPresunto;

	// Botão de compra
	private JButton btnComprar;

	// Inicialização/montagem da Tela
	public void initialize() {
		setFrame(new JFrame());
		getFrame().setTitle("Pizzaria UNIP");
		getFrame().getContentPane().setBackground(Color.LIGHT_GRAY);
		getFrame().setBounds(200, 200, 700, 500);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		getFrame().setResizable(false);

		saborPizza = new JLabel("Sabor ");
		saborPizza.setBounds(45, 15, 92, 23);
		getFrame().getContentPane().add(saborPizza);

		valorInd = new JLabel("Preço Individual");
		valorInd.setBounds(173, 15, 92, 23);
		getFrame().getContentPane().add(valorInd);

		valorReg = new JLabel("Preço Regular");
		valorReg.setBackground(Color.LIGHT_GRAY);
		valorReg.setBounds(293, 15, 92, 23);
		getFrame().getContentPane().add(valorReg);

		valorFam = new JLabel("Preço Família");
		valorFam.setBackground(Color.LIGHT_GRAY);
		valorFam.setBounds(410, 15, 92, 23);
		getFrame().getContentPane().add(valorFam);

		// Linha Peperone
		peperone = new JLabel("Peperone");
		peperone.setBackground(Color.LIGHT_GRAY);
		peperone.setBounds(45, 40, 125, 23);
		getFrame().getContentPane().add(peperone);

		indPepperoni = new JCheckBox("R$15,00");
		indPepperoni.setBounds(170, 40, 120, 25);
		getFrame().getContentPane().add(indPepperoni);

		regPepperoni = new JCheckBox("R$27,00");
		regPepperoni.setBounds(288, 40, 120, 25);
		getFrame().getContentPane().add(regPepperoni);

		famPepperoni = new JCheckBox("R$33,00");
		famPepperoni.setBounds(405, 40, 120, 25);
		getFrame().getContentPane().add(famPepperoni);

		// Linha Mussarela
		mussarela = new JLabel("Mussarela");
		mussarela.setBackground(Color.LIGHT_GRAY);
		mussarela.setBounds(45, 75, 125, 23);
		getFrame().getContentPane().add(mussarela);

		indMussarela = new JCheckBox("R$12,00");
		indMussarela.setBounds(170, 75, 120, 25);
		getFrame().getContentPane().add(indMussarela);

		regMussarela = new JCheckBox("R$21,60");
		regMussarela.setBounds(288, 75, 120, 25);
		getFrame().getContentPane().add(regMussarela);

		famMussarela = new JCheckBox("R$26,40");
		famMussarela.setBounds(405, 75, 120, 25);
		getFrame().getContentPane().add(famMussarela);

		// Linha Supreme
		supreme = new JLabel("Supreme");
		supreme.setBackground(Color.LIGHT_GRAY);
		supreme.setBounds(45, 110, 125, 23);
		getFrame().getContentPane().add(supreme);

		indSupreme = new JCheckBox("R$17,00");
		indSupreme.setBounds(170, 110, 120, 25);
		getFrame().getContentPane().add(indSupreme);

		regSupreme = new JCheckBox("R$30,60");
		regSupreme.setBounds(288, 110, 120, 25);
		getFrame().getContentPane().add(regSupreme);

		famSupreme = new JCheckBox("R$37,40");
		famSupreme.setBounds(405, 110, 120, 25);
		getFrame().getContentPane().add(famSupreme);

		// Linha Cobertura Extra
		CoberExtra = new JLabel("Coberturas Extras: ");
		CoberExtra.setBackground(Color.LIGHT_GRAY);
		CoberExtra.setBounds(45, 175, 125, 25);
		getFrame().getContentPane().add(CoberExtra);

		// L1
		coberBacon = new JCheckBox("Bacon: R$2,00");
		coberBacon.setBounds(170, 175, 125, 25);
		getFrame().getContentPane().add(coberBacon);

		coberCebola = new JCheckBox("Cebola: R$1,50");
		coberCebola.setBounds(295, 175, 125, 25);
		getFrame().getContentPane().add(coberCebola);

		coberChampignon = new JCheckBox("Champignon: R$2,50");
		coberChampignon.setBounds(417, 175, 150, 25);
		getFrame().getContentPane().add(coberChampignon);

		// L2
		coberTomate = new JCheckBox("Tomate: R$1,00");
		coberTomate.setBounds(170, 205, 125, 25);
		getFrame().getContentPane().add(coberTomate);

		coberCatupiry = new JCheckBox("Catupiry: R$3,00");
		coberCatupiry.setBounds(294, 205, 125, 25);
		getFrame().getContentPane().add(coberCatupiry);

		coberPresunto = new JCheckBox("Presunto: R$2,50");
		coberPresunto.setBounds(417, 205, 125, 25);
		getFrame().getContentPane().add(coberPresunto);

		// L3
		btnComprar = new JButton("Comprar");
		btnComprar.setBounds(285, 250, 125, 25);
		getFrame().getContentPane().add(btnComprar);
		btnComprar.setActionCommand("ConcluirCompra");
		
		// Botão Pagar
		total = new JLabel("Total a pagar: R$ ");
		total.setBounds(285, 280, 125, 25);
		getFrame().getContentPane().add(total);

		// Label com o valor resultante
		totalPagar = new JLabel("0");
		totalPagar.setBounds(385, 280, 125, 25);
		getFrame().getContentPane().add(totalPagar);

	}

	// Pepperoni
	public double getIndPepperoni() {
		if (indPepperoni.isSelected() == true) {
			return iPep;
		} else {
			return zero;
		}
	}

	public double getRegPepperoni() {
		if (regPepperoni.isSelected() == true) {
			return rPep;
		} else {
			return zero;
		}
	}

	public double getFamPepperoni() {
		if (famPepperoni.isSelected() == true) {
			return fPep;
		} else {
			return zero;
		}
	}

	// Mussarela
	public double getIndMussarela() {
		if (indMussarela.isSelected() == true) {
			return iMuss;
		} else {
			return zero;
		}
	}

	public double getRegMussarela() {
		if (regMussarela.isSelected() == true) {
			return rMuss;
		} else {
			return zero;
		}
	}

	public double getFamMussarela() {
		if (famMussarela.isSelected() == true) {
			return fMuss;
		} else {
			return zero;
		}
	}

	// Supreme
	public double getIndSupreme() {
		if (indSupreme.isSelected() == true) {
			return iSup;
		} else {
			return zero;
		}
	}

	public double getRegSupreme() {
		if (regSupreme.isSelected() == true) {
			return rSup;
		} else {
			return zero;
		}
	}

	public double getFamSupreme() {
		if (famSupreme.isSelected() == true) {
			return fSup;
		} else {
			return zero;
		}
	}

	// Coberturas extras
	public double getBacon() {
		if (coberBacon.isSelected() == true) {
			return cBacon;
		} else {
			return zero;
		}
	}

	public double getCebola() {
		if (coberCebola.isSelected() == true) {
			return cCebola;
		} else {
			return zero;
		}
	}

	public double getChampignon() {
		if (coberChampignon.isSelected() == true) {
			return cChampignon;
		} else {
			return zero;
		}
	}

	public double getTomate() {
		if (coberTomate.isSelected() == true) {
			return cTomate;
		} else {
			return zero;
		}
	}

	public double getCatupiry() {
		if (coberCatupiry.isSelected() == true) {
			return cCatupiry;
		} else {
			return zero;
		}
	}

	public double getPresunto() {
		if (coberPresunto.isSelected() == true) {
			return cPresunto;
		} else {
			return zero;
		}
	}

	// Resultado
	public double getResultado() {
		return Double.parseDouble(totalPagar.getText());
	}

	public void setResultado(double resultado) {
		totalPagar.setText(String.format("%.2f", resultado)); // Formatando a saída do resultado com 2 casas decimais
	}

	// Listener do acionamento do botão de compra
	public void addPizzariaListener(ActionListener listenParaBotaoComprar) {
		btnComprar.addActionListener(listenParaBotaoComprar);
	}

	// Mensagem de Erro
	public void mostrarErro(String erro) {
		JOptionPane.showMessageDialog(this, erro);
	}

	// Get/Set do JFrame
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

}
