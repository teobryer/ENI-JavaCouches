package gestionEleves.dal;

import java.util.List;

import gestionEleves.bo.Eleve;

public interface EleveDAO {
	public Eleve insert(Eleve eleve) throws EleveDAOException;
	public List<Eleve> getAll() throws EleveDAOException;
}
