package com.example.ticketbookingsystem.Service;

import com.example.ticketbookingsystem.Model.Booking;

import java.util.List;

public interface BookingService {

    public Booking addBooking(Booking booking);
    public List<Booking> getallbooking();
    public void updatebooking(Booking booking, int bookingid);
    public void delBooking(int bookingid);
}
