package conversorDeMonedas;

import javax.swing.JOptionPane;

public class Won {

	public void WonAPeso(double valor) {
		double wonPeso = valor * 0.26;
		wonPeso = (double) Math.round(wonPeso *100d)/100;
        JOptionPane.showMessageDialog(null, "Es igual a $ " +wonPeso+ " Pesos, Argentinos.");
	}

	public void WonAEuro(double valor) {
		double wonEuro = valor *0.00069;
		wonEuro = (double) Math.round(wonEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +wonEuro+ " Euros, Europeos.");
	}
	
	public void WonALibra(double valor) {
		double wonLibra = valor *0.0000059;
        wonLibra = (double) Math.round(wonLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +wonLibra+ " Libras Esterlinas.");
	}
	
	public void WonAYen(double valor) {
		double wonYen = valor *0.11;
        wonYen = (double) Math.round(wonYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +wonYen+ " Yenes, Japoneses.");
	}
	
	public void WonADolar(double valor) {
		double wonDolar = valor *0.00075;
        wonDolar = (double) Math.round(wonDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +wonDolar+ " Dolares, Estadounidenses.");
	}
}

