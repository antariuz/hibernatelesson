package model;

import lombok.*;

@NoArgsConstructor @Getter @Setter @ToString
public class PersonDTO {

    @Setter(AccessLevel.NONE)
    private Long id;
    private String name;
    private String surname;
    private String gender;
    private Integer age;

}
