package car.dal;

public class DAOFact {
	public static CarDAO getCarDAO() {
		return new CarDAOImpl();
	}
}
