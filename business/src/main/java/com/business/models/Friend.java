package com.business.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(Friend.class)
public class Friend {

    @Id
    @OneToOne
    @JoinColumn(name = "userId")
    private Users mainUser;

    @Id
    @OneToOne
    @JoinColumn(name = "friendId")
    private Users userFriends;

}
