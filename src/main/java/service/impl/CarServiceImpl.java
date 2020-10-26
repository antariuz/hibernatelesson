package service.impl;

import dao.CarDAO;
import dao.impl.PGCarDAO;
import model.Car;
import service.CarService;

import java.util.List;

public class CarServiceImpl implements CarService {

    public List<Car> getAllCar() {
        return new PGCarDAO().getAllCar();
    }

    public Long addCar(Car car) {
        return new PGCarDAO().addCar(car);
    }

    public Car getCarByID(Long id) {
        return new PGCarDAO().getCarByID(id);
    }

    public void updateCar(Car car) {
        CarDAO carDAO = new PGCarDAO();
        carDAO.updateCar(car);
        // new PGCarDAO().updateCar(car); ???
    }

    public void deleteCarByID(Long id) {
        CarDAO carDAO = new PGCarDAO();
        carDAO.deleteCarByID(id);
        // new PGCarDAO().deleteCarByID(id); ???
    }

}
