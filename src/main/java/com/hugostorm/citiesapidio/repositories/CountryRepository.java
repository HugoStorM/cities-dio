package com.hugostorm.citiesapidio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hugostorm.citiesapidio.entities.Country;

public interface CountryRepository extends JpaRepository<Country,Long>{

}
