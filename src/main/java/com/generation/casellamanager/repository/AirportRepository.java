package com.generation.casellamanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.casellamanager.entity.Airport;
//          Tipo su cui fare CRUD
// 			Tipo dell'ID
public interface AirportRepository extends JpaRepository<Airport, Integer>
{

}
