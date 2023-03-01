package n1ejercicio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

 

public class JugarCapitales {
	public String rutaTXT = "C:\\Users\\usuario\\CURSOBCNACTIVA\\Countries.txt";
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String nombre = null;
		  HashMap<String, String>  paisescapitales  =   LeerEntrada.ObtenerCapitales();
		  Object[] crunchifyKeys = paisescapitales.keySet().toArray();
		  String oks = "";
		  String texto = "";
			do {
			try {
				 oks = "S";
				 	texto  =  MetodosEntrada.llegirString("Introduzca nombre : ");
			}   catch(Exception   e) {
				 oks = "N";
				System.out.println( "Introduzca nombre  " +e.getMessage());
			}
			
		nombre = texto;	
			
		}while( !(oks == "S") );	
		
			int puntos= 0;
			int numeroveces = 0;
			 
			do {
			try {
				 numeroveces++;
				  Object key = crunchifyKeys[new Random().nextInt(crunchifyKeys.length)];
				  System.out.println("Pais -->  " +  key  );
	 			  String capital = paisescapitales.get(key);
				  String respuesta =  MetodosEntrada.llegirString("Introduzca capital : ");
				  if( capital.equals(respuesta) )  { 
					  puntos = puntos + 1  ;
					  System.out.println("Capital aceptada. Total puntos " + puntos );
				  }
			}   catch(Exception e) {
				 System.out.println( e.getMessage());
			}
			}while( numeroveces < 15)  ;	
		
			
			EscribeFichero.EscribeFichero(nombre, puntos); 
			
	}

}
