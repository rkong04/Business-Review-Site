package com.business.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Review {

    @Id
    private Integer reviewId;

    @OneToOne
    @JoinColumn(name = "userId")
    private Users user;

    @OneToOne
    @JoinColumn(name = "businessId")
    private Business business;

    @Column(nullable = false) //between 1 and 5
    private Integer stars;

    private LocalDateTime date = LocalDateTime.now();


}
