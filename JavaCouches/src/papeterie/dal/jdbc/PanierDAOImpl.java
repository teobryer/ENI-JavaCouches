package papeterie.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import GestionNotes.DAL.JdbcTools;
import papeterie.bo.Article;
import papeterie.bo.Panier;
import papeterie.bo.Ramette;
import papeterie.bo.Stylo;

public class PanierDAOImpl implements PanierDAO {

	private String SELECT_BY_ID = "  USE PAPETERIE_DB SELECT Panier.idPanier, Panier.montant, Lignes.idLigne, Lignes.idArticle, Lignes.qte FROM LIGNES INNER JOIN Panier ON Panier.idPanier = Lignes.idPanier WHERE Panier.idPanier = ?";

	@Override
	public Panier selectById(int id) throws DALException {
		// TODO Auto-generated method stub
		Panier panier = new Panier();

		try (Connection cnx = JdbcTools.getConnection()) {
			PreparedStatement stmt = cnx.prepareStatement(SELECT_BY_ID);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

			
					panier.setMontant(rs.getFloat("montant"));
					panier.setIdPanier(rs.getInt("idPanier"));
				

			panier.addLigne(DAOFact.getArticleDAO().selectById(rs.getInt("idArticle")), (rs.getInt("qte")), (rs.getInt("idLigne")));

			}
		} catch (

		Exception e) {
			e.printStackTrace();
			throw new DALException("Problème dans la sélection d'un panier");
		}
		return panier;
	}

	@Override
	public List<Panier> selectAll() throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Panier article) throws DALException {
		// TODO Auto-generated method stub

	}

	@Override
	public void insert(Panier article) throws DALException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) throws DALException {
		// TODO Auto-generated method stub

	}

}
