package com.example.controller;

import com.example.model.Phone;
import com.example.service.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

//    @GetMapping("/{id}")
//    public ResponseEntity<Phone> showById(@PathVariable int id){
//       return new ResponseEntity<Phone>(iPhoneService.findById(id),HttpStatus.OK);
//    }
}
