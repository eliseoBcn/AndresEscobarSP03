package n3ejercicio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;

import n1ejercicio3.MetodosEntrada;

public class MenuPrincipal {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated		method stub
 

		String rutaTXT = "C:\\Users\\usuario\\CURSOBCNACTIVA\\ListaPersonas.csv";
		
		PersonaService personas = new PersonaServiceImp( LeerEntrada.leerFichero( rutaTXT ) );
	 
		
		char opciones = ' ';
		do {
			OpcionesMenu.OpcionesMenu();
			try {
 				  opciones  =  MetodosEntrada.llegirChar("Seleccione opcion : ");
				}   catch(Exception  e) {
		 
				System.out.println( " ") ;
			}
			
			
 
	        switch(opciones) {
	        case '1':
	        	personas.persona( OpcionesMenu.AltaPersona()) ;
	            break;			
	        case '2':	 	
	        	personas.TipoOrdenamiento(TiposDatos.NOMBRE, "A");
	            break;
	        case '3':
	        	personas.TipoOrdenamiento(TiposDatos.NOMBRE, "D");
	            break;	          	
	        case '4':
	        	personas.TipoOrdenamiento(TiposDatos.APELLIDOS, "A");
	            break;
	        case '5':
	        	personas.TipoOrdenamiento(TiposDatos.APELLIDOS, "D");
	            break;
	        case '6':
	        	personas.TipoOrdenamiento(TiposDatos.DNI, "A");
	            break;
	        case '7':
	        	personas.TipoOrdenamiento(TiposDatos.DNI, "D");
	            break;
	        case '0':        	
	            break;
	        default :
	            System.out.println("opcion no contemplada  : " + opciones );
	        }
			
			
        	personas.listar();
        	
	        
		}while( !(opciones  == '0') );
		
		
		
		System.out.println("FIN PROGRAMA");	
	}

}
