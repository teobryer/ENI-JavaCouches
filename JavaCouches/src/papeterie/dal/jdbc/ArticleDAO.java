package papeterie.dal.jdbc;

import java.util.List;


import papeterie.bo.Article;



public interface ArticleDAO {

	public Article selectById(int id) throws ArticleDALException;
	public List<Article> selectAll() throws ArticleDALException;
	public void update(Article article) throws ArticleDALException;
	public void insert(Article article) throws ArticleDALException;
	public void delete(int id)throws ArticleDALException;

}
