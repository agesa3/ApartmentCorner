package com.agesadev.apartmentcorner.services;

import com.agesadev.apartmentcorner.model.Apartment;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ApartmentService {

    Apartment saveApartment(Apartment apartment);

    void deleteApartment(int id);

    Apartment findApartmentById(int id);

    Apartment findApartmentByName(String name);

    List<Apartment> findAllApartments();

    void deleteAllApartments();

}
