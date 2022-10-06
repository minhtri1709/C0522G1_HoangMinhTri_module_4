package com.example.service.facility;

import com.example.model.customer.Customer;
import com.example.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IFacilityService {
    Page<Facility> findAll(Pageable pageable);

    void save(Facility facility);

    void delete(int id);

    Optional<Facility> findById(int id);

    Page<Facility> search(Pageable pageable, String name);
}
