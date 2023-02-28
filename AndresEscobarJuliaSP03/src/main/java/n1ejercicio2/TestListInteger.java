package n1ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import n1ejercicio1.Month;

public class TestListInteger {
    public static void main( String[] args ) {   
 
    	List<Integer>  miLista =  new ArrayList<Integer>();
    	miLista.add(1);
    	miLista.add(2); 
    	miLista.add(3);
    	
    	List<Integer> miLista2 =  new ArrayList<Integer>();
  
    	ListIterator<Integer> it = miLista.listIterator();
    	
    	while(it.hasNext() ) {
   		 System.out.println("Lista 1 :  " + it.next());
    	};
    	
    	while(it.hasPrevious() ) {
 		    	miLista2.add(it.previous());	 
    	};
    	
       for( Integer n: miLista2 ) { 
			  System.out.println("Lista 2 : " + n.intValue() ); 
		};
  
    }
}