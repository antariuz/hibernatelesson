package model;

import lombok.*;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@NoArgsConstructor @Getter @Setter @ToString
public class CarDTO {

    @Setter(AccessLevel.NONE)
    private Long id;
    private Long driverID;
    private String brand;
    private String model;
    private String engineType;
    private Integer manufacturedYear;

}
