package fr.sdis;

public class Pompier {
	String nom;
	String prenom;
	String tel;

	public Pompier(String identite) {

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

	public void setTel(String numero) throws InvalidTelNumnerExecption {
		String numclear = numero.replaceAll("\\D", "");
		if (numclear.length() < 10)
			throw new InvalidTelNumnerExecption("Invalid phone number");
		tel = numclear;

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
	}

	public char getStatut(Periode periode) {
		return periode.getStatut(this);
	}

	public String toString() {
		return getIdentite();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj==null) {
			return false ;
			
		}
		if(!(obj instanceof Pompier)) {
			return false ;
		
	}
		return ((Pompier)obj).getIdentite().equals(getIdentite());

	// Test unitaire JUnit

}
