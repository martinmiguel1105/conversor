package conversorDeMonedas;

import javax.swing.JOptionPane;

public class Libra {

	public void LibraAPeso(double valor) {
		double libraPeso = valor * 445.56;
		libraPeso = (double) Math.round(libraPeso *100d)/100;
        JOptionPane.showMessageDialog(null, "Es igual a $ " +libraPeso+ " Pesos Argentinos");
	}

	public void LibraAEuros(double valor) {
		double libraEuro = valor / 4050.48;
		libraEuro = (double) Math.round(libraEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +libraEuro+ " Euros");
	}
	
	public void LibraADolar(double valor) {
		double libraDolar = valor / 4890.52;
        libraDolar = (double) Math.round(libraDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +libraDolar+ " Libras Esterlinas");
	}
	
	public void LibraAYen(double valor) {
		double libraYen = valor / 29.68;
        libraYen = (double) Math.round(libraYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +libraYen+ " Yuanes");
	}
	
	public void LibraAWon(double valor) {
		double libraWon = valor / 3.04;
        libraWon = (double) Math.round(libraWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +libraWon+ " Wons");
	}
}

