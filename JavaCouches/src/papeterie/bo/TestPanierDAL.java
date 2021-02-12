package papeterie.bo;

import papeterie.dal.jdbc.DALException;
import papeterie.dal.jdbc.DAOFact;
import papeterie.dal.jdbc.PanierDAO;

public class TestPanierDAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PanierDAO panier= DAOFact.getPanierDAO();
		
		try {
		Panier p =	panier.selectById(1);
		
		
		for (Ligne a : p.getLignesPanier()) {
			 System.out.println(a.getIdLigne() + " " + a.getPrix() + a.getQte() + a.getArticle().toString() );
		}
		//System.out.println(p.getLignesPanier());
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
