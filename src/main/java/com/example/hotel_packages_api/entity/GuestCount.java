package com.example.hotel_packages_api.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class GuestCount {
    private int adults;
    private int children;
}
