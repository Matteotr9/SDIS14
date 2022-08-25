package fr.sdis;

import java.util.Date;
import java.util.List;

public class Periode {

	Date laDate;
	int laTranche;

	private List<Pompier> enMission;
	private List<Pompier> disponible;
	private List<Pompier> autravail;

	public char getStatut(Pompier unPompier) {
		return ' ';
	}

}
