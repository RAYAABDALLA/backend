package com.tickets.booking.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tickets.booking.demo.Model.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}
