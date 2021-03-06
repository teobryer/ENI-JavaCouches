package papeterie.bll;

import papeterie.bo.Article;
import papeterie.bo.Ligne;

import java.util.List;

public interface PapeterieManager {

	// PANIER
	Ligne getLigne(int index);

	List<Ligne> getLignesPanier();

	void addLigne(Article aricle, int qte);

	void updateLigne(int index, int newQte);

	void removeLigne(int index);

	// LIGNE
	Article getArticle();

	float getPrix();

	Article setArticle();

	void setQte(int qte);

}
