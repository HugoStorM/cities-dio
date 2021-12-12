package com.hugostorm.citiesapidio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hugostorm.citiesapidio.entities.State;

public interface StateRepository extends JpaRepository<State, Long> {

}
