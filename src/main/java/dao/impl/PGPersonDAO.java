package dao.impl;

import dao.PersonDAO;
import hibernate.HibernateSessionFactoryUtil;
import model.Car;
import model.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class PGPersonDAO implements PersonDAO {
    public List<Person> getAllPerson() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        List<Person> personList = session.createQuery("From Person ").list();
        session.close();
        return personList;
    }

    public Long addPerson(Person person) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(person);
        transaction.commit();
        session.close();
        return null; //session.getIdentifier(person);
    }

    public Person getPersonByID(Long id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Person person = session.get(Person.class, id);
        session.close();
        return person; // return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Person.class, id);  ???
    }

    public void updatePerson(Person person) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(person);
        transaction.commit();
        session.close();
    }

    public void deletePersonByID(Long id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(id);
        transaction.commit();
        session.close();
    }
}
