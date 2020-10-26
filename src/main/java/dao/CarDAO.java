package dao;

import model.Car;

import java.util.List;

public interface CarDAO {

    List<Car> getAllCar();

    Long addCar(Car car);

    Car getCarByID(Long id);

    void updateCar(Car car);

    void deleteCarByID(Long id);

}
