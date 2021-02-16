package gestionEleves.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import gestionEleves.bo.Eleve;

public class EleveDAOImpl implements EleveDAO{
	private String INSERT = "INSERT INTO eleve(nom,prenom,note, classe) VALUES(?,?,?,?)";
	private String SELECT = "SELECT idEleve,nom,prenom,note,classe FROM eleve";
	@Override
	public Eleve insert(Eleve eleve) throws EleveDAOException {
		try(Connection cnx = JdbcTools.getConnection()){
			PreparedStatement stmt = cnx.prepareStatement(INSERT,Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, eleve.getNom());
			stmt.setString(2, eleve.getPrenom());
			stmt.setInt(3, eleve.getNote());
			stmt.setString(4, eleve.getClasse());
			int nbRows = stmt.executeUpdate();
			if (nbRows == 1) {
				ResultSet rs = stmt.getGeneratedKeys();
				if (rs.next()) {
					eleve.setIdEleve(rs.getInt(1));
				}
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new EleveDAOException();
		}
		return eleve;
	}

	@Override
	public List<Eleve> getAll() throws EleveDAOException{
		List<Eleve> result = new ArrayList<Eleve>();
		try(Connection cnx = JdbcTools.getConnection()){
			PreparedStatement stmt = cnx.prepareStatement(SELECT);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Eleve eleve = new Eleve();
				eleve.setIdEleve(rs.getInt("idEleve"));
				eleve.setNom(rs.getString("nom"));
				eleve.setPrenom(rs.getString("prenom"));
				eleve.setNote(rs.getInt("note"));
				eleve.setClasse(rs.getString("classe"));
				result.add(eleve);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new EleveDAOException();
		}
		
		return result;
	}

}
