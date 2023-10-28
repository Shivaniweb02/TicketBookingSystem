package com.example.ticketbookingsystem.Repository;

import com.example.ticketbookingsystem.Model.Flight;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.function.Function;

@Repository
public interface FlightRepo extends JpaRepository<Flight,Integer> {
    @Query("SELECT f FROM Flight f WHERE f.source = :source AND f.destination = :destination")
    public List<Flight> findbySourceAndDestination(String source, String destination);
}
