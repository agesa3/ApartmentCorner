package com.agesadev.apartmentcorner.services.owner;

import com.agesadev.apartmentcorner.model.ApartmentOwner;

import java.util.List;

public interface ApartmentOwnerService {

    void addOwner(ApartmentOwner apartmentOwner);

    List<ApartmentOwner> getAllOwners();

    ApartmentOwner findApartmentOwnerById(int id);

    ApartmentOwner findByEmail(String email);


}
