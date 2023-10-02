package conversorDeMonedas;

import javax.swing.JOptionPane;

public class Yen {
	
	public void YenAPeso(double valor) {
		double yenPeso = valor *2.40;
		yenPeso = (double) Math.round(yenPeso *100d)/100;
        JOptionPane.showMessageDialog(null, "Es igual a $ " +yenPeso+ " Pesos Argentinos.");
	}
	
	public void YenADolar(double valor) {
		double yenDolar = valor *0.0069;
		yenDolar = (double) Math.round(yenDolar *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +yenDolar+ " Dolares, Estadounidenses.");
	}
	
	public void YenALibra(double valor) {
		double yenLibra = valor *0.0054;
        yenLibra = (double) Math.round(yenLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +yenLibra+ " Libras Esterlinas.");
	}
	
	public void YenAEuro(double valor) {
		double euroYen = valor *0.0064;
        euroYen = (double) Math.round(euroYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +euroYen+ " Euros, Europeos.");
	}
	
	public void YenAWon(double valor) {
		double yenWon = valor / 3.04;
        yenWon = (double) Math.round(yenWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +yenWon+ " Wones, Sur Coreanos.");
	}
	}

