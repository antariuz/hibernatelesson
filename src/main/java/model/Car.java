package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@ToString @Entity @Table(name = "cars")
public class Car {

    @Getter @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter @Setter @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "driver_id")
    private Long driverID;

    @Getter @Setter
    private String brand;

    @Getter @Setter
    private String model;

    @Getter @Setter
    private String engineType;

    @Getter @Setter
    private Integer manufacturedYear;

    public Car() {
    }

}
