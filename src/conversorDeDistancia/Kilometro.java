package conversorDeDistancia;

import javax.swing.JOptionPane;

public class Kilometro {

	public void KilometroAMilimetro(double valor) {
		double  kilometroMilimetro = valor *1e+6;
		kilometroMilimetro = (double) Math.round(kilometroMilimetro *100d)/100;
        JOptionPane.showMessageDialog(null, "Es igual a $ " +kilometroMilimetro+ " Milimetros.");
	}
	
	public void KilometroACentimetro(double valor) {
		double kilometroCentimetro = valor *100000;
		kilometroCentimetro = (double) Math.round(kilometroCentimetro *100d)/100;
        JOptionPane.showMessageDialog(null, "Es igual a $ " +kilometroCentimetro+ " Centimetros.");
	}
	
	public void KilometroAMetro (double valor) {
		double kilometroMetro  = valor *1000;
		kilometroMetro = (double) Math.round(kilometroMetro *100d)/100;
        JOptionPane.showMessageDialog(null, "Es igual a $ " +kilometroMetro+ " Metros.");
	}
	
	public void KilometroAMilla (double valor) {
		double kilometromilla = valor *0.621371;
		kilometromilla = (double) Math.round(kilometromilla *100d)/100;
        JOptionPane.showMessageDialog(null, "Es igual a $ " +kilometromilla+ " Kilometros.");
	}
	
}
