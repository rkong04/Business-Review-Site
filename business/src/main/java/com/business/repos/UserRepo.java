package com.business.repos;

import com.business.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface UserRepo extends JpaRepository<Users, Integer> {

    List<Users> findByUserId(Integer id);

    List<Users> findAllByNameIgnoreCase(String name);

    List<Users> findAllByNameContainingIgnoreCase(String name);

    List<Users> findAllByReviewCountGreaterThanEqual(Integer review_count);

    List<Users> findAllByReviewCountLessThanEqual(Integer review_count);

    List<Users> findAllByAccCreatedAfter(LocalDateTime accCreated);

    List<Users> findAllByAccCreatedBefore(LocalDateTime accCreated);

}
