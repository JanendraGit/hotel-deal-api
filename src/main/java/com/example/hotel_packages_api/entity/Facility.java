package com.example.hotel_packages_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "facilities")
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String facilityName;
    private String category;

    @ManyToMany(mappedBy = "facilities",cascade = CascadeType.ALL)
    private List<PackageType> packageType;

}
