package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "concert")
@Getter
@Setter
@ToString
@NoArgsConstructor

public class Concert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 500)
    private String posterUrl;

    @Column(nullable = false)
    private int price;

    @Lob
    @Column(nullable = false)
    private String content;
}