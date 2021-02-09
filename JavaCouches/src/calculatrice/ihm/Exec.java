package calculatrice.ihm;

import calculatrice.bll.CalculManagerFact;
import calculatrice.bll.CalculatriceManager;

public class Exec {

	public static void main(String[] args) {
		CalculatriceManager calculatrice = CalculManagerFact.getInstance();
		System.out.println(calculatrice.plus(2, 3));
	}

}
