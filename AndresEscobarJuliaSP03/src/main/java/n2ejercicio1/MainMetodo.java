package n2ejercicio1;

import java.util.HashSet;
import java.util.Set;

public class MainMetodo {
	 


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean  nuevo = false;
		ListaRestaurantes listarestaurante = new ListaRestaurantes();
		
 		Restaurante  restaurante1 = new Restaurante( "ESTRELLA", 100 );
		Restaurante  restaurante2 = new Restaurante( "ESTRELLA", 200 );
		Restaurante  restaurante3 = new Restaurante( "ESTRELLA", 300 );

		Restaurante  restaurante4 = new Restaurante( "ESTRELLA", 200 );

		Restaurante  restaurante5 = new Restaurante( "LA CONCHA", 200 );
		Restaurante  restaurante6 = new Restaurante( "LA CONCHA", 300 );
		//* añadimos *//
		listarestaurante.restaurantes( restaurante1 );
		listarestaurante.restaurantes( restaurante2 );
		listarestaurante.restaurantes( restaurante3 );
		listarestaurante.restaurantes( restaurante5 );
		
		System.out.println("Restaurantes cargados ");
		listarestaurante.listarestaurantes();
		
		
	
		nuevo = listarestaurante.CompruebaExiste(  restaurante4   );
		if( nuevo ) { 	listarestaurante.restaurantes( restaurante4);  
 		} else{
 			System.out.println("restaurante4 : Restaurante y puntuacion existe. ");
 		}; 
		
		nuevo = listarestaurante.CompruebaExiste(  restaurante6  );
		if( nuevo ) {
			listarestaurante.restaurantes( restaurante6);  
 		}else{
			System.out.println("restaurante6 : Restaurante y puntuacion existe. ");
 		}; 
		
		System.out.println("\nRestaurantes cargados totales ");
		 
 		listarestaurante.listarestaurantes();
 		
 		
// 		listarestaurante.listarestaurantesSort();
 		
 		
	}

}
