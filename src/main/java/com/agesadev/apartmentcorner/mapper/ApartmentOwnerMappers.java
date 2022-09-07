package com.agesadev.apartmentcorner.mapper;

import com.agesadev.apartmentcorner.dto.owner.ApartmentOwnerResponseDto;
import com.agesadev.apartmentcorner.model.ApartmentOwner;

public class ApartmentOwnerMappers {

    public static ApartmentOwnerResponseDto mapToApartmentOwnerResponseDto(ApartmentOwner apartmentOwner) {
        return ApartmentOwnerResponseDto.builder()
                .id(apartmentOwner.getId().toString())
                .firstName(apartmentOwner.getFirstName())
                .lastName(apartmentOwner.getLastName())
                .email(apartmentOwner.getEmail())
                .location(apartmentOwner.getLocation())
                .phoneNumber(apartmentOwner.getPhoneNumber())
                .build();
    }
}

