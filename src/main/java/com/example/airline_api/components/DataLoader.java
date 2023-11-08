package com.example.airline_api.components;

import com.example.airline_api.models.Flight;
import com.example.airline_api.models.Passenger;
import com.example.airline_api.repositories.FlightRepository;
import com.example.airline_api.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PassengerRepository passengerRepository;

    @Autowired
    FlightRepository flightRepository;

    public DataLoader(){
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

//        ZANZIBAR
        Flight zanzibarFlight = new Flight("Zanzibar", 100, "Wedenesday 8th November", "19:00");
        flightRepository.save(zanzibarFlight);

        Passenger mehlia = new Passenger("Mehlia", "mellz@gmail.com");
        mehlia.addFlight(zanzibarFlight);
        passengerRepository.save(mehlia);

//        BALI
        Flight baliFlight = new Flight("Bali", 95, "Thursday 9th November", "12:30");
        flightRepository.save(baliFlight);

        Passenger foridha = new Passenger("Foridha", "foridha@gmail.com");
        foridha.addFlight(baliFlight);
        passengerRepository.save(foridha);

        Passenger rayster = new Passenger("Rayster", "rayz@gmail.com");
        rayster.addFlight(baliFlight);
        passengerRepository.save(rayster);


//        MONTEGO BAY
        Flight montegoBayFlight = new Flight("Montego Bay", 75, "Friday 10th November", "8:00");
        flightRepository.save(montegoBayFlight);

        Passenger janet = new Passenger("Janet", "janet@gmail.com");
        janet.addFlight(montegoBayFlight);
        passengerRepository.save(janet);

        Passenger kacper = new Passenger("Kacper", "kacpertheghost@gmail.com");
        kacper.addFlight(montegoBayFlight);
        passengerRepository.save(kacper);
    }





}
