package n2ejercicio1;

public class Restaurante {
		
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	String nom = "";
	int puntuacion = -1;
	public Restaurante(String nom, int puntuacion) {
		this.nom = nom;
		this.puntuacion = puntuacion;
	}

}
