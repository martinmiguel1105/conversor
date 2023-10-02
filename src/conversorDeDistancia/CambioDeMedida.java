package conversorDeDistancia;

import javax.swing.JOptionPane;


public class CambioDeMedida {

	Milimetro milimetro = new Milimetro();
	Centimetro centimetro = new Centimetro();
	Metro metro = new Metro();
	Kilometro kilometro = new Kilometro();
	Milla milla = new Milla();
	
	public void CambiarMedida(double Minput) {
    	String tipoMedida = (JOptionPane.showInputDialog(null, 
    			"Elije la medida a convertir","Medida",
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Milimetro a Centimetro", "De Milimetro a Metro", "De Milimetro a Kilometro", "De Milimetro a Milla", "De Centimetro a Milimetro", "De Centimetro a Metro", "De Centimetro a Kilometro", "De Centimetro a Milla", "De Metro a Milimetro", "De Metro a Centimetro", "De Metro a Kilometro", "De Metro a Milla", "De Kilometro a Milimetro", "De Kilometro a Centimetro", "De Kilometro a Metro", "De Kilometro a Milla", "De Milla a Milimetro", "De Milla a Centimetro", "De Milla a Metro", "De Milla a Kilometro" }, 
    			
    
    			"Seleccion")).toString();
        switch(tipoMedida) {
        case "De Milimetro a Centimetro"://MILIMETRO
        	milimetro.MilimetroACentimetro(Minput);
        	break;
        case "De Milimetro a Metro":
        	milimetro.MilimetroAMetro(Minput);
        	break;	        
        case "De Milimetro a Kilometro":
        	milimetro.MilimetroAKilometro(Minput);
        	break;		
        case "De Milimetro a Milla":
        	milimetro.MilimetroAMilla(Minput);
        	break;		
        case "De Centimetro a Milimetro"://CENTIMETRO
        	centimetro.CentimetroAMilimetro(Minput);
        	break;		
        case "De Centimetro a Metro":
        	centimetro.CentimetroAMetro(Minput);
        	break;		
        case "De Centimetro a Kilometro":
        	centimetro.CentimetroAKilometro(Minput);
        	break;		
        case "De Centimetro a Milla":
        	centimetro.CentimetroAMilla(Minput);
        	break;		
        case "De Metro a Milimetro"://METRO
        	metro.MetroAMilimetro(Minput);
        	break;		
        case "De Metro a Centimetro":
        	metro.MetroACentimetro(Minput);
        	break;		
        case "De Metro a Kilometro":
        	metro.MetroAKilometro(Minput);
        	break;		
        
        case "De Metro a Milla":
        	metro.MetroMilla(Minput);
        	break;		
        
        case "De Kilometro a Milimetro"://KILOMETRO
        	kilometro.KilometroAMilimetro(Minput);
        	break;		
        
        case "De Kilometro a Centimetro":
        	kilometro.KilometroACentimetro(Minput);
        	break;		
        
        case "De Kilometro a Metro":
        	kilometro.KilometroAMetro(Minput);
        	break;		
        
        case "De Kilometro a Milla":
        	kilometro.KilometroAMilla(Minput);
        	break;		
       
        case "De Milla a Milimetro"://MILLA
        	milla.MillaAMilimetro(Minput);
        	break;		
       
        case "De Milla a Centimetro":
        	milla.MillaACentimetro(Minput);
        	break;		
       
        case "De Milla a Metro":
        	milla.MillaAMetro(Minput);
        	break;		
       
        case "De Milla a Kilometro":
        	milla.MillaAKilometro(Minput);
        	break;		
 	
        }
	}
}
