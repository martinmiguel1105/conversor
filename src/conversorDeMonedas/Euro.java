package conversorDeMonedas;

import javax.swing.JOptionPane;

public class Euro {

	public void EuroAPeso(double valor) {
		double euroPeso = valor *379.59 ;
		euroPeso = (double) Math.round(euroPeso *100d)/100;
        JOptionPane.showMessageDialog(null, "Es igual a $ " +euroPeso+ " Pesos, Argentinos.");
	}

	public void EuroADolar(double valor) {
		double euroDolar = valor *1.09;
		euroDolar = (double) Math.round(euroDolar *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +euroDolar+ " Euros, Europeos.");
	}
	
	public void EuroALibra(double valor) {
		double euroLibra = valor *0.85;
        euroLibra = (double) Math.round(euroLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +euroLibra+ " Libras Esterlinas");
	}
	
	public void EuroAYen(double valor) {
		double euroYen = valor *157.75;
		euroYen= (double) Math.round(euroYen*100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +euroYen+ " Yuanes");
	}
	
	public void EuroAWon(double valor) {
		double euroWon = valor *1435.62;
		euroWon = (double) Math.round(euroWon*100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +euroWon+ " Wons");
	}
}