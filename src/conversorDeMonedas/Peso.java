package conversorDeMonedas;

import javax.swing.JOptionPane;

public class Peso {
	
	public void PesoADolar(double valor) {//
		double pesoDolar = valor *0.0029;
		pesoDolar = (double) Math.round(pesoDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Es igual a $ " +pesoDolar+ " Dolares, Estadounidenses.");
	}
	
	public void PesoAEuro(double valor) {
		double pesoEuro = valor *0.0026;
		pesoEuro = (double) Math.round(pesoEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +pesoEuro+ " Euros, Europeos.");
	}
	
	public void PesoALibra(double valor) {
		double pesoLibra = valor *0.0022;
        pesoLibra = (double) Math.round(pesoLibra *100d)/100;
       JOptionPane.showMessageDialog(null, "Tienes $ " +pesoLibra+ " Libras Esterlinas.");
	}
	
	public void PesoAYen(double valor) {
		double pesoYen = valor *0.41;
        pesoYen = (double) Math.round(pesoYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +pesoYen+ " Yenes, Japoneses.");
	}
	
	public void PesoAWon(double valor) {
		double monedaWon = valor *3.81;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Wones, Sur Coreanos.");
	}
}



