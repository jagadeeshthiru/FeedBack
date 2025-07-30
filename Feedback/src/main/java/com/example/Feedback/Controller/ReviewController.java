package com.example.Feedback.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Feedback.model.Review;
import com.example.Feedback.service.ReviewService;

@RestController
@RequestMapping
public class ReviewController 
{
  @Autowired
  public ReviewService reviewService;
  
  @PostMapping("/review")
  public Review createReview(@RequestBody Review review)
  {
	  return reviewService.saveReview(review);
  }
  
}
