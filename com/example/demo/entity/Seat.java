package com.example.demo.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "seat")
@Getter @Setter
@NoArgsConstructor

public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "concertSchedule_id")
    private ConcertSchedule concertSchedule;

    @Column(nullable = false, length = 20)
    private String seatNumber;

    @Column(length = 20)
    private String status; // 선택 가능 / 선택됨 / 예매완료

    @Column(nullable = false)
    private Integer price;
}