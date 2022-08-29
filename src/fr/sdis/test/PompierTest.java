package fr.sdis.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.sdis.InvalidTelNumnerExecption;
import fr.sdis.Pompier;

class PompierTest {
	private Pompier pompier;

	@BeforeEach
	void setUp() throws Exception {
		pompier = new Pompier("");
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
	void testGetTel() throws InvalidTelNumnerExecption {
		pompier.setTel("0123456789");
		assertEquals("0123456789", pompier.getTel());
	}

	@Test
	void testSetTel() throws InvalidTelNumnerExecption {
		InvalidTelNumnerExecption thrown = assertThrows(InvalidTelNumnerExecption.class, () -> {
			pompier.setTel("0606060606");
		});
		assertEquals("Invalid phone number", thrown.getMessage());
		InvalidTelNumnerExecption thrown2 = assertThrows(InvalidTelNumnerExecption.class, () -> {
			pompier.setTel("1");
		});
		assertEquals("Invalid phone Number", thrown2.getMessage());

		pompier.setTel(" 06.3.... 25 417 89");
		assertEquals("invalid number phone", null);
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
