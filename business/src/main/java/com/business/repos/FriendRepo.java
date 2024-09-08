package com.business.repos;

import com.business.models.Friend;
import com.business.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FriendRepo extends JpaRepository<Friend, Integer> {

    List<Friend> findAllByMainUser(Users user);
}
