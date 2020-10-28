package service.impl;

import dao.DAO;
import dao.impl.PGPersonDAO;
import model.Person;
import service.Service;

import java.util.List;

public class PersonServiceImpl implements Service<Person> {

    @Override
    public List<Person> getAll() {
        return new PGPersonDAO().getAll();
    }

    @Override
    public Long add(Person person) {
        return new PGPersonDAO().add(person);
    }

    @Override
    public Person getByID(Long id) {
        return new PGPersonDAO().getByID(id);
    }

    @Override
    public void update(Person person) {
        DAO<Person> personDAO = new PGPersonDAO();
        personDAO.update(person);
        // new PGPersonDAO().update(person); ???
    }

    @Override
    public void deleteByID(Long id) {
        DAO<Person> personDAO = new PGPersonDAO();
        personDAO.deleteByID(id);
        // new PGPersonDAO().deleteByID(id); ???
    }

}
