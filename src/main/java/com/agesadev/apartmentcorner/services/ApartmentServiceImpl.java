package com.agesadev.apartmentcorner.services;

import com.agesadev.apartmentcorner.model.Apartment;
import com.agesadev.apartmentcorner.repository.ApartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApartmentServiceImpl implements ApartmentService {

    @Autowired
    public ApartmentRepository apartmentRepository;

    @Override
    public Apartment saveApartment(Apartment apartment) {
       return apartmentRepository.save(apartment);
    }

    @Override
    public void deleteApartment(int id) {
        apartmentRepository.deleteById(id);

    }

    @Override
    public Apartment findApartmentById(int id) {
        if (apartmentRepository.findById(id).isPresent()) {
            return apartmentRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public Apartment findApartmentByName(String apartmentName) {
        if (apartmentRepository.findByApartmentName(apartmentName).getApartmentName().equals(apartmentName)) {
            return apartmentRepository.findByApartmentName(apartmentName);
        }
        return null;
    }

    @Override
    public List<Apartment> findAllApartments() {
        System.out.println("Getting data from DB: " + apartmentRepository.findAll());
        return apartmentRepository.findAll();
    }

    @Override
    public void deleteAllApartments() {
        apartmentRepository.deleteAll();
    }

}
