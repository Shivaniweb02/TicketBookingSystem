package com.example.ticketbookingsystem.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;

@Entity
@Getter
@Setter
public class Flight {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer flightID;
  private String FlightName;
  private String source;
  private String destination;
  private String boardingTime;
  private int duration;
  private boolean layover;
  private String layover_city;

}
