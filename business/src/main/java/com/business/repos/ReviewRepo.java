package com.business.repos;

import com.business.models.Business;
import com.business.models.Review;
import com.business.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface ReviewRepo extends JpaRepository<Review, Integer> {

    List<Review> findAllByUser(Users user);

    List<Review> findAllByBusiness(Business business);

    List<Review> findAllByStarsGreaterThanEqual(int stars);

    List<Review> findAllByStarsLessThanEqual(int stars);

    List<Review> findAllByDateBefore(LocalDateTime date);

    List<Review> findAllByDateAfter(LocalDateTime date);

}
