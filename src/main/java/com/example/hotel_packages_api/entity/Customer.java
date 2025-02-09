package com.example.hotel_packages_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;
    private String profilePhoto;

    @ManyToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<Notification> notifications;

    @OneToOne
    private LoyaltyPoint loyaltyPoint;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<Review> review;
}
