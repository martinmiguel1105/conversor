package MenuPrincipal;

import javax.swing.JOptionPane;

import conversorDeDistancia.CambioDeMedida;
import conversorDeMonedas.CambioDeMoneda;

public class MenuConversores {
	public static void main(String[] args) {
		
	
	  CambioDeMoneda monedas = new CambioDeMoneda();
      CambioDeMedida distancia = new CambioDeMedida();
           
      while(true) {
      	
      	String opciones = (JOptionPane.showInputDialog(null, "Elija una opción de conversión ", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Distancia"}, "Seleccion")).toString();

      	switch(opciones) {
      	case "Conversor de Moneda":
      		 String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
               if(ValidarNumero(input) == true) {
                   double Minput = Double.parseDouble(input);
                   monedas.CambiarMoneda(Minput);

                   int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
                   if (JOptionPane.OK_OPTION == respuesta){
                   	System.out.println("Selecciona opción Afirmativa");
                   }else{
                      	JOptionPane.showMessageDialog(null, "Programa terminado");                         
                   }

                  } else {
                      JOptionPane.showMessageDialog(null, "Valor inválido");                
                  }
                   	break;
      	

      	 case "Conversor de Distancia":
      	 input = JOptionPane.showInputDialog("Ingresa el valor de la Distancia que deseas convertir ");
           if(ValidarNumero(input) == true) {
               double Minput = Double.parseDouble(input);
               distancia.CambiarMedida(Minput);
               int respuesta = 0;
               respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
               if((respuesta == 0) && (ValidarNumero(input) == true)) { 
               } else {
                   JOptionPane.showMessageDialog(null, "Programa terminado");                     
               }

           } else {
               JOptionPane.showMessageDialog(null, "Valor inválido");                
           }
           break;
      	}           
      	}
      }      

  public static boolean ValidarNumero(String input) {
      try {
          double x = Double.parseDouble(input);
          if(x >= 0 || x < 0);
              return true;
          } catch (NumberFormatException e) {
              return false;
          }     
  }
}
    

