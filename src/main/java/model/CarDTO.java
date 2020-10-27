package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@NoArgsConstructor @Getter @Setter @ToString
public class CarDTO {

    private Long id;
    private Long driverID;
    private String brand;
    private String model;
    private String engineType;
    private Integer manufacturedYear;

}
