package dao.impl;

import dao.DAO;
import hibernate.HibernateSessionFactoryUtil;
import model.Car;
import model.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.math.BigInteger;
import java.util.List;

public class PGCarDAO implements DAO<Car> {

    @Override
    public List<Car> getAll() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        List<Car> carList = session.createQuery("From Car").list();
        session.close();
        return carList;
    }

    @Override
    public Long add(Car car) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(car);
        transaction.commit();
        Long lastId = ((BigInteger) session.createSQLQuery("SELECT LASTVAL()").uniqueResult()).longValue();
        session.close();
        return lastId;
    }

    @Override
    public Car getByID(Long id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Car car = session.get(Car.class, id);
        session.close();
        return car; // return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Car.class, id);  ???
    }

    @Override
    public void update(Car car) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(car);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteByID(Long id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(id);
        transaction.commit();
        session.close();
    }

}
