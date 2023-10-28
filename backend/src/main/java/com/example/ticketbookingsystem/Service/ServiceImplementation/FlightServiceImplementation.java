package com.example.ticketbookingsystem.Service.ServiceImplementation;

import com.example.ticketbookingsystem.Model.Flight;
import com.example.ticketbookingsystem.Repository.FlightRepo;
import com.example.ticketbookingsystem.Service.flightServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightServiceImplementation implements flightServices {
    @Autowired
    private FlightRepo flightRepo;
    @Override
    public Flight addFlight(Flight flight) {
        return this.flightRepo.save(flight);
    }

    public List<Flight> getFlightByDestination(String src, String dest)
    {
            return this.flightRepo.findbySourceAndDestination(src,dest);
    }

    @Override
    public void updateflight(Flight flight, int flightId) {
        Optional<Flight> flight1=this.flightRepo.findById(flightId);
        if(flight1.isPresent())
        this.flightRepo.save(flight);
    }

    @Override
    public void deleteFLight(int flightid) {
        this.flightRepo.deleteById(flightid);
    }
}
