package papeterie.dal.jdbc;

import java.util.List;

import papeterie.bo.Panier;



public interface PanierDAO {

	
	public Panier selectById(int id) throws DALException;
	public List<Panier> selectAll() throws DALException;
	public void update(Panier article) throws DALException;
	public void insert(Panier article) throws DALException;
	public void delete(int id)throws DALException;
}
