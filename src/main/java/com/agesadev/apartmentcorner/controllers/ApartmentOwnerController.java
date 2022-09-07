package com.agesadev.apartmentcorner.controllers;

import com.agesadev.apartmentcorner.dto.owner.ApartmentOwnerRequestDto;
import com.agesadev.apartmentcorner.dto.owner.ApartmentOwnerResponseDto;
import com.agesadev.apartmentcorner.model.ApartmentOwner;
import com.agesadev.apartmentcorner.services.owner.ApartmentOwnerServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/owner")

public class ApartmentOwnerController {


    private final ApartmentOwnerServiceImpl apartmentOwnerService;

    public ApartmentOwnerController(ApartmentOwnerServiceImpl apartmentOwnerService) {
        this.apartmentOwnerService = apartmentOwnerService;
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void newApartmentOwner(@RequestBody ApartmentOwnerRequestDto apartmentOwnerRequest) {
        apartmentOwnerService.addOwner(apartmentOwnerRequest);
    }

    @GetMapping("")
    public List<ApartmentOwnerResponseDto> getAllOwners() {
        return apartmentOwnerService.getAllOwners();
    }

    //update owner
    @PutMapping("/{ownerId}")
    public String updateOwner(@RequestBody ApartmentOwnerRequestDto apartmentOwnerRequest, @PathVariable String ownerId) {
         apartmentOwnerService.updateOwner(apartmentOwnerRequest, ownerId);
            return "Owner updated successfully";
    }

    //find by id
    @GetMapping("/{ownerId}")
    public ApartmentOwnerResponseDto getOwnerById(@PathVariable String ownerId) {
        return apartmentOwnerService.getOwnerById(ownerId);
    }


}
