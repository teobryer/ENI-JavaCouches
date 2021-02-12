package papeterie.dal.jdbc;

import java.util.List;


import papeterie.bo.Article;



public interface ArticleDAO {

	public Article selectById(int id) throws DALException;
	public List<Article> selectAll() throws DALException;
	public void update(Article article) throws DALException;
	public void insert(Article article) throws DALException;
	public void delete(int id)throws DALException;

}
