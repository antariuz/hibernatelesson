package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@ToString @Entity @Table(name = "persons")
public class Person {

    @Getter @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String surname;

    @Getter @Setter
    private String gender;

    @Getter @Setter
    private Integer age;

    public Person() {
    }

}
