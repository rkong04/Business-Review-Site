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
public class Users {

    @Id
    private Integer userId;

    @Column(nullable = false)
    private String name;

    private Integer reviewCount;

    private LocalDateTime accCreated = LocalDateTime.now();

}
