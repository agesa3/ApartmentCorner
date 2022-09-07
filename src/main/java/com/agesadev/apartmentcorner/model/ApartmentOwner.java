package com.agesadev.apartmentcorner.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(value = "apartment_owner")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApartmentOwner {


    @Id
    private String ownerId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String location;
    private String idNumber;


}
