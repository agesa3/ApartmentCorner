package com.agesadev.apartmentcorner.services.owner;

import com.agesadev.apartmentcorner.dto.owner.ApartmentOwnerRequestDto;
import com.agesadev.apartmentcorner.dto.owner.ApartmentOwnerResponseDto;

import java.util.List;

public interface ApartmentOwnerService {

    void addOwner(ApartmentOwnerRequestDto apartmentOwnerDto);
    List<ApartmentOwnerResponseDto> getAllOwners();


}
