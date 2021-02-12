package DefiAnimaux.bo;

public class Carnivore implements RegimeAlimentaire {

	@Override
	public String regimeAlimentaire() {
		// TODO Auto-generated method stub
		return "Carnivore";
	}

	@Override
	public void manger() {
		System.out.println("* mange un bon rumsteak *");
		
	}

}
