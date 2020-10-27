package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@NoArgsConstructor @Getter @Setter @ToString @Entity @Table(name = "car")
public class Car {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany(fetch = FetchType.LAZY) @JoinColumn(name = "driver_id")
    private Long driverID;
    private String brand;
    private String model;
    private String engineType;
    private Integer manufacturedYear;

}
