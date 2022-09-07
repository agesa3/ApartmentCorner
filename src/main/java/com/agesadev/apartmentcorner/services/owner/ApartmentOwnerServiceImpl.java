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
import java.util.Objects;

@Service
@RequiredArgsConstructor
@Slf4j
public class ApartmentOwnerServiceImpl implements ApartmentOwnerService {

    private final ApartmentOwnerRepository apartmentOwnerRepository;

    @Override
    public void addOwner(ApartmentOwnerRequestDto apartmentOwnerDto) {
        ApartmentOwner apartmentOwner = ApartmentOwner.builder()
                .ownerId(String.valueOf(new ObjectId()))
                .firstName(apartmentOwnerDto.getFirstName())
                .lastName(apartmentOwnerDto.getLastName())
                .email(apartmentOwnerDto.getEmail())
                .location(apartmentOwnerDto.getLocation())
                .phoneNumber(apartmentOwnerDto.getPhoneNumber())
                .idNumber(apartmentOwnerDto.getIdNumber())
                .build();
        apartmentOwnerRepository.save(apartmentOwner);
        log.info("ApartmentOwner {} is saved", apartmentOwner.getOwnerId());
    }

    @Override
    public List<ApartmentOwnerResponseDto> getAllOwners() {
        List<ApartmentOwner> allOwners = apartmentOwnerRepository.findAll();
        return allOwners.stream().map(ApartmentOwnerMappers::mapToApartmentOwnerResponseDto).toList();

    }

    @Override
    public String updateOwner(ApartmentOwnerRequestDto apartmentOwnerDto, String ownerId) {
        ApartmentOwner apartmentOwner = apartmentOwnerRepository.findById(ownerId).orElseThrow();
        apartmentOwner.setFirstName(apartmentOwnerDto.getFirstName());
        apartmentOwner.setLastName(apartmentOwnerDto.getLastName());
        apartmentOwner.setEmail(apartmentOwnerDto.getEmail());
        apartmentOwner.setLocation(apartmentOwnerDto.getLocation());
        apartmentOwner.setPhoneNumber(apartmentOwnerDto.getPhoneNumber());
        apartmentOwner.setIdNumber(apartmentOwnerDto.getIdNumber());
        apartmentOwnerRepository.save(apartmentOwner);
        log.info("ApartmentOwner {} is updated", apartmentOwner.getOwnerId());
        return "Owner updated successfully";
    }

    @Override
    public ApartmentOwnerResponseDto getOwnerById(String ownerId) {
        ApartmentOwner apartmentOwner = apartmentOwnerRepository.findById(ownerId).orElseThrow();
        return ApartmentOwnerMappers.mapToApartmentOwnerResponseDto(apartmentOwner);
    }

}
