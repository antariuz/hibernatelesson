package dao;

import model.Person;

import java.util.List;

public interface PersonDAO {

    List<Person> getAllPerson();

    Long addPerson(Person person);

    Person getPersonByID(Long id);

    void updatePerson(Person person);

    void deletePersonByID(Long id);

}
