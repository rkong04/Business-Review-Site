package com.business.repos;

import com.business.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface UserRepo extends JpaRepository<User, Integer> {

    List<User> findByUser_id(Integer id);

    List<User> findAllByNameIgnoreCase(String name);

    List<User> findAllByNameContainingIgnoreCase(String name);

    List<User> findAllByReview_countGreaterThanEqual(Integer review_count);

    List<User> findAllByReview_countLessThanEqual(Integer review_count);

    List<User> findAllByAcc_createdAfter(Date created);

    List<User> findAllByAcc_createdBefore(Date created);

}
