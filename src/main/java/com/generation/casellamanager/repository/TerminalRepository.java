package com.generation.casellamanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.casellamanager.entity.Terminal;
//          Tipo su cui fare CRUD
// 			Tipo dell'ID
public interface TerminalRepository extends JpaRepository<Terminal, Integer>
{

}
