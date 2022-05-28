package com.agesadev.apartmentcorner.controllers;

import com.agesadev.apartmentcorner.services.owner.ApartmentOwnerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/owner")
public class ApartmentOwnerController {

    @Autowired
    private ApartmentOwnerServiceImpl apartmentOwnerService;



}
