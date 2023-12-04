package com.rating.services;

import com.rating.entities.Rating;

import java.util.List;

public interface RatingService {

    Rating saveRating(Rating rating);

    List<Rating> getAllRating();

    List<Rating> getAllByUserId(String userId);

    List<Rating> getAllByHotelId(String HotelId);

}
