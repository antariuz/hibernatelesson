package dao.impl;

import dao.CarDAO;
import hibernate.HibernateSessionFactoryUtil;
import model.Car;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.math.BigInteger;
import java.util.List;

public class PGCarDAO implements CarDAO {

    public List<Car> getAllCar() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        List<Car> carList = session.createQuery("From Car").list();
        session.close();
        return carList;
    }

    public Long addCar(Car car) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(car);
        transaction.commit();
        Long lastId = ((BigInteger) session.createSQLQuery("SELECT LAST_INSERT_ID()").uniqueResult()).longValue();
        session.close();
        return lastId;
    }

    public Car getCarByID(Long id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Car car = session.get(Car.class, id);
        session.close();
        return car; // return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Car.class, id);  ???
    }

    public void updateCar(Car car) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(car);
        transaction.commit();
        session.close();
    }

    public void deleteCarByID(Long id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(id);
        transaction.commit();
        session.close();
    }

}
