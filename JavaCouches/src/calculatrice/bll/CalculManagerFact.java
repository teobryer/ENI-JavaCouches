package calculatrice.bll;

public class CalculManagerFact {
	public static CalculatriceManager getInstance() {
		return new CalculatriceManagerImpl();
	}
}
