package com.tickets.booking.demo.Controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tickets.booking.demo.Model.Bus;
import com.tickets.booking.demo.Services.BusService;

@RestController
@RequestMapping ("api/buss")
public class BusController{
    
 @Autowired
    private BusService busServices;

@PostMapping
    public Bus createBus(@RequestBody Bus bus){
       return busServices.createBus(bus);
    }
@GetMapping //vuta data zote
     public List<Bus> getAllBus(){
        return busServices.getAllBus();
    }
@GetMapping("/{id}")
     public Optional<Bus> getBusById(@PathVariable Long id){
        return busServices.getBusById(id);
    }

    @DeleteMapping("/{id}")
public ResponseEntity<String> deleteBus(@PathVariable("id") Long bus){
    busServices.deletebus(bus);
    return new ResponseEntity<String>("bus is already deleted" , HttpStatus.OK);
}

@PutMapping("/{id}")
public Bus updateBus(@PathVariable Long id, @RequestBody Bus bus) {
    return busServices.updateBus(id, bus);
}
}


