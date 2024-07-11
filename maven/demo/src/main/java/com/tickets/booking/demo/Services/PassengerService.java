package com.tickets.booking.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tickets.booking.demo.Model.Passenger;
import com.tickets.booking.demo.Repository.PassengerRepository;

@Service
public class PassengerService {

    @Autowired
   private PassengerRepository passengerRepo;
   
   public Passenger createUser(Passenger passenger){
    return passengerRepo.save(passenger);
    }

    public List<Passenger> getAllUsers(){
        return passengerRepo.findAll();
    }

    public Passenger getPassengerById(Long passenger){
        Optional<Passenger> passengerId =passengerRepo.findById(passenger);
        return passengerId.get();
    }
    public void deletepassenger(Long passenger){
        passengerRepo.deleteById(passenger);
    }

    public Passenger updatPassenger(Long passengerId, Passenger passenger){
       Passenger oldPassenger=passengerRepo.findById(passengerId).orElseThrow();
       oldPassenger.setPassengerId(passenger.getPassengerId());
       oldPassenger.setPassengername(passenger.getPassengername());
      oldPassenger.setSeatNumber(passenger.getSeatNumber());
      oldPassenger.setBusRoute(passenger.getBusRoute());
       oldPassenger.setBookingDate(passenger.getBookingDate());

       Passenger updatedPassenger =passengerRepo.save(oldPassenger);
        return updatedPassenger;
       
    }
}


