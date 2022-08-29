package fr.sdis;

public class ProgTest {
	public static void main(String[] args) {
		Pompier unPompier = new Pompier();
		unPompier.setIdentite("Marc DUPONT");
		try {
			// try {
			unPompier.setTel("0606060606");
			System.out.println(unPompier);

			// }catch(NullPointerException e) {

			// }
		} catch (InvalidTelNumnerExecption e) {
			System.out.println("Numéro de Tel Invalid");
		} finally {// executer quelque soit la situation
			System.out.println(unPompier);
		}
	}

}
