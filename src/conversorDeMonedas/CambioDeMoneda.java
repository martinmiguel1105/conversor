package conversorDeMonedas;

import javax.swing.JOptionPane;

public class CambioDeMoneda {

	Peso peso = new Peso();
	Dolar dolar = new Dolar();
	Euro euro = new Euro();
	Yen yen = new Yen();
	Libra libra = new Libra();
	Won won = new Won();

	
	public void CambiarMoneda(double Minput) {
    	String tipoMoneda = (JOptionPane.showInputDialog(null, 
    			"Selecciona la moneda a convertir","Moneda",
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Peso a Dolar", "De Peso a Euro", "De Peso a Libra", "De Peso a Yen", "De Peso a Won", "De Dolar a Peso", "De Dolar a Euro", 	"De Dolar a libra", "De Dolar a Yen", "De Dolar a Won", 
    					"De Euro a Peso", "De Euro a Dolar", "De Euro a Libra", "De Euro a Yen", "De Euro a Won", "De Libra a Peso", "De Libra a Dolar", "De Libra a Euro", "De Libra a Yen", "De Libra a Won",
    							"De Yen a Peso", " De Yen a Dolar", "De Yen a Euro", "De Yen a Libra", "De Yen a Won", "De Won a Peso", "De Won a Dolar", "De Won a Euro", "De Won a Libra", "De Won a Yen" }, 
    			
    
    			"Seleccion")).toString();
        switch(tipoMoneda) {//PESO
        case "De Peso a Dolar":
        	peso.PesoADolar(Minput);
        	break;
        case "De Peso a Euro":
        	peso.PesoAEuro(Minput);
        	break;	        
        case "De Peso a Libra":
        	peso.PesoALibra(Minput);
        	break;		
        case "De Peso a Yen":
        	peso.PesoAYen(Minput);
        	break;		
        case "De Peso a Won":
        	peso.PesoAWon(Minput);
        	break;		
        case "De Dolar a Peso":
        	dolar.DolarAPeso(Minput);
        	break;		
        case "De Dolar a Euro":
        	dolar.DolarAEuro(Minput);
        	break;		
        case "De Dolar a Libra":
        	dolar.DolarALibra(Minput);
        	break;		
        case "De Dolar a Yen":
        	dolar.DolarAYen(Minput);
        	break;		
        case "De Dolar a Won":
        	dolar.DolarAWon(Minput);
        	break;		
        case "De Euro a Peso":
        	euro.EuroAPeso(Minput);
        	break;		
        
        case "De Euro a Dolar":
        	euro.EuroADolar(Minput);
        	break;		
        
        case "De Euro a Libra":
        	euro.EuroALibra(Minput);
        	break;		
        
        case "De Euro a Yen":
        	euro.EuroAYen(Minput);
        	break;		
        
        case "De Euro a Won":
        	euro.EuroAWon(Minput);
        	break;		
        
        case "De Libra a Peso":
        	libra.LibraAPeso(Minput);
        	break;		
       
        case "De Libra a Dolar":
        	libra.LibraADolar(Minput);
        	break;		
       
        case "De Libra a Euro":
        	libra.LibraAEuros(Minput);
        	break;		
       
        case "De Libra a Yen":
        	libra.LibraAYen(Minput);
        	break;		
       
        case "De Libra a Won":
        	libra.LibraAWon(Minput);
        	break;		
       //YEN
        case "De Yen a Peso":
        	yen.YenAPeso(Minput);
        	break;		
       
        case "De Yen a Dolar":
        	yen.YenADolar(Minput);
        	break;
       
        case "De Yen a Euro":
        	yen.YenAEuro(Minput);
        	break;	
       
        case "De Yen a Libra":
        	yen.YenALibra(Minput);
        	break;
       
        case "De Yen a Won":
        	yen.YenAWon(Minput);
        	break;
       //WON
        case "De Won a Peso":
        	won.WonAPeso(Minput);
        	break;
       
        case "De Won a Dolar":
        	won.WonADolar(Minput);
        	break;	
       
        case "De Won a Euro":
        	won.WonAEuro(Minput);
        	break;	
       
        case "De Won a Libra":
        	won.WonALibra(Minput);
        	break;		
        
        case "De Won a Yen":
        	won.WonAYen(Minput);
        	break;		
        }
	}
}
        
