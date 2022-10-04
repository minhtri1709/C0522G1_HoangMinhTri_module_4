package com.example.service.facility;

import com.example.model.customer.CustomerType;
import com.example.model.facility.RentType;

import java.util.List;

public interface IRenTypeService {
    List<RentType> findAll();
}
