package com.example.BookingTable.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookingTable.Model.Booking;
import com.example.BookingTable.Repository.BookingRepository;

@Service
public class BookingService {
	
    @Autowired
	private BookingRepository bookingRepository;
    
    public Booking saveBooking(Booking booking)
    {
    	return bookingRepository.save(booking);
    }
}
