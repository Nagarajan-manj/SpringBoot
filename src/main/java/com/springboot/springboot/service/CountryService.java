package com.springboot.springboot.service;

import com.springboot.springboot.bean.Country;
import com.springboot.springboot.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service

public class CountryService {
    @Autowired
    CountryRepository countryrep;

    public List<Country> getAllCountries() {
        List<Country> countries = countryrep.findAll();
        return countries;
    }



    public Country getCountrybyId(int id) {
        return countryrep.findById(id).get();
    }

    public Country getCountrybyName(String countryName) {
        List<Country> countries = countryrep.findAll();
        Country country = null;
        for (Country con : countries) {
            if (con.getCountryName().equalsIgnoreCase(countryName))
                country = con;
        }
        return country;
    }
}
