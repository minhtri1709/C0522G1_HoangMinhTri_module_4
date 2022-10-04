package com.example.dto;

import com.example.model.contract.Contract;
import com.example.model.facility.FacilityType;
import com.example.model.facility.RentType;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class FacilityDto {
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

    private FacilityType facilityType;

    private RentType rentType;

    private Set<Contract> contractSet;

}
