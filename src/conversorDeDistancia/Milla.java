package conversorDeDistancia;

import javax.swing.JOptionPane;

public class Milla {

	
	public void MillaAMilimetro(double valor) {
		double millaMilimetro = valor *1.609e+6;
		millaMilimetro = (double) Math.round(millaMilimetro *100d)/100;
        JOptionPane.showMessageDialog(null, "Es igual a $ " +millaMilimetro+ " Milimetros.");
	}
	
	public void MillaACentimetro(double valor) {
		double millaCentimetro = valor *160934;
		millaCentimetro = (double) Math.round(millaCentimetro *100d)/100;
        JOptionPane.showMessageDialog(null, "Es igual a $ " +millaCentimetro+ " Centimetros.");
	}
	
	public void MillaAMetro(double valor) {
		double millaMetro = valor *1609.34;
		millaMetro = (double) Math.round(millaMetro *100d)/100;
        JOptionPane.showMessageDialog(null, "Es igual a $ " +millaMetro+ " Metros.");
	}
	
	public void MillaAKilometro(double valor) {
		double millaKilometro = valor *1.60934;
		millaKilometro = (double) Math.round(millaKilometro *100d)/100;
        JOptionPane.showMessageDialog(null, "Es igual a $ " +millaKilometro+ " Kilometros.");
	}
}
