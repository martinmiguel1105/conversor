package conversorDeDistancia;

import javax.swing.JOptionPane;

public class Metro {
	
	public void MetroAMilimetro(double valor) {
		double  metroMeilimetro = valor *1000;
		metroMeilimetro = (double) Math.round(metroMeilimetro *100d)/100;
        JOptionPane.showMessageDialog(null, "Es igual a $ " +metroMeilimetro+ " Milimetros.");
	}
	
	public void MetroACentimetro(double valor) {
		double  metroCentimetro = valor *100;
		metroCentimetro = (double) Math.round(metroCentimetro *100d)/100;
        JOptionPane.showMessageDialog(null, "Es igual a $ " +metroCentimetro+ " Centimetros.");
	}
	
	public void MetroAKilometro (double valor) {
		double metroKilometro = valor *0.001;
		metroKilometro = (double) Math.round(metroKilometro *100d)/100;
        JOptionPane.showMessageDialog(null, "Es igual a $ " +metroKilometro+ " Kilometros.");
	}
	
	public void MetroMilla (double valor) {
		double metroMilla = valor *0.000621371;
		metroMilla = (double) Math.round(metroMilla *100d)/100;
        JOptionPane.showMessageDialog(null, "Es igual a $ " +metroMilla+ " Millas.");
	}
}
