package DefiAnimaux.bo;

public class TestBO {

	public static void main(String[] args) {
	Renard r = new Renard();
	
	
	System.out.println(r.toString());
	
	r.getCaractere().exprimerSonHumeur();
	r.getLocomotion().seDeplacer();
	r.getRegimeAlimentaire().manger();
	}

}
