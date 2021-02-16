package papeterie.ihm.model;

import papeterie.bo.Article;
import papeterie.bo.Ramette;
import papeterie.bo.Stylo;

public class ArticleModel {

	private String designation;
	private String typeArt;
	private float prixU;
	private String marque;
	private String ref;
	private int grammage;
	private String couleur;
	private int qteStock;

	public ArticleModel() {
		super();
		this.designation = "";
		this.typeArt = "";
		this.prixU = 0;
		this.marque = "";
		this.ref = "";
		this.grammage = 0;
		this.couleur = "";
		this.qteStock = 0;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getTypeArt() {
		return typeArt;
	}

	public void setTypeArt(String typeArt) {
		this.typeArt = typeArt;
	}

	public float getPrixU() {
		return prixU;
	}

	public void setPrixU(float prixU) {
		this.prixU = prixU;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public int getGrammage() {
		return grammage;
	}

	public void setGrammage(int grammage) {
		this.grammage = grammage;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getQteStock() {
		return qteStock;
	}

	public void setQteStock(int qteStock) {
		this.qteStock = qteStock;
	}

	public Article generatedArticle() {
		Article a = null;
		if (this.typeArt == "Stylo") {
			a = new Stylo();

		} else {
			a = new Ramette();

		}
		a.setDesignation(this.designation);
		a.setMarque(this.marque);
		a.setPrixUnitaire(this.prixU);
		a.setReference(this.ref);
		a.setQteStock(this.qteStock);
		return a;

	}

}
