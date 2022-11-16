
	
	package com.project.OFH.service;
	import java.time.LocalDate;
	import java.util.List;
	import com.project.OFH.entity.*;
	public interface ReviewService {
	Review createReview(Review review);
	List<Review> getReviews();
	Review updateReview(Review review);
	Review deleteReview(String username);
		
	Review filterReview(String username);
	List<Review> filterByDate(LocalDate date);
	List<Review> sortReview();
		
	}



