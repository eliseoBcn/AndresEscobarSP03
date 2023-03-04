package n2ejercicio1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

 
public class ListaRestaurantes  {
	  
	Set<Restaurante>  restaurantes ;
	
	public ListaRestaurantes() {
		
		restaurantes = new HashSet<Restaurante>();
	}
	   
	public void listarestaurantes() {
		
		for (Restaurante r :  restaurantes ) {
			  	 
		   System.out.println( "Restaurante Nombre " + r.nom + " Puntuacion " +  r.puntuacion);
		}
   
	};
	
	public void restaurantes( Restaurante restaurante) {
		   restaurantes.add(restaurante) ;
	};
	
	  public  boolean  CompruebaExiste( Restaurante r1  ) {
		  
		   	boolean Comprueba = true;
		   	
	        for (Restaurante r :  restaurantes ) {
	        	if( r.nom.equals(r1.nom)  ) {
	        		if( r.puntuacion == r1.puntuacion ) { 
	        			
						/*
						 * System.out.println( "   " + r1.puntuacion ); System.out.println( "    "+
						 * r.puntuacion ); System.out.println( "   " + r1.nom ); System.out.println(
						 * "    "+ r.nom );
						 * 
						 * System.out.println( "    Misma puntuacion duplicados " );
						 */
	        			Comprueba = false;
	        		}
	        	}
	        	
	        }
	         
	        return Comprueba;
	  }
//	  

	   public static void main( String[] args ) {   
		   
   
	   }
}
