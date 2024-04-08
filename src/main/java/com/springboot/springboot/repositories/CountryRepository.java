package com.springboot.springboot.repositories;

import com.springboot.springboot.bean.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Repository;


@Repository
public interface CountryRepository  extends JpaRepository<Country,Integer>
{
}
