package model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor @Getter @Setter @ToString @Entity @Table(name = "car") @AllArgsConstructor
public class Car extends AbstractIdentifiableEntity {

    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "driver_id")
    private Person driver;
    private String brand;
    private String model;
    private String engineType;
    private Integer manufacturedYear;

}
