package com.example.hotel_packages_api.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Address {
    private Long no;
    private String street;
    private String city;
    private String province;

//    private String country;
}
