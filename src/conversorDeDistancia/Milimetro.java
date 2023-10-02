package conversorDeDistancia;

import javax.swing.JOptionPane;

public class Milimetro {
	
	public void MilimetroACentimetro(double valor) {
		double milimetroCentimetro = valor *0.1;
		milimetroCentimetro = (double) Math.round(milimetroCentimetro *100d)/100;
        JOptionPane.showMessageDialog(null, "Es igual a $ " +milimetroCentimetro+ " Centimetros.");
	}
	
	public void MilimetroAMetro (double valor) {
		double milimetroMetro = valor *0.001;
		milimetroMetro = (double) Math.round(milimetroMetro *100d)/100;
        JOptionPane.showMessageDialog(null, "Es igual a $ " +milimetroMetro+ " Metros.");
	}
	
	public void MilimetroAKilometro (double valor) {
		double milimetroKilometro = valor *1e-6;
		milimetroKilometro = (double) Math.round(milimetroKilometro *100d)/100;
        JOptionPane.showMessageDialog(null, "Es igual a $ " +milimetroKilometro+ " Kilometros.");
	}    
	
    public void MilimetroAMilla (double valor) {
		double milimetroMilla = valor *6.2137e-7;
		milimetroMilla = (double) Math.round(milimetroMilla *100d)/100;
        JOptionPane.showMessageDialog(null, "Es igual a $ " +milimetroMilla+ " Millas.");
    }
    
}