package DefiAnimaux.bo;

public abstract class Animal {

	private String nomAnimal;
	
	private Locomotion locomotion;
	private Caractere caractere;
	private RegimeAlimentaire regimeAlimentaire;
	
	
	public String getNomAnimal() {
		return nomAnimal;
	}
	public void setNomAnimal(String nomAnimal) {
		this.nomAnimal = nomAnimal;
	}
	public Locomotion getLocomotion() {
		return locomotion;
	}
	public void setLocomotion(Locomotion locomotion) {
		this.locomotion = locomotion;
	}
	public Caractere getCaractere() {
		return caractere;
	}
	public void setCaractere(Caractere caractere) {
		this.caractere = caractere;
	}
	public RegimeAlimentaire getRegimeAlimentaire() {
		return regimeAlimentaire;
	}
	public void setRegimeAlimentaire(RegimeAlimentaire regimeAlimentaire) {
		this.regimeAlimentaire = regimeAlimentaire;
	}
	
	
	
}
