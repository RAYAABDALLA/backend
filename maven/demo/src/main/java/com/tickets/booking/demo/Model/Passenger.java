package com.tickets.booking.demo.Model;


import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;


@Entity
@Table(name="passenger")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Passenger{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long passengerId;
    private String Passengername;
    private String SeatNumber;
    private String BusRoute;
    private LocalDate BookingDate;
    
  
 
}
