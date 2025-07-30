package com.example.BookingTable.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookingTable.Model.Booking;
import com.example.BookingTable.Service.BookingService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping
public class BookingController 
{

	@Autowired
	private BookingService bookingService;
	
	@PostMapping("/booking")
	 public Booking createBooking(@RequestBody Booking booking) {
        return bookingService.saveBooking(booking);
    }
	
}
