package kz.bitlab.danikKolesaProject.dto;

import kz.bitlab.danikKolesaProject.model.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarDTO {
    private Long id;
    private CarBrand carBrand;
    private String model;
    private String color;
    private double volume;
    private City city;
    private int yearOfManufacturer;
    private int price;
    private Boolean isKazakh;
    private BodyStyle bodyStyle;
    private DriveTrain driveTrain;
    private Transmission typeOfTransmission;
    private int mileage;
    private String description;
}
