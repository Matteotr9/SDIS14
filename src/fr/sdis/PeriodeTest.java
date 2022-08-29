package fr.sdis;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PeriodeTest {
	private Periode periode;

	@BeforeEach // creer collect de pompier
	void setUp() throws Exception {
		periode = new Periode();
	}

	@Test
	void testGetStatut() {
		periode.affecter(new Pompier("MARC DUPONT"), 'm');
		assertEquals(periode.getStatut(new Pompier("MARC DUPONT")), 'm');

		periode.affecter(new Pompier("MAuriCe DUPONT"), 't');
		assertEquals(periode.getStatut(new Pompier("MAuriCe DUPONT")), 't');

		periode.affecter(new Pompier("JP DUPONT"), 'd');
		assertEquals(periode.getStatut(new Pompier("JP DUPONT")), 'd');

		periode.affecter(new Pompier("BERNARD Dupont"), 'x');
		assertEquals(periode.getStatut(new Pompier("BERNARD Dupont")), 'x');
		System.out.println("Ajouter ce pompier ?");é
	}

	@Test
	void testMissionner() {
		fail("Not yet implemented");
	}

	@Test
	void testSelectEquipe() {
		fail("Not yet implemented");
	}

}
