package dao.impl;

import dao.DAO;
import hibernate.HibernateSessionFactoryUtil;
import model.Car;
import model.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.math.BigInteger;
import java.util.List;

public class PGPersonDAO implements DAO<Person> {

    @Override
    public List<Person> getAll() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        List personList = session.createQuery("From Person ").list();
        session.close();
        return personList;
    }

    @Override
    public Long add(Person person) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(person);
        transaction.commit();
        Long lastId = ((BigInteger) session.createSQLQuery("SELECT LASTVAL()").uniqueResult()).longValue();
        session.close();
        return lastId;
    }

    @Override
    public Person getByID(Long id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Person person = session.get(Person.class, id);
        session.close();
        return person; // return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Person.class, id);  ???
    }

    @Override
    public void update(Person person) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(person);
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

//    public Person getDriverByID(Long id) {
//        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
//        Person driver = session.get(Car.class, id).getDriver();
//        session.close();
//        return driver;
//    }

}
