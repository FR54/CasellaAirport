package com.generation.casellamanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.casellamanager.entity.Plane;

//          Tipo su cui fare CRUD
// 			Tipo dell'ID
public interface PlaneRepository extends JpaRepository<Plane, Integer>
{

}
