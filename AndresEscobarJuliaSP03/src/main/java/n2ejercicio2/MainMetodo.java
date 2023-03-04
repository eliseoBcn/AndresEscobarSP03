package n2ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import n2ejercicio1.Restaurante;
import n3ejercicio1.Persona;

public class MainMetodo {

	
	   public static void main( String[] args ) {   
		   

	        // Sorting HashSet using List
	        List<Restaurante>  listsort = new ArrayList<Restaurante>();
	 
	        listsort.add(  new Restaurante("MELIA" , 100) );			
	        listsort.add(  new Restaurante("JUAN CARLOS I" , 600) );
	        listsort.add(  new Restaurante("MELIA" , 300) );	        
	        
	        listsort.add(  new Restaurante("JUAN CARLOS I" , 300) );
	        listsort.add(  new Restaurante("JUAN CARLOS I" , 30) );	   
	        
			System.out.println( "LISTA ANTES DE ORDENAR ");
	        for( Restaurante r:  listsort ) {
 				System.out.println( " Nombre  " + r.getNom() + "\tPuntuacion " + r.getPuntuacion() );
			}
	        
	        // Usando expresiones lambda
			listsort.sort((o1, o2) -> {
	            int cmp = o1.getNom().compareTo(o2.getNom());
	            if (cmp != 0) {
	                return  cmp;
	            }
	            return Integer.valueOf(o1.getPuntuacion()).compareTo(o2.getPuntuacion() );
	        }
			);
			System.out.println( "\n\nLISTA  ORDENADA ");
			for( Restaurante r:  listsort ) {
 				System.out.println( " Nombre  " + r.getNom() + "\tPuntuacion " + r.getPuntuacion() );
			}

	   }

}
