package com.example.hotel_packages_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "packages")
public class Package {
    private String description;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String status;
    private String image;
    private String termsAndConditions;
    private double price;
    private Integer visitors;
    private String name;
    private LocalDateTime endDate;
    private LocalDateTime startDate;
    private int guestCount;
    private GuestCount count;

    @ManyToOne
    private Hotel hotel;

    @OneToOne(mappedBy = "hotelPackage", cascade = CascadeType.ALL)
    private BoostPackage boostPackage;

    @OneToOne(mappedBy = "packageId", cascade = CascadeType.ALL)
    private SuperDeal superDeal;

    @ManyToOne
    @JoinColumn(name = "packageType_id")
    private PackageType packageType;

    @ManyToOne
    private Menu menu;

    @OneToMany(mappedBy = "package_Image_Id", cascade = CascadeType.ALL)
    private List<PackageImage> packageImages;
}
