package com.example.hotel_packages_api.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "super_deals")
public class SuperDeal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double discountPercentage;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String adminApproveStatus;

    @OneToOne
    @JoinColumn(name = "package_id")
    private Package packageId;

    @ManyToOne
    private Hotel hotel;
}
