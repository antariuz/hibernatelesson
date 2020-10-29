package model;

import lombok.*;

@NoArgsConstructor @Getter @Setter @ToString @AllArgsConstructor
public class PersonDTO extends AbstractIdentifiableEntity {

    private String name;
    private String surname;
    private String gender;
    private Integer age;

}
