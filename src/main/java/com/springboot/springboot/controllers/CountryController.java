package com.springboot.springboot.controllers;


import com.springboot.springboot.bean.Country;
import com.springboot.springboot.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping("/getcountries")
    public List<Country> getCountries() {
      return  countryService.getAllCountries();
    }

    @GetMapping("/getcountries/{id}")
    public Country getCountrybyID(@PathVariable(value="id") int id)
        {
            return countryService.getCountrybyId(id);
        }
}

