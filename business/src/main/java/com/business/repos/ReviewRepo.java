package com.business.repos;

import com.business.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface ReviewRepo extends JpaRepository<Review, Integer> {
    List<Review> findByReviewerId(int id);

    List<Review> findAllByUserId(int id);
    List<Review> findAllByBusinessId(int id);
    List<Review> findAllByStarsGreaterThanEqual(int stars);
    List<Review> findAllByStarsLessThanEqual(int stars);
    List<Review> findAllByDateBefore(LocalDateTime date);
    List<Review> findAllByDateAfter(LocalDateTime date);
}
