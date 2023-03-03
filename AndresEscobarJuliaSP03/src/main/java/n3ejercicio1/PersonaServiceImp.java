package n3ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonaServiceImp implements PersonaService {

	 
	
 
	private ArrayList<Persona> personas = null;
	
	public PersonaServiceImp () {
		personas = new ArrayList<Persona>();
	};
	public PersonaServiceImp ( ArrayList<Persona> personas) {
		this.personas = personas ;
	};
	
	public void listar() {
		
		//-----------------------Cabeceras ------------------ 
		System.out.println("\n");
 		System.out.printf("%-15s%-40s%-10s\n", "NOMBRE", "APELLIDOS" ,"DNI" );
		System.out.printf("%-65s\n","====================================================================");
		
		
		for( Persona p: personas) {
				System.out.printf("%-15s%-40s%-10s\n",  p.getNom(), p.getCognom() ,  p.getDNI() );
		}
		
		System.out.println("");
	};
	
	
	public void  persona(Persona persona) {
		
		personas.add(persona);
		
	};
	
	
	public void TipoOrdenamiento(TiposDatos  campos , String sentidoAD) {
		
		
        switch(campos) {
        case NOMBRE :

        	if(sentidoAD.equals("A") )  {
     			Collections.sort(personas, (x, y) -> x.getNom().compareToIgnoreCase(y.getNom()));
     		}else {
     			Collections.sort(personas, (x, y) -> y.getNom().compareToIgnoreCase(x.getNom()));
     		}
            break;			

        case APELLIDOS :	 	

        	if(sentidoAD.equals("A") )  {
     			Collections.sort(personas, (x, y) -> x.getCognom().compareToIgnoreCase(y.getCognom()));
     		}else {
     			Collections.sort(personas, (x, y) -> y.getCognom().compareToIgnoreCase(x.getCognom()));
     		}
            break;
            	
        case DNI :
        	
     		if(sentidoAD.equals("A") )  {
     			Collections.sort( personas, (x, y) -> x.getDNI().compareToIgnoreCase(y.getDNI()));
     		}else {
     			Collections.sort( personas, (x, y) -> y.getDNI().compareToIgnoreCase(x.getDNI()));
     		}
            break;
        }
   	}

 
}
