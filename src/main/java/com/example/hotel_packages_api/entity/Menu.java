package com.example.hotel_packages_api.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "menus")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double breakfastPrice;
    private double lunchPrice;
    private double dinnerPrice;

}
