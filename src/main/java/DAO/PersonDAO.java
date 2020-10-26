package DAO;

import model.Person;

import java.util.List;

public interface PersonDAO {

    List<Person> getAllPerson();

    Long addPerson(Person person);

    Person getPersonByID(Long id);

    void updatePersonByID(Long id);

    void deletePersonByID(Long id);

}
