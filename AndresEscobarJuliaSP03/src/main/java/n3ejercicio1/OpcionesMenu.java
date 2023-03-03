package n3ejercicio1;

import java.util.InputMismatchException;

import n1ejercicio3.MetodosEntrada;

public class OpcionesMenu {

	public static void OpcionesMenu() {
	
	System.out.println("Menu Personas  ");
	System.out.println("               ");
		
	System.out.println("1.- Introduir persona.");

	System.out.println("2.- Mostrar les persones ordenades per nom (A-Z).");

	System.out.println("3.- Mostrar les persones ordenades per nom (Z-A).");

	System.out.println("4.- Mostrar les persones ordenades per cognoms (A-Z).");

	System.out.println("5.- Mostrar les persones ordenades per cognoms (Z-A).");

	System.out.println("6.- Mostrar les persones ordenades per DNI (1-9).");
			
	System.out.println("7.- Mostrar les persones ordenades per DNI (9-1).");

	System.out.println("0.- Sortir.");
	
	
	}
	
	
	public static Persona AltaPersona() {
		
		
		System.out.println("Introduca Persona") ;
		String  nom = "", cognom = "", dni = "";
		try {
			 
			 nom  =  MetodosEntrada.llegirString("   NOMBRE     : ");
			 cognom = MetodosEntrada.llegirString("   APELLIDOS  : ");
			 dni = MetodosEntrada.llegirString("   DNI        :").trim();;
			 
 
		}   catch(Exception   e) {
	 
			System.out.println( "Error entrada " + e.getMessage()) ;
		}
		
		return new Persona( nom, cognom, dni);
	};
}
