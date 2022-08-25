package fr.sdis;

import javax.print.DocFlavor.INPUT_STREAM;

public class Pompier {
	String nom;
	String prenom;
	String tel;

	public Pompier(String nom, String prenom, String tel) {
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTel() {
		return tel.replaceFirst("(\\d{2})(\\d{2})(\\\\d{2})(\\\\d{2})(\\\\d{2})", "$1 $2 $3 $4 $5");

	}

	public void setTel(String tel) {
		String[] tableautel;
		tableautel=
	}

	public String getIdentite() {
		return nom + " " + prenom;
	}

	public void setIdentite(String identite) {
		String[] tableau;
		if(identite.contains(" ")) {
			
		tableau=identite.split(" ",1);
		nom=tableau[0];
			//<---
		prenom=tableau[1];
		}else {
			nom=identite;
			prenom="";
		
	}

	public Character getStatut(unePeriode periode) {

	}

	public String toString() {
		return identite
	}

}
}
