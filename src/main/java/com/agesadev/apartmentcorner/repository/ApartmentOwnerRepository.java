package com.agesadev.apartmentcorner.repository;

import com.agesadev.apartmentcorner.model.ApartmentOwner;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ApartmentOwnerRepository extends MongoRepository<ApartmentOwner,String> {

    ApartmentOwner findByEmail(String email);
}
