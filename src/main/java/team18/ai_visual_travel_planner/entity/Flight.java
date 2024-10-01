package team18.ai_visual_travel_planner.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String date;

    @Column(nullable = false)
    private String departureCity;

    @Column(nullable = false)
    private String arrivalCity;

    @Column(nullable = false)
    private LocalDateTime departureTime;

    @Column(nullable = false)
    private LocalDateTime arrivalTime;

    private String airline;
    private String flightNumber;
    private String straight;
    private String flightTime;
    private double price;
    private String airlineImg;
}
