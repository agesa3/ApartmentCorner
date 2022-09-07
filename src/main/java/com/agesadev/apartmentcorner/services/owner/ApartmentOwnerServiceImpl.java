package com.agesadev.apartmentcorner.services.owner;

import com.agesadev.apartmentcorner.dto.owner.ApartmentOwnerRequestDto;
import com.agesadev.apartmentcorner.dto.owner.ApartmentOwnerResponseDto;
import com.agesadev.apartmentcorner.mapper.ApartmentOwnerMappers;
import com.agesadev.apartmentcorner.model.ApartmentOwner;
import com.agesadev.apartmentcorner.repository.ApartmentOwnerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ApartmentOwnerServiceImpl implements ApartmentOwnerService {

    private final ApartmentOwnerRepository apartmentOwnerRepository;

    @Override
    public void addOwner(ApartmentOwnerRequestDto apartmentOwnerDto) {
        ApartmentOwner apartmentOwner = ApartmentOwner.builder()
                .id(new ObjectId())
                .firstName(apartmentOwnerDto.getFirstName())
                .lastName(apartmentOwnerDto.getLastName())
                .email(apartmentOwnerDto.getEmail())
                .location(apartmentOwnerDto.getLocation())
                .phoneNumber(apartmentOwnerDto.getPhoneNumber())
                .idNumber(apartmentOwnerDto.getIdNumber())
                .build();
        apartmentOwnerRepository.save(apartmentOwner);
        log.info("ApartmentOwner {} is saved", apartmentOwner.getId());
    }

    @Override
    public List<ApartmentOwnerResponseDto> getAllOwners() {
        List<ApartmentOwner> allOwners = apartmentOwnerRepository.findAll();
        return allOwners.stream().map(ApartmentOwnerMappers::mapToApartmentOwnerResponseDto).toList();

    }
}
