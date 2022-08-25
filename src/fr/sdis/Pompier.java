package fr.sdis;

import javax.management.RuntimeErrorException;

public class Pompier {
	String nom;
	String prenom;
	String tel;

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

	public void setTel(String numero) {
		tel = numero.replaceAll("\\D", "");
		String numclear;
		if (numero.length() < 10)
			throw new RuntimeErrorException(null);
		tel = numero;

	}

	public String getIdentite() {
		return nom + " " + prenom;
	}

	public void setIdentite(String identite) {
		String[] tableau;
		if (identite.contains(" ")) {

			tableau = identite.split(" ", 2);
			nom = tableau[1];
			// <---
			prenom = tableau[0];
		} else {
			nom = identite;
			prenom = "";

		}

	public Character getStatut(unePeriode periode) {
	return unePeriode.getStatut(this);
	}

	public String toString() {
		return getIdentite();
	}

		// Test unitaire JUnit

	}
}
