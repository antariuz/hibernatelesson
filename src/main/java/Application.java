import model.Car;
import model.Person;
import service.Service;
import service.impl.CarServiceImpl;
import service.impl.PersonServiceImpl;

public class Application {

    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Sponge");
        person.setSurname("Bob");
        person.setGender("Male");
        person.setAge(50);

        Car car = new Car();
        car.setBrand("BMW");
        car.setModel("X5");
        car.setDriver(null);
        car.setEngineType("Petrol");
        car.setManufacturedYear(1988);

        Service<Person> personService = new PersonServiceImpl();
        personService.add(person);

        Service<Car> carService = new CarServiceImpl();
        carService.add(car);

    }

}
