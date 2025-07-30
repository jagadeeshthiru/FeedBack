package com.example.Feedback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Feedback.model.Review;
import com.example.Feedback.repository.ReviewRepository;

@Service
public class ReviewService 
{
	@Autowired
   private ReviewRepository reviewRepository; 
   public Review saveReview(Review review)
   {
		return reviewRepository.save(review);
   }  
}
