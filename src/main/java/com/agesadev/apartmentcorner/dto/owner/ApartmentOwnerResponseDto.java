package com.agesadev.apartmentcorner.dto.owner;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApartmentOwnerResponseDto {
    private String id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String location;
}
