package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class CarDTO {

    @Getter
    private Long id;

    @Getter @Setter
    private Long driverID;

    @Getter @Setter
    private String brand;

    @Getter @Setter
    private String model;

    @Getter @Setter
    private String engineType;

    @Getter @Setter
    private Integer manufacturedYear;

    public CarDTO() {
    }

}
