package n1ejercicio3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class LeerEntrada {

	
	   public static HashMap<String, String>  ObtenerCapitales() {
		   
		    HashMap<String, String> paisescapitales  = new HashMap<String, String>();
			//Ruta donde encontrar el fichero de texto
			String rutaTXT = "C:\\Users\\usuario\\CURSOBCNACTIVA\\Countries.txt";
			String string = "123-654321";
			String[] parts = string.split("-");
			String part1 = parts[0]; // 123
			String part2 = parts[1]; // 654321
			
			
			try {
				//Configuramos lector de ficheros
				BufferedReader lector = new BufferedReader(new FileReader(rutaTXT));
				//Leemos línea
				String linea = lector.readLine();
				//Mientras la linea sea distinto de null, es decir, hay líneas para leer
				while (linea != null) {
					//Mostramos línea en pantalla
						System.out.println(linea);
					
					  parts = linea.split(" ");
					  part1 = parts[0]; 
					  part2 = parts[1]; 
					  paisescapitales.put(part1, part2); 
					
					//Leemos siguiente línea, si no es null, se repetirá el bucle
					linea = lector.readLine();
				}
				//Lectura terminada, cerramos lector
				lector.close();
			} catch (FileNotFoundException e) {
				System.out.println("No se encuentra fichero: " + rutaTXT);
			} catch (IOException e) {
				System.out.println("No se puede acceder a " + rutaTXT);
 
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Error Formato fichero de entrada ,sin lineas vacias" + rutaTXT);
			}
			
			return paisescapitales;
		}
	
}
