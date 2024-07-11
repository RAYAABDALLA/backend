package com.tickets.booking.demo.Controler;

import java.util.List;

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

import com.tickets.booking.demo.Model.Route;
import com.tickets.booking.demo.Services.RouteService;

@RestController
@RequestMapping("api/route")
public class RouteController {
     @Autowired
    private RouteService routeServices;

@PostMapping
    public ResponseEntity<Route>createRoute (@RequestBody Route route){
       Route savedRoute = routeServices.createRoute(route);
    return new ResponseEntity<>(savedRoute, HttpStatus.CREATED);
    }
@GetMapping //vuta data zote
    public ResponseEntity<List<Route>> getAllRoute(){
        List<Route> route = routeServices.getAllRoute();
        return new ResponseEntity<>(route, HttpStatus.OK);
    }
@GetMapping("/{id}")
    public ResponseEntity<Route> getRouteById(@PathVariable("id") Long routeId){
        //bind using @pathVariable
    Route route = routeServices.getRouteById(routeId);
    return new ResponseEntity<>(route, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
public ResponseEntity<String> deleteRoute(@PathVariable("id") Long route){
    routeServices.deleterroute(route);
    return new ResponseEntity<String>("route is already deleted" , HttpStatus.OK);
}

@PutMapping("/{id}")
public ResponseEntity<Route> update(@PathVariable("id") Long routeId, @RequestBody Route route){
    
    Route updatRoute = routeServices.updatRoute(routeId ,route);
    return new ResponseEntity<>(updatRoute,HttpStatus.OK);
}
}

