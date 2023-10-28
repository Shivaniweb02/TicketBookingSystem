package com.example.ticketbookingsystem.Service.ServiceImplementation;

import com.example.ticketbookingsystem.Model.Booking;
import com.example.ticketbookingsystem.Repository.BookingRepo;
import com.example.ticketbookingsystem.Service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImplementation implements BookingService {

    @Autowired
    private BookingRepo bookingRepo;
    @Override
    public Booking addBooking(Booking booking) {
        return this.bookingRepo.save(booking);
    }

    @Override
    public List<Booking> getallbooking() {
return this.bookingRepo.findAll();
    }

    @Override
    public void updatebooking(Booking booking,int bookingid) {
        if(this.bookingRepo.findById(bookingid).isPresent())
            this.bookingRepo.save(booking);

    }

    @Override
    public void delBooking(int bookingid) {
    this.bookingRepo.deleteById(bookingid);
    }
}
