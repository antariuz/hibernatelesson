package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @Getter @Setter @ToString
public class PersonDTO {

    private Long id;
    private String name;
    private String surname;
    private String gender;
    private Integer age;

}
