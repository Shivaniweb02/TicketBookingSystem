package com.example.ticketbookingsystem.Controller;

import com.example.ticketbookingsystem.Model.Flight;
import com.example.ticketbookingsystem.Service.flightServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@CrossOrigin("*")
public class FlightController {
    @Autowired
    private flightServices  flightServices;

    @PostMapping("/AddFlight")
    public Flight addFlight(@RequestBody Flight flight)
    {
        return this.flightServices.addFlight(flight);
    }

    @GetMapping("/SearchFlight/{source}/{destination}")
    public List<Flight> searchFlight(@PathVariable("source") String source, @PathVariable("destination") String destination, @RequestBody Flight flight)
    {
       return this.flightServices.getFlightByDestination(source,destination);
    }


    @PutMapping("flitghupdate/{flightID}")
    public void updateFlight(@RequestBody Flight flight,@PathVariable int flightID)
    {
        this.flightServices.updateflight(flight,flightID);
    }

    @DeleteMapping("deleteFlight/{flightID}")
    public void deleteFlight(@PathVariable("flightID") int flightID)
    {
        this.flightServices.deleteFLight(flightID);
    }




}
