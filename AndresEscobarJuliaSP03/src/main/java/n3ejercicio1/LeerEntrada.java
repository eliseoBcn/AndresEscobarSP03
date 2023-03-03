package n3ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeerEntrada {

	
	   public static  ArrayList<Persona> leerFichero(String rutaTXT2) {
		   
		     ArrayList<Persona> listapersonas = new  ArrayList<Persona>(); 
		 
			String rutaTXT = rutaTXT2;
			String string = "";
			String[] parts = string.split("-");
			String part1 = "";
			String part2 = "";  
			String part3 = "";  
			try {
			 
				BufferedReader lector = new BufferedReader(new FileReader(rutaTXT));
 
				String cabecera  = lector.readLine();
				String linea = lector.readLine();
				while (linea != null && !linea.equals("")) {
	 				 
					  parts = linea.split(";");
					  part1 = parts[0]; 
					  part2 = parts[1];
					  part3 = parts[2];
					  listapersonas.add( new Persona(part1,part2,part3 ) );
					 
				   	  linea = lector.readLine();
				}
		
				lector.close();
			} catch (FileNotFoundException e) {
				System.out.println("No se encuentra fichero: " + rutaTXT);
			} catch (IOException e) {
				System.out.println("No se puede acceder a " + rutaTXT);
 
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Error Formato fichero de entrada ,sin lineas vacias" + rutaTXT);
			}	
			return  listapersonas;
		}
	
}
