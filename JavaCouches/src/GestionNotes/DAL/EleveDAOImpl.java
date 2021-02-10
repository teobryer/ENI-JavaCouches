package GestionNotes.DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import GestionNotes.BO.Eleve;
import car.bo.Car;


public class EleveDAOImpl implements EleveDAO {
	
	
	
	private String INSERT = "INSERT INTO Eleve (lastname ,firstname,notesJson ,classe) VALUES  (?,?,?,?)";
	private String SELECT = "SELECT id, lastname ,firstname,notesJson ,classe FROM ELEVE";
	
	@Override
	public void insert(Eleve eleve) throws EleveDALException {
		try (Connection cnx = JdbcTools.getConnection()) {
			PreparedStatement stmt = cnx.prepareStatement(INSERT);
			stmt.setString(1, eleve.getLastName());
			stmt.setString(2, eleve.getFirstName());
		
			stmt.setString(3, new Gson().toJson(eleve.getNotes()));
			stmt.setString(4, eleve.getClasse());
		
			stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			throw new EleveDALException("problème dans l'insertion d'un car");
		}
	}

	@Override
	public List<Eleve> getAll() throws EleveDALException {
		List<Eleve> result = new ArrayList<Eleve>();
		try (Connection cnx = JdbcTools.getConnection()) {
			PreparedStatement stmt = cnx.prepareStatement(SELECT);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				// TODO : ajouter la gestion de l'idCar dans la BO et le récupérer ici
				// gitignore
				@SuppressWarnings("unchecked")
				ArrayList<Double> notesList= (ArrayList<Double>) new Gson().fromJson(rs.getString("notesJson"),
	                    new TypeToken<ArrayList<Double>>() {
	                    }.getType());
				
				Eleve eleve = new Eleve(
				rs.getString("lastname"),
				rs.getString("firstname"),
				notesList,
				rs.getString("classe"));
				result.add(eleve);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new EleveDALException("problème dans la selection des �l�ves");
		}
		return result;
	}

}
