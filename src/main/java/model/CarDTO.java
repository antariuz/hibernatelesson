package model;

import lombok.*;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@NoArgsConstructor @Getter @Setter @ToString @AllArgsConstructor
public class CarDTO extends AbstractIdentifiableEntity {

    private Long driver;
    private String brand;
    private String model;
    private String engineType;
    private Integer manufacturedYear;

}
