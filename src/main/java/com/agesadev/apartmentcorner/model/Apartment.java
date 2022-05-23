package com.agesadev.apartmentcorner.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Apartment {

    private int id;
    private String apartmentName;
    private String apartmentAddress;
    private String apartmentLocation;
    private String apartmentCounty;
    private String description;
    private String imageUrl;
    private String price;
    private String bedrooms;
    private String bathrooms;
}
