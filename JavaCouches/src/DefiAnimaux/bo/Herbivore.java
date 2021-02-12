package DefiAnimaux.bo;

public class Herbivore implements RegimeAlimentaire {

	@Override
	public String regimeAlimentaire() {
		// TODO Auto-generated method stub
		return "Herbivore";
	}

	@Override
	public void manger() {
		System.out.println("*mange une bonne salade");
		
	}

}
