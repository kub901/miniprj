package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import lombok.ToString;

@Entity
@Table(name = "member")
@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = "password")

public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "member_id", nullable = false, length = 20)
    private String memberId;

    @Column(name = "password", nullable = false, length = 20)
    private String password;

    @Column(name = "email", nullable = false, unique = true, length = 30)
    private String email;

    @Column(name = "name", nullable = false, length = 5)
    private String name;

    @Column(name = "phone_number", nullable = false, length = 13)
    private String phoneNumber;

    @Column(name = "reg_date")
    private LocalDateTime regDate;
}