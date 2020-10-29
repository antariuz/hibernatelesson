package model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor @Getter @Setter @ToString @Entity @Table(name = "person") @AllArgsConstructor
public class Person extends AbstractIdentifiableEntity {

    private String name;
    private String surname;
    private String gender;
    private Integer age;

}
