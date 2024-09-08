package com.business.controllers;

import com.business.models.Business;
import com.business.repos.BusinessRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/businesses")
public class BusinessController {

    @Autowired
    private BusinessRepo businessRepo;

    @GetMapping
    public ResponseEntity<List<Business>> getAllBusinesses() {

        return new  ResponseEntity<List<Business>>(businessRepo.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Business>> getBusinessById(@PathVariable int id) {

        return new ResponseEntity<Optional<Business>>(businessRepo.findById(id), HttpStatus.OK);

    }

}
