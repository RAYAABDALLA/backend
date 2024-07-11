package com.tickets.booking.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tickets.booking.demo.Model.Bus;
import com.tickets.booking.demo.Repository.BusRepository;

@Service
public class BusService {
    @Autowired
    private BusRepository busRepo;

    public Bus createBus(Bus bus){
        return busRepo.save(bus);
        }
    
        public List<Bus> getAllBus(){
            return busRepo.findAll();
        }
    
        public Optional<Bus> getBusById(Long id){
            return busRepo.findById(id);
        }
     
        public void deletebus(Long bus){
            busRepo.deleteById(bus);
        }
    
        public Bus updateBus(Long BusId,Bus bus){
        bus.setBusId(BusId);
        return busRepo.save(bus);
          }

   
        }
    
    
    


