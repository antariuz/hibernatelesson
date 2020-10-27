package model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor @Getter @Setter @ToString @Entity @Table(name = "person")
public class Person {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Setter(AccessLevel.NONE)
    private Long id;
    private String name;
    private String surname;
    private String gender;
    private Integer age;

}
