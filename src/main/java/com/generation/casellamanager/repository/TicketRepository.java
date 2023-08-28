package com.generation.casellamanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.casellamanager.entity.Ticket;
//          Tipo su cui fare CRUD
// 			Tipo dell'ID
public interface TicketRepository extends JpaRepository<Ticket, Integer>
{

}
