package com.example.airline_api.services;

import com.example.airline_api.models.Flight;
import com.example.airline_api.repositories.FlightRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    @Transactional
    public void addFlight(Flight flight){
        flightRepository.save(flight);
    }

    @Transactional
    public List<Flight> getAllFlights(){
        return flightRepository.findAll();
    }

    @Transactional
    public Flight getFlightById(Long id){
        return flightRepository.findById(id).orElse(null);
    }

    @Transactional
    public void cancelFlight(Flight flight){
        flightRepository.delete(flight);
    }

}
