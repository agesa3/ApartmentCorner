package com.agesadev.apartmentcorner.repository;

import com.agesadev.apartmentcorner.model.Apartment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ApartmentRepository extends MongoRepository<Apartment, Integer> {

    //find apartment by name
    Apartment findByApartmentName(String apartmentName);
}
