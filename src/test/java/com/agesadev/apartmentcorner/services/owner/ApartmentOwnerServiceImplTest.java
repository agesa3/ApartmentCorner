package com.agesadev.apartmentcorner.services.owner;


import com.agesadev.apartmentcorner.repository.ApartmentOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


@SpringBootTest
public class ApartmentOwnerServiceImplTest {

    @Autowired
    private ApartmentOwnerService apartmentOwnerService;

    @MockBean
    private ApartmentOwnerRepository apartmentOwnerRepository;

}