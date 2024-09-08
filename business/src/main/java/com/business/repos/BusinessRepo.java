package com.business.repos;

import com.business.models.Business;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BusinessRepo extends JpaRepository<Business, Integer> {

    List<Business> findAllByName(String n);

    List<Business> findAllByNameIgnoreCase(String n);

    List<Business> findAllByNameContainingIgnoreCase(String n);

    List<Business> findAllByBusiness_id(Integer id);

    List<Business> findAllByCityIgnoreCase(String city);

    List<Business> findAllByPostal_codeIgnoreCase(String postal);

    List<Business> findAllByAddressIgnoreCase(String address);

    List<Business> findAllByStarsGreaterThanEqual(double stars);

    List<Business> findAllByStarsLessThanEqual(double stars);

    List<Business> findAllByReview_countGreaterThanEqual(Integer reviewCount);

    List<Business> findAllByReview_countLessThanEqual(Integer reviewCount);


}
