package n1ejercicio3;

import java.io.FileWriter;
import java.io.PrintWriter;

public class EscribeFichero {
	public static String FicheroSalidaPuntuacion = "C:\\Users\\usuario\\CURSOBCNACTIVA\\Puntuacion.txt";


    public static void EscribeFichero (String nombre, int puntos )
    {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(FicheroSalidaPuntuacion);
            pw = new PrintWriter(fichero);

       
                pw.println("nombre " + nombre  + " puntos " + puntos );

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
}
