package DAO;

import model.Car;

import java.util.List;

public interface CarDAO {

    List<Car> getAllCar();

    Long addCar(Car car);

    Car getCarByID(Long id);

    void updateCarByID(Long id);

    void deleteCarByID(Long id);

}
