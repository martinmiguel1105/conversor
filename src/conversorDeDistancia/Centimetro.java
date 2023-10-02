package conversorDeDistancia;

import javax.swing.JOptionPane;

public class Centimetro {
	
	public void CentimetroAMilimetro(double valor) {
		double centimetroMilimetro = valor *10;
		centimetroMilimetro = (double) Math.round(centimetroMilimetro *100d)/100;
        JOptionPane.showMessageDialog(null, "Es igual a $ " +centimetroMilimetro+ " Milimetros.");
	}
	
	public void CentimetroAMetro (double valor) {
		double centimetroMetro = valor *0.01;
		centimetroMetro = (double) Math.round(centimetroMetro *100d)/100;
        JOptionPane.showMessageDialog(null, "Es igual a $ " +centimetroMetro+ " Metros.");
	}
	
	public void CentimetroAKilometro (double valor) {
		double centimetroKilometro = valor *1e-5;
		centimetroKilometro = (double) Math.round(centimetroKilometro *100d)/100;
        JOptionPane.showMessageDialog(null, "Es igual a $ " +centimetroKilometro+ " Kilometros.");
	}
	
	public void CentimetroAMilla(double valor) {
		double centimetroAMilla = valor *6.2137e-6;
		centimetroAMilla = (double) Math.round(centimetroAMilla *100d)/100;
        JOptionPane.showMessageDialog(null, "Es igual a $ " +centimetroAMilla+ " Millas.");
	}

}
