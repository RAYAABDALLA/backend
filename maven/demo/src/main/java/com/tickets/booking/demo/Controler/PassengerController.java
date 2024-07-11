package com.tickets.booking.demo.Controler;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tickets.booking.demo.Model.Passenger;
import com.tickets.booking.demo.Services.PassengerService;

@RestController
@RequestMapping ("api/Passenger")
public class PassengerController {
    @Autowired
    private PassengerService passengerServices;

    @PostMapping
    public ResponseEntity<Passenger>createPassenger (@RequestBody Passenger Passenger){
        Passenger savedPassenger = passengerServices.createUser(Passenger);
    return new ResponseEntity<>(savedPassenger, HttpStatus.CREATED);
    
    }
    
    
} 
    

