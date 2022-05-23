package com.agesadev.apartmentcorner.services;

import com.agesadev.apartmentcorner.model.Apartment;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ApartmentService {

    void saveApartment(Apartment apartment);

    void deleteApartment(Apartment apartment);

    Apartment findApartmentById(int id);

    Apartment findApartmentByName(String name);

    List<Apartment> findAllApartments();

    void deleteAllApartments();

    boolean apartmentExists(Apartment apartment);
}
