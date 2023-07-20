package kz.bitlab.danikKolesaProject.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "car")
@Getter
@Setter
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @ManyToOne
    private CarBrand carBrand;
    @Column(name = "model")
    private String model;
    @Column(name = "color")
    private String color;
    @Column(name = "volume")
    private double volume;
    @ManyToOne
    private City city;
    @Column(name = "year_of_manufacturer")
    private int yearOfManufacturer;
    @Column(name = "price")
    private int price;
    @Column(name = "is_kazakh")
    private Boolean isKazakh;
    @ManyToOne
    private BodyStyle bodyStyle;
    @ManyToOne
    private DriveTrain driveTrain;
    @ManyToOne
    private Transmission typeOfTransmission;
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;
    @Column(name = "mileage")
    private int mileage;
}
