package com.agesadev.apartmentcorner.controllers;

import com.agesadev.apartmentcorner.model.Apartment;
import com.agesadev.apartmentcorner.services.ApartmentService;
import com.agesadev.apartmentcorner.services.ApartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/apartment")
@RestController
public class ApartmentController {

    @Autowired
    private ApartmentServiceImpl apartmentService;

    @GetMapping("/all")
    public List<Apartment> getAllApartment() {
        return apartmentService.findAllApartments();
    }

    @GetMapping("/apartment/{id}")
    public Apartment getApartmentById(int id) {
        return apartmentService.findApartmentById(id);
    }


    @PostMapping("/add")
    public Apartment addApartment(Apartment apartment) {
        apartmentService.saveApartment(apartment);
        return apartment;
    }

}

