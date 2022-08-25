package fr.sdis.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.sdis.Pompier;

class PompierTest {
	private Pompier pompier;

	@BeforeEach
	void setUp() throws Exception {
		pompier = new Pompier();
	}

	@Test
	void testPompier() {
		fail("Not yet implemented");
	}

	@Test
	void testGetNom() {
		fail("Not yet implemented");
	}

	@Test
	void testSetNom() {
		fail("Not yet implemented");
	}

	@Test
	void testGetPrenom() {
		fail("Not yet implemented");
	}

	@Test
	void testSetPrenom() {
		fail("Not yet implemented");
	}

	@Test
	void testGetTel() {
		pompier.setTel("0123456789");
		assertEquals("0123456789", pompier.getTel());
	}

	@Test
	void testSetTel() {
		fail("Not yet implemented");
	}

	@Test
	void testGetIdentite() {

		pompier.setIdentite("Matteo Trabelsi");
		assertEquals(" Matteo Trabelsi", pompier.getIdentite());

	}

	@Test
	void testSetIdentite() {
		fail("Not yet implemented");
	}

}
