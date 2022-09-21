package com.example.model.facility;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int area;

    private double cost;

    private int maxPeople;

    private String standardRoom;

    private String descriptionOtherConvenience;

    private double poolArea;

    private int numberOfFloors;

    private String facilityFree;

    @ManyToOne
    @JoinColumn(name = "facility_type_id", referencedColumnName = "id")
    private FacilityType facilityType;

    @ManyToOne
    @JoinColumn(name = "rent_type_id", referencedColumnName = "id")
    private RentType rentType;

    public Facility() {
    }

    public Facility(int id, String name, int area, double cost, int maxPeople,
                    String standardRoom, String descriptionOtherConvenience, double poolArea, int numberOfFloors,
                    String facilityFree, FacilityType facilityType, RentType rentType) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
        this.facilityFree = facilityFree;
        this.facilityType = facilityType;
        this.rentType = rentType;
    }
}
