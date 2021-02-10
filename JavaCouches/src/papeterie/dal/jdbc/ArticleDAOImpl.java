package papeterie.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import GestionNotes.DAL.JdbcTools;
import papeterie.bo.Article;
import papeterie.bo.Ramette;
import papeterie.bo.Stylo;


public class ArticleDAOImpl implements ArticleDAO {
	
	
	
	private String SELECT_BY_ID = "  USE PAPETERIE_DB SELECT * FROM Articles WHERE idArticle=?";
	private String SELECT_ALL = "  USE PAPETERIE_DB SELECT * FROM Articles";
	private String UPDATE = "  USE PAPETERIE_DB UPDATE Articles SET reference = ? ,marque = ? ,designation = ? ,prixUnitaire = ? ,qteStock = ? ,grammage = ? ,couleur = ? ,type =? WHERE idArticle= ?";
	private String INSERT = " USE PAPETERIE_DB INSERT INTO Articles (reference ,marque ,designation ,prixUnitaire ,qteStock ,grammage ,couleur ,type) VALUES (?,?,?,?,?,?,?,?)";
	private String DELETE = "  USE PAPETERIE_DB DELETE FROM Articles WHERE idArticle= ?";
	
	@Override
	public Article selectById(int id) throws ArticleDALException {
		// TODO Auto-generated method stub
		Article art = new Ramette();
		try (Connection cnx = JdbcTools.getConnection()) {
			PreparedStatement stmt = cnx.prepareStatement(SELECT_BY_ID);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			
		
			while(rs.next()) {
				// TODO : ajouter la gestion de l'idCar dans la BO et le rÃ©cupÃ©rer ici
				// gitignore
				
				String type = rs.getString("type").replaceAll("\\s", "");
				if(type.equals("Ramette")) {
					Ramette ramette = new Ramette();
					ramette.setDesignation(rs.getString("designation"));
					ramette.setGrammage(rs.getInt("grammage"));
					ramette.setIdArticle(rs.getInt("idArticle"));
					ramette.setMarque(rs.getString("marque"));
					ramette.setPrixUnitaire(rs.getFloat("prixUnitaire"));
					ramette.setQteStock(rs.getInt("qteStock"));
					ramette.setReference(rs.getString("reference"));
					
					art = ramette;
					
				}
				if( type.equals("Stylo")) {
					Stylo stylo = new Stylo();
					stylo.setDesignation(rs.getString("designation"));
					stylo.setCouleur(rs.getString("couleur"));
					stylo.setIdArticle(rs.getInt("idArticle"));
					stylo.setMarque(rs.getString("marque"));
					stylo.setPrixUnitaire(rs.getFloat("prixUnitaire"));
					stylo.setQteStock(rs.getInt("qteStock"));
					stylo.setReference(rs.getString("reference"));
					
					art = stylo;
				}
				
				
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new ArticleDALException("Problème dans la sélection d'article");
		}
		return art;
	}
	@Override
	public List<Article> selectAll() throws ArticleDALException {
		List<Article> listart = new ArrayList<Article>();
		try (Connection cnx = JdbcTools.getConnection()) {
			PreparedStatement stmt = cnx.prepareStatement(SELECT_ALL);
			
			ResultSet rs = stmt.executeQuery();
			
		
			while(rs.next()) {
				// TODO : ajouter la gestion de l'idCar dans la BO et le rÃ©cupÃ©rer ici
				// gitignore
				
				String type = rs.getString("type").replaceAll("\\s", "");
				if(type.equals("Ramette") ) {
					Ramette ramette = new Ramette();
					ramette.setDesignation(rs.getString("designation"));
					ramette.setGrammage(rs.getInt("grammage"));
					ramette.setIdArticle(rs.getInt("idArticle"));
					ramette.setMarque(rs.getString("marque"));
					ramette.setPrixUnitaire(rs.getFloat("prixUnitaire"));
					ramette.setQteStock(rs.getInt("qteStock"));
					ramette.setReference(rs.getString("reference"));
					
					listart.add(ramette) ;
					
				}
				if( type.equals("Stylo")) {
					Stylo stylo = new Stylo();
					stylo.setDesignation(rs.getString("designation"));
					stylo.setCouleur(rs.getString("couleur"));
					stylo.setIdArticle(rs.getInt("idArticle"));
					stylo.setMarque(rs.getString("marque"));
					stylo.setPrixUnitaire(rs.getFloat("prixUnitaire"));
					stylo.setQteStock(rs.getInt("qteStock"));
					stylo.setReference(rs.getString("reference"));
					
					listart.add(stylo) ;
				}
				
				
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new ArticleDALException("Problème dans la sélection de tous les articles");
		}
		return listart;
	}
	@Override
	public void update(Article article) throws ArticleDALException {
		try (Connection cnx = JdbcTools.getConnection()) {
			PreparedStatement stmt = cnx.prepareStatement(UPDATE);
			
			stmt.setString(1, article.getReference());
			stmt.setString(2, article.getMarque());
			stmt.setString(3, article.getDesignation());
			stmt.setFloat(4, article.getPrixUnitaire());
			stmt.setInt(5, article.getQteStock());
			stmt.setInt(9,article.getIdArticle());
			if(article instanceof Stylo ) {
				Stylo s = (Stylo)article;
				stmt.setString(7,s.getCouleur());
				stmt.setString(6, null);
				stmt.setString(8,"Stylo");
				
			}
			else {
				if ( article instanceof Ramette) {
					
					Ramette r = (Ramette)article;
					stmt.setInt(6, r.getGrammage());
					stmt.setString(7, null);
					stmt.setString(8,"Ramette");
				}
			}
			
		
		
	
		
			stmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new ArticleDALException("Problème dans la mise à jour d'un article");
		}	
		
	}
	@Override
	public void insert(Article article) throws ArticleDALException {
		
		
		try (Connection cnx = JdbcTools.getConnection()) {
			PreparedStatement stmt = cnx.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
			
			stmt.setString(1, article.getReference());
			stmt.setString(2, article.getMarque());
			stmt.setString(3, article.getDesignation());
			stmt.setFloat(4, article.getPrixUnitaire());
			stmt.setInt(5, article.getQteStock());
			
			if(article instanceof Stylo ) {
				Stylo s = (Stylo)article;
				stmt.setString(7,s.getCouleur());
				stmt.setString(6, null);
				stmt.setString(8,"Stylo");
			}
			else {
				if ( article instanceof Ramette) {
					
					Ramette r = (Ramette)article;
					stmt.setInt(6, r.getGrammage());
					stmt.setString(7, null);
					stmt.setString(8,"Ramette");
				}
			}
			
		
		
	
	
			stmt.executeUpdate();
			
			ResultSet rs = stmt.getGeneratedKeys();
			int generatedKey = 0;
			if (rs.next()) {
			    generatedKey = rs.getInt(1);
			}
			
			article.setIdArticle(generatedKey);
			System.out.println(generatedKey);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ArticleDALException("Problème dans l'insertion d'un article");
		}		
	}
	@Override
	public void delete(int id) throws ArticleDALException {
		try (Connection cnx = JdbcTools.getConnection()) {
			PreparedStatement stmt = cnx.prepareStatement(DELETE);
			
			stmt.setInt(1, id);
			
			
		
		
	
		
			stmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new ArticleDALException("Problème dans la suppression d'un article");
		}	
		
	}
	
	

}
