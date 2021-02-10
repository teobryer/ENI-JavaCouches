package car.dal;

import java.util.List;

import car.bo.Car;


public interface CarDAO {
	public void insert(Car car) throws CarDALException;
	public List<Car> getAll() throws CarDALException;
}
