package com.generation.casellamanager;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.casellamanager.entity.*;
import com.generation.casellamanager.repository.*;

@SuppressWarnings("unused")
@SpringBootApplication
public class CasellaManagerApplication implements CommandLineRunner
{
	//questo main non è il main
	public static void main(String[] args) 
	{
		SpringApplication.run(CasellaManagerApplication.class, args);
	}

	@Autowired //non so da dove, invetanti una repository e mettila in questa variabile
	AirportRepository repoAirport;
	@Autowired
	TicketRepository repoTicket;
	@Autowired
	TerminalRepository repoTerminal;
	@Autowired
	PlaneRepository repoPlane;
	
	@Override
	//questo run è il main
	public void run(String... args) throws Exception 
	{
		System.out.println("--------------------------------------------------------------");
		List<Plane> persone = repoPlane.findAll();
		
		Plane skyCruiser = persone.get(0);
		
		System.out.println(skyCruiser.getCapacity());
		System.out.println(skyCruiser.getCost());
		System.out.println(skyCruiser.getManifacturer());
		System.out.println(skyCruiser.getModel());
		System.out.println(skyCruiser.getRangeKm());
		
		for(Ticket t : skyCruiser.getTickets())
			System.out.println(t);
		System.out.println("--------------------------------------------------------------");
	}

}
