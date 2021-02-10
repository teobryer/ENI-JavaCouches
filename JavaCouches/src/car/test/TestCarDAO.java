package car.test;

import car.bo.Car;
import car.dal.CarDALException;
import car.dal.CarDAO;
import car.dal.DAOFact;

public class TestCarDAO {
	private static CarDAO carDAO = DAOFact.getCarDAO();
	
	public static void main(String[] args) throws CarDALException {
		carDAO.insert(new Car("nouveau",6));
		
		System.out.println(carDAO.getAll());
	}

}
