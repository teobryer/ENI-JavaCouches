package gestionEleves.bll;

import gestionEleves.bo.Eleve;

public interface EleveManager {

	public void addEleve(Eleve eleve) throws EleveManagerException;

	public Integer getMoyenneGenerale() throws EleveManagerException;

	public Integer getMoyenne(String classe) throws EleveManagerException;
}
