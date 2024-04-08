package com.springboot.demo;

import com.springboot.springboot.bean.Country;
import com.springboot.springboot.repositories.CountryRepository;
import com.springboot.springboot.service.CountryService;
import org.assertj.core.internal.Classes;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@SpringBootTest(classes = {ServiceMackitoTest.class})
public class ServiceMackitoTest {
    @Mock
    CountryRepository countryrep;

    @InjectMocks
    CountryService countryser;

    public List<Country> mycountries;

    @Test
    @Order(1)
    public void test_getAllCountries() {
        List<Country> mycountries = new ArrayList<Country>();
        mycountries.add(new Country(1, "India", "Delhi"));
        mycountries.add(new Country(2, "USA", "Washington"));

        when(countryrep.findAll()).thenReturn(mycountries);
        assertEquals(2,countryser.getAllCountries().size());

    }
}
