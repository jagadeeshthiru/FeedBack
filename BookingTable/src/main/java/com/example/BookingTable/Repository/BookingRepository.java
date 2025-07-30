package com.example.BookingTable.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.BookingTable.Model.Booking;

@Repository
public interface BookingRepository extends MongoRepository<Booking, String> 
{
   
}
