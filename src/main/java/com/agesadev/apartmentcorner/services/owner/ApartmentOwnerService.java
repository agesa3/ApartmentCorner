package com.agesadev.apartmentcorner.services.owner;

import com.agesadev.apartmentcorner.dto.owner.ApartmentOwnerRequestDto;
import com.agesadev.apartmentcorner.dto.owner.ApartmentOwnerResponseDto;

import java.util.List;

public interface ApartmentOwnerService {

    void addOwner(ApartmentOwnerRequestDto apartmentOwnerDto);

    List<ApartmentOwnerResponseDto> getAllOwners();

    //update owner
    String updateOwner(ApartmentOwnerRequestDto apartmentOwnerDto, String ownerId);

    //find by id
    ApartmentOwnerResponseDto getOwnerById(String ownerId);

}
