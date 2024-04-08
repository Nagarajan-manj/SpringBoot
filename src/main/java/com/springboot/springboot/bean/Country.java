package com.springboot.springboot.bean;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Country")
public class Country
{

    @Id
    @Column(name="id")
    int id;
    @Column(name="capital")
    String countryCapital;

    @Column(name="country_name")
    String countryName;

    public Country()
    {

    }

    public Country(int id, String countryCapital, String countryName)
    {
        this.id=id;
        this.countryCapital=countryCapital;
        this.countryName=countryName;
    }


    public String getCountryCapital() {
        return countryCapital;
    }

    public void setCountryCapital(String countryCapital) {
        this.countryCapital = countryCapital;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
