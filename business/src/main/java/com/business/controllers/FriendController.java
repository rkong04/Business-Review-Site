package com.business.controllers;

import com.business.models.Friend;
import com.business.repos.FriendRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/friends")
public class FriendController {

    @Autowired
    private FriendRepo friendRepo;

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Friend>> getFriendById(@PathVariable int id) {

        return new ResponseEntity<Optional<Friend>>(friendRepo.findById(id), HttpStatus.OK);

    }


}


