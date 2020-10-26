package service.impl;

import dao.PersonDAO;
import dao.impl.PGPersonDAO;
import model.Person;
import service.PersonService;

import java.util.List;

public class PersonServiceImpl implements PersonService {

    public List<Person> getAllPerson() {
        return new PGPersonDAO().getAllPerson();
    }

    public Long addPerson(Person person) {
        return new PGPersonDAO().addPerson(person);
    }

    public Person getPersonByID(Long id) {
        return new PGPersonDAO().getPersonByID(id);
    }

    public void updatePerson(Person person) {
        PersonDAO personDAO = new PGPersonDAO();
        personDAO.updatePerson(person);
        // new PGPersonDAO().updatePerson(person); ???
    }

    public void deletePersonByID(Long id) {
        PersonDAO personDAO = new PGPersonDAO();
        personDAO.deletePersonByID(id);
        // new PGPersonDAO().deletePersonByID(id); ???
    }

}
