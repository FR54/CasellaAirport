package com.generation.casellamanager.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name="plane")
public class Plane
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	int id;
	@Column(name = "rangekm")
	int rangeKm;
	@Column(name = "capacity")
	int capacity;
	@Column(name = "cost")
	int cost;
	@Column(name = "manifacturer")
	String manifacturer;
	@Column(name = "model")
	String model;
	@OneToMany(mappedBy = "plane", fetch = FetchType.EAGER)
	private List<Ticket> Tickets;


	public Plane()
	{
	};
	public Plane(
			int rangeKm, int capacity, int cost, String manifacturer,
			String model
	)
	{
		this.rangeKm = rangeKm;
		this.capacity = capacity;
		this.cost = cost;
		this.manifacturer = manifacturer;
		this.model = model;
	}

	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getRangeKm()
	{
		return rangeKm;
	}
	public void setRangeKm(int rangeKm)
	{
		this.rangeKm = rangeKm;
	}
	public int getCapacity()
	{
		return capacity;
	}
	public void setCapacity(int capacity)
	{
		this.capacity = capacity;
	}
	public int getCost()
	{
		return cost;
	}
	public void setCost(int cost)
	{
		this.cost = cost;
	}
	public String getManifacturer()
	{
		return manifacturer;
	}
	public void setManifacturer(String manifacturer)
	{
		this.manifacturer = manifacturer;
	}
	public String getModel()
	{
		return model;
	}
	public void setModel(String model)
	{
		this.model = model;
	}
	public List<Ticket> getTickets()
	{
		return Tickets;
	}
	public void setTickets(List<Ticket> tickets)
	{
		Tickets = tickets;
	}
	
	public String toString()
	{
		return "{id:'" + id + "', rangeKm:'" + rangeKm + "', capacity:'"
				+ capacity + "', cost:'" + cost + "', manifacturer:'"
				+ manifacturer + "', model:'" + model + "'}";
	}

	public Boolean canReach(Airport a)
	{
		if (rangeKm >= a.getDistance())
			return true;
		return false;
	}

}
