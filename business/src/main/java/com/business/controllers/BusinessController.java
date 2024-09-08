package com.business.controllers;

import com.business.models.Business;
import com.business.repos.BusinessRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/businesses")
public class BusinessController {

    @Autowired
    private BusinessRepo businessRepo;

    @GetMapping
    public ResponseEntity<List<Business>> getAllBusinesses() {

        return new  ResponseEntity<List<Business>>(businessRepo.findAll(), HttpStatus.OK);
    }
}
