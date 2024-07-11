package com.tickets.booking.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tickets.booking.demo.Model.Route;
import com.tickets.booking.demo.Repository.RouteRepository;

@Service
public class RouteService {
    @Autowired
    private RouteRepository routeRepo;

       public Route createRoute(Route route){
        return routeRepo.save(route);
        }
    
        public List<Route> getAllRoute(){
            return routeRepo.findAll();
        }
    
        public Route getRouteById(Long route){
            Optional<Route> routeId =routeRepo.findById(route);
            return routeId.get();
        }
        public void deleterroute(Long route){
            routeRepo.deleteById(route);
        }
    
        public Route updatRoute(Long routeId, Route route){
           Route oldRoute=routeRepo.findById(routeId).orElseThrow();
           oldRoute.setDistance(route.getDistance());
    
           Route updatedRoute =routeRepo.save(oldRoute);
            return updatedRoute;
           
        }
    }
    

