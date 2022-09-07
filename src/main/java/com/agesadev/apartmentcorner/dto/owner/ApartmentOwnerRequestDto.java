package com.agesadev.apartmentcorner.dto.owner;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApartmentOwnerRequestDto {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String location;
    private String idNumber;
}
