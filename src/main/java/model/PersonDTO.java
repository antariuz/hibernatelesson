package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class PersonDTO {

    @Getter
    private Long id;

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String surname;

    @Getter @Setter
    private String gender;

    @Getter @Setter
    private Integer age;

    public PersonDTO() {
    }

}
