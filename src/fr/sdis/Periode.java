package fr.sdis;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Periode {

	Date laDate;
	int laTranche;

	private List<Pompier> enMission;
	private List<Pompier> disponible;
	private List<Pompier> autravail;

	public Periode() {
		enMission = new ArrayList<>();
		disponible = new ArrayList<>();
		autravail = new ArrayList<>();
	}

//	private boolean contains(Pompier unPompier, List<Pompier> desPompiers) {
//		for (Pompier p : desPompiers) {
//			if (p.getIdentite() == unPompier.getIdentite()) {
//				return true;
//			}
//		}
//		return false;
//	}

	public char getStatut(Pompier unPompier) {
		if (autravail.contains(unPompier)) {
			return 't';
		}
		if (enMission.contains(unPompier)) {
			return 'm';
		}

		return 'd';
	}

	public void missionner(Pompier unPompier) {

	}

	public List<Pompier> selectEquipe(int nbPompiers) {
		return null;
	}

	public void affecter(Pompier p, char c) {
		switch (c) {
		case 'm':
			enMission.add(p);
			break;
		case 'd':
			disponible.add(p);
			break;
		case 't':
			autravail.add(p);
			break;

		}
	}
}
