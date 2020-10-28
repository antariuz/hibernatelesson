package service.impl;

import dao.DAO;
import dao.impl.PGCarDAO;
import model.Car;
import service.Service;

import java.util.List;

public class CarServiceImpl implements Service<Car> {

    @Override
    public List<Car> getAll() {
        return new PGCarDAO().getAll();
    }

    @Override
    public Long add(Car car) {
        return new PGCarDAO().add(car);
    }

    @Override
    public Car getByID(Long id) {
        return new PGCarDAO().getByID(id);
    }

    @Override
    public void update(Car car) {
        DAO<Car> carDAO = new PGCarDAO();
        carDAO.update(car);
        // new PGCarDAO().update(car); ???
    }

    @Override
    public void deleteByID(Long id) {
        DAO<Car> carDAO = new PGCarDAO();
        carDAO.deleteByID(id);
        // new PGCarDAO().deleteByID(id); ???
    }

}
