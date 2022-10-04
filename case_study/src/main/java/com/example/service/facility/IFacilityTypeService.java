package com.example.service.facility;

import com.example.model.customer.CustomerType;
import com.example.model.facility.FacilityType;
import com.example.service.impl.facility_service.FacilityService;

import java.util.List;

public interface IFacilityTypeService {
    List<FacilityType> findAll();
}
