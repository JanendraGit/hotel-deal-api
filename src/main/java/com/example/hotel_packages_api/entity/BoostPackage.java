package com.example.hotel_packages_api.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "boost_packages")
public class BoostPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime boostDate;

    @OneToOne
    @JoinColumn(name = "package_Id")
    private Package hotelPackage;

    @ManyToOne
    private Hotel hotel;
}
