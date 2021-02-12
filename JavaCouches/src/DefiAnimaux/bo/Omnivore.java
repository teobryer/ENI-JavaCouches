package DefiAnimaux.bo;

public class Omnivore implements RegimeAlimentaire {

	@Override
	public String regimeAlimentaire() {
		// TODO Auto-generated method stub
		return "Omnivore";
	}

	@Override
	public void manger() {
		System.out.println("*mange un bon rumsteak accompagné de sa salade");
		
	}

}
