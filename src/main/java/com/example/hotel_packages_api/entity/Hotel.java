package com.example.hotel_packages_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "hotels")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hotelId;
    private String contactNumber;
    private String photos;
    private String logo;
    private String password;
    private String email;
    private byte superDealLimit;
    private byte boostPackageLimit;
    private String name;
    private String address;


    @OneToMany(mappedBy = "hotel",cascade = CascadeType.ALL)
    private List<Review> review;

    @OneToMany(mappedBy = "hotel",cascade = CascadeType.ALL)
    private List<BoostPackage> boostPackages;

    @OneToMany(mappedBy = "hotel",cascade = CascadeType.ALL)
    private List<SuperDeal> superDeals;

    @OneToMany(mappedBy = "hotel",cascade = CascadeType.ALL)
    private List<Package> packages;

    @ManyToMany
    @JoinTable(name = "hotel_notification",joinColumns = @JoinColumn(name = "hotel_id"),inverseJoinColumns = @JoinColumn(name = "notification_id"))
    private List<Notification> notifications;

    @OneToOne
    private Menu menu;

    @OneToMany(mappedBy = "hotel",cascade = CascadeType.ALL)
    private List<HotelImages> hotelImages;

    @OneToMany(mappedBy = "hotel",cascade = CascadeType.ALL)
    private List<HotelContactNumber> hotelContactNumbers;


}
