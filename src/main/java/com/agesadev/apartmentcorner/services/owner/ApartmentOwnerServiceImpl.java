package com.agesadev.apartmentcorner.services.owner;

import com.agesadev.apartmentcorner.model.ApartmentOwner;
import com.agesadev.apartmentcorner.repository.ApartmentOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApartmentOwnerServiceImpl implements ApartmentOwnerService {

    @Autowired
    private ApartmentOwnerRepository apartmentOwnerRepository;

    @Override
    public void addOwner(ApartmentOwner apartmentOwner) {
        apartmentOwnerRepository.save(apartmentOwner);

    }

    @Override
    public List<ApartmentOwner> getAllOwners() {
        return apartmentOwnerRepository.findAll();
    }

    @Override
    public ApartmentOwner findApartmentOwnerById(int id) {
        return apartmentOwnerRepository.findById(id).get();
    }

    @Override
    public ApartmentOwner findByEmail(String email) {
        return apartmentOwnerRepository.findByEmail(email);
    }
}
