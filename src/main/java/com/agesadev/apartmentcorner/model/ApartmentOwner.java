package com.agesadev.apartmentcorner.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApartmentOwner {
    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;


}
