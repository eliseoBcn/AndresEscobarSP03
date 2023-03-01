package n1ejercicio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<Month> listameses = new ArrayList<>();
    	
    	
    	listameses.add(new  Month("Enero") );
    	listameses.add(new  Month("Febrero") );
    	listameses.add(new  Month("Marzo") );
    	listameses.add(new  Month("Abril") );  
    	listameses.add(new  Month("Mayo") );
    	listameses.add(new  Month("Junio") );
    	listameses.add(new  Month("Julio") );
    	listameses.add(new  Month("Septienbre") );
    	listameses.add(new  Month("Octubre") );
    	listameses.add(new  Month("Novienbre") );
      	listameses.add(new  Month("Novienbre") );  	
    	 Month mes2 = new  Month("Dicienbre");
       	listameses.add( mes2);    
       	listameses.add( mes2);    
       	
       	
   		System.out.println("**  Listamos los 11 meses añadidos ");
   		
    	for ( Month mes : listameses) {
    		System.out.println(" mes " +  mes.getName());
    	}
    	
        listameses.add( 7, new  Month("Agosto")   );
        
   		System.out.println("**  Listamos los 12 meses incluyendo Agosto en su posicion ");
    	for ( Month mes : listameses) {
    		System.out.println(" mes " +  mes.getName());
    	}
        // constructor
        HashSet<Month> 	listamesesconjunto = new HashSet<>(listameses);
 
 
   		System.out.println("**  Recorremos el conjunto con for  ");
        for ( Month  mes  : listamesesconjunto ) {
            System.out.println(mes.getName());
        }
        
    
        Iterator<Month> mesiterator = listamesesconjunto.iterator();
        
   		System.out.println("**  Recorremos el conjunto con iterator  ");
        while (mesiterator.hasNext()){
      	Month  mes = mesiterator.next();

            System.out.println(" mes  " + mes.getName());

        }
        
    }
}
