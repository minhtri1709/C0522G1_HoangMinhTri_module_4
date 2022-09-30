package com.example.controller;

import com.example.model.Phone;
import com.example.service.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("phone/v1")
@CrossOrigin
public class PhoneController {

    @Autowired
    private IPhoneService iPhoneService;


    @GetMapping
    public ResponseEntity<Iterable<Phone>> showList(){
        return new ResponseEntity<>(iPhoneService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Phone> createPhone(@RequestBody Phone phone){
        return new ResponseEntity<>(iPhoneService.save(phone),HttpStatus.OK);
    }

    @GetMapping("/update/{id}")
    public ResponseEntity<Phone> showById(@PathVariable int id){
        Phone smartphone = iPhoneService.findById(id).get();
        if (smartphone == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(smartphone, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity saveUpdate(@PathVariable int id,@RequestBody Phone phone) {
        Optional<Phone> findPhone = iPhoneService.findById(id);
        if (!findPhone.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        findPhone.get().setProducer(phone.getProducer());
        findPhone.get().setModel(phone.getModel());
        findPhone.get().setPrice(phone.getPrice());
        iPhoneService.save(findPhone.get());
        return new ResponseEntity(findPhone, HttpStatus.OK);
    }
}
