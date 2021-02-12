package DefiAnimaux.bo;

public class Requin extends Animal {

	public Requin() {
		this.setCaractere(new Mechant());
		this.setLocomotion(new Nageant());
		this.setRegimeAlimentaire(new Carnivore());
		this.setNomAnimal("Renard");
	}

	@Override
	public String toString() {
		return "Renard [getNomAnimal()=" + getNomAnimal() + ", getLocomotion()=" + getLocomotion().moyenLocomotion() + ", getCaractere()="
				+ getCaractere().caractere() + ", getRegimeAlimentaire()=" + getRegimeAlimentaire().regimeAlimentaire() + "]";
	}
}
