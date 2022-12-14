package com.example.service.impl.facility;

import com.example.model.facility.RentType;
import com.example.repository.facility.IRentTypeRepository;
import com.example.service.facility.IRenTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeService implements IRenTypeService {

    @Autowired
    private IRentTypeRepository rentTypeRepository;

    @Override
    public List<RentType> findAll() {
        return rentTypeRepository.findAll();
    }
}
