package com.business.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
public class User {

    @Id
    private Integer user_id;

    @Column(nullable = false)
    private String name;


    private Integer review_count = 0;

    private LocalDateTime acc_created = LocalDateTime.now();

}
