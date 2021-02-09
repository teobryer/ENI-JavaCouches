package calculatrice.bll;

/**
 * Gestion d'une calculatrice par ses calculs de base 
 * @author manu
 *
 */
public interface CalculatriceManager {

	/**
	 * Fait une addition
	 * @param a premier paramètre de mon opération
	 * @param b secon paramètre de mon opération
	 * @return le résultat de l'addition
	 */
	public Integer plus(Integer a, Integer b);
	
	/**
	 * Fait une soustraction
	 * @param a premier paramètre de mon opération
	 * @param b secon paramètre de mon opération
	 * @return le résultat de la soustraction
	 */
	public Integer moins(Integer a, Integer b);
	
	public Integer fois(Integer a, Integer b);
	public Integer div(Integer a, Integer b) throws Exception;
}
