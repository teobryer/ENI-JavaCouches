package GestionNotes.DAL;

import java.util.List;

import GestionNotes.BO.Eleve;



public interface EleveDAO {
	public void insert(Eleve eleve) throws EleveDALException;
	public List<Eleve> getAll() throws EleveDALException;
}
