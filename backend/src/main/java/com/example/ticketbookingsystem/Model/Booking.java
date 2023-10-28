package com.example.ticketbookingsystem.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookingID;
//    private int flightID;
    private String date;
    private double fare;
    private String seat;
//    private String Airportname;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="userID")
    private User user;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "flightID")
    private Flight flight;



}
