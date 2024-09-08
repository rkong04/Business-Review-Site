package com.business.repos;

import com.business.models.Business;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface BusinessRepo extends JpaRepository<Business, Integer> {

    List<Business> findAllByName(String n);

    List<Business> findAllByNameIgnoreCase(String n);

    List<Business> findAllByNameContainingIgnoreCase(String n);

    List<Business> findAllByBusinessId(Integer id);

    List<Business> findAllByCityIgnoreCase(String city);

    List<Business> findAllByPostalCodeIgnoreCase(String postal);

    List<Business> findAllByAddressIgnoreCase(String address);

    List<Business> findAllByStarsGreaterThanEqual(double stars);

    List<Business> findAllByStarsLessThanEqual(double stars);

    List<Business> findAllByReviewCountGreaterThanEqual(Integer reviewCount);

    List<Business> findAllByReviewCountLessThanEqual(Integer reviewCount);


}
