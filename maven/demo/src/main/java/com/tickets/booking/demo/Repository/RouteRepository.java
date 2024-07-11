package com.tickets.booking.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tickets.booking.demo.Model.Route;

public interface RouteRepository extends JpaRepository<Route, Long> {
}


