package com.example.hotel_packages_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "reviews")
public class PackageType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "packageType",cascade = CascadeType.ALL)
    private List<Package> packages;

    @ManyToMany
    @JoinTable(name = "packageType_facilities",joinColumns = @JoinColumn(name = "package_type_id"),inverseJoinColumns = @JoinColumn(name = "facility_id"))
    private List<Facility> facilities;
}
