package DefiAnimaux.bo;

public class Renard extends Animal {

	public Renard() {
		this.setCaractere(new Mechant());
		this.setLocomotion(new Courant());
		this.setRegimeAlimentaire(new Carnivore());
		this.setNomAnimal("Renard");
	}

	@Override
	public String toString() {
		return "Renard [getNomAnimal()=" + getNomAnimal() + ", getLocomotion()=" + getLocomotion().moyenLocomotion() + ", getCaractere()="
				+ getCaractere().caractere() + ", getRegimeAlimentaire()=" + getRegimeAlimentaire().regimeAlimentaire() + "]";
	}
}
