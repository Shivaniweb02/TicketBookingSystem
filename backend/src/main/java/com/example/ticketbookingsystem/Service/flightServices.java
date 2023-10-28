package com.example.ticketbookingsystem.Service;

import com.example.ticketbookingsystem.Model.Flight;

import java.util.List;

public interface flightServices {
 public Flight addFlight(Flight flight);
 public List<Flight> getFlightByDestination(String src, String dest);
 public void updateflight(Flight flight,int flightId);
 public void deleteFLight(int flight);
}
