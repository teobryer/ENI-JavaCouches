package DefiAnimaux.bo;

public class Nageant implements Locomotion {

	@Override
	public String moyenLocomotion() {
		// TODO Auto-generated method stub
		return "Nageant";
	}

	@Override
	public void seDeplacer() {
		 System.out.println("* Plouf, nage, plouf, nage *");
		
	}

	

}
