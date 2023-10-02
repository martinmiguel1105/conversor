package conversorDeMonedas;

import javax.swing.JOptionPane;

public class Dolar {
	
	/*public void DolarAPeso(double valor) {
		double dolarPeso = valor *3739.00;
		dolarPeso = (double) Math.round(dolarPeso *1000d)/1000;
        JOptionPane.showMessageDialog(null, "Es igual a $ " +dolarPeso+ " Pesos, Argentinos.");
	}*/
	
	public void DolarAPeso(double valor) {
		double dolarPeso = valor *3739.00;
		dolarPeso = (double)Math.round(dolarPeso *100)/100;
		JOptionPane.showMessageDialog(null, "Es igual a $ " +dolarPeso+ " Pesos, Argentinos.");
		
	}
	
	public void DolarAEuro(double valor) {
		double dolarEuro = valor *0.92;
		dolarEuro = (double) Math.round(dolarEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +dolarEuro+ " Euros, Europeos.");
	}
	
	public void DolarALibra(double valor) {
		double dolarLibra = valor *0.79;
        dolarLibra = (double) Math.round(dolarLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +dolarLibra+ " Libras, Esterlinas.");
	}

	public void DolarAYen(double valor) {
		double dolarYen = valor * 144.80;
        dolarYen = (double) Math.round(dolarYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +dolarYen+ " Yenes, Japoneses.");
	}
	
	public void DolarAWon(double valor) {
		double dolarWon = valor *1331.98;
        dolarWon = (double) Math.round(dolarWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +dolarWon+ " Wones, Sur Coreanos.");
	
}
}
