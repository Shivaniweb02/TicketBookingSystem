package com.example.ticketbookingsystem.Controller;

import com.example.ticketbookingsystem.Model.Booking;
import com.example.ticketbookingsystem.Service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookingController {
    @Autowired
    private BookingService bookingService;
    @PostMapping("/booking")
    public Booking addBooking(@RequestBody Booking booking){
       return this.bookingService.addBooking(booking);
    }

    @GetMapping("/showAllBooking/{BookingID}")
    public void showallbooking(){

        this.bookingService.getallbooking();
    }
    @DeleteMapping("/cancelTicket/{BookingID}")
    public void delBooking(@PathVariable("BookingID") int BookingID){
        this.bookingService.delBooking(BookingID);
    }

    @PutMapping("/updateBooking/{BookingID}")
    public void updateBooking(@RequestBody Booking booking,@PathVariable("BookingID") int bookingid){
        this.bookingService.updatebooking(booking,bookingid);
    }



}
