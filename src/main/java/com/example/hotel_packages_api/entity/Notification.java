package com.example.hotel_packages_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "notifications")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;
    private LocalDateTime sentDate;
    private LocalDateTime sentTime;
    private String starred;

    @ManyToOne
    private Admin admin;

    @ManyToMany
    @JoinTable(name = "customer_notification",joinColumns = @JoinColumn(name = "notification_id"),inverseJoinColumns = @JoinColumn(name = "customer_id"))
    private List<Customer> customers;

    @ManyToMany
    @JoinTable(name = "hotel_notification",joinColumns = @JoinColumn(name = "notification_id"),inverseJoinColumns = @JoinColumn(name = "hotel_id"))
    private List<Hotel> hotels;
}
