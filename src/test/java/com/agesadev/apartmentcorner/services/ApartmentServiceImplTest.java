package com.agesadev.apartmentcorner.services;

import com.agesadev.apartmentcorner.model.Apartment;
import com.agesadev.apartmentcorner.model.ApartmentOwner;
import com.agesadev.apartmentcorner.repository.ApartmentRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
@RunWith(org.mockito.junit.MockitoJUnitRunner.class)
class ApartmentServiceImplTest {

    @Autowired
    private ApartmentServiceImpl apartmentService;

    @MockBean
    private ApartmentRepository apartmentRepository;


    @Test
    public void findAllApartments() {
        when(apartmentRepository.findAll()).thenReturn(
                Stream.of(new Apartment(
                        1,
                        "Heaven Apartments",
                        "01",
                        "Nairobi",
                        "Nairobi",
                        "Good Apartments",
                        "testurl",
                        "20000",
                        "3",
                        "2",
                        new ApartmentOwner(
                                1,
                                "Test Owner",
                                "Name Two",
                                "0724",
                                "test@gmail.com"
                        )
                ), new Apartment(
                        2,
                        "Joy Apartments",
                        "01",
                        "Nairobi",
                        "Nairobi",
                        "Good Apartments",
                        "testurl",
                        "20000",
                        "3",
                        "2",
                        new ApartmentOwner(
                                1,
                                "Test Owner",
                                "Name Two",
                                "0724",
                                "test@gmail.com"
                        )
                )).collect(Collectors.toList()));
        assertEquals(2, apartmentService.findAllApartments().size());

    }

    @Test
    void saveApartment() {
        Apartment apartment = new Apartment(
                1,
                "Heaven Apartments",
                "01",
                "Nairobi",
                "Nairobi",
                "Good Apartments",
                "testurl",
                "20000",
                "3",
                "2",
                new ApartmentOwner(
                        1,
                        "Test Owner",
                        "Name Two",
                        "0724",
                        "test@gmail.com"
                )
        );
        when(apartmentRepository.save(apartment)).thenReturn(apartment);
        assertEquals(apartment, apartmentService.saveApartment(apartment));
    }

    @Test
    void deleteApartment() {
        Apartment apartment = new Apartment(
                1,
                "Heaven Apartments",
                "01",
                "Nairobi",
                "Nairobi",
                "Good Apartments",
                "testurl",
                "20000",
                "3",
                "2",
                new ApartmentOwner(
                        1,
                        "Test Owner",
                        "Name Two",
                        "0724",
                        "test@gmail.com"
                )
        );
        when(apartmentRepository.findById(1)).thenReturn(java.util.Optional.of(apartment));
        apartmentService.deleteApartment(1);
        verify(apartmentRepository, times(1)).deleteById(1);
    }

    @Test
    void findApartmentByName() {
        Apartment apartment = new Apartment(
                1,
                "Heaven Apartments",
                "01",
                "Nairobi",
                "Nairobi",
                "Good Apartments",
                "testurl",
                "20000",
                "3",
                "2",
                new ApartmentOwner(
                        1,
                        "Test Owner",
                        "Name Two",
                        "0724",
                        "test@gmail.com"
                )
        );
        when(apartmentRepository.findByApartmentName("Heaven Apartments")).thenReturn(apartment);
        assertEquals(apartment, apartmentService.findApartmentByName("Heaven Apartments"));
    }


    @Test
    void deleteAllApartments() {
        when(apartmentRepository.findAll()).thenReturn(
                Stream.of(new Apartment(
                        1,
                        "Heaven Apartments",
                        "01",
                        "Nairobi",
                        "Nairobi",
                        "Good Apartments",
                        "testurl",
                        "20000",
                        "3",
                        "2",
                        new ApartmentOwner(
                                1,
                                "Test Owner",
                                "Name Two",
                                "0724",
                                "test@gmail.com"
                        )
                ), new Apartment(
                        2,
                        "Joy Apartments",
                        "01",
                        "Nairobi",
                        "Nairobi",
                        "Good Apartments",
                        "testurl",
                        "20000",
                        "3",
                        "2",
                        new ApartmentOwner(
                                1,
                                "Test Owner",
                                "Name Two",
                                "0724",
                                "test@gmail.com"
                        )
                )).collect(Collectors.toList()));
        apartmentService.deleteAllApartments();
        verify(apartmentRepository, times(1)).deleteAll();

    }

}