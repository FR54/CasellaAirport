package com.generation.casellamanager.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="airport")
public class Airport
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="distance")
	private int distance;
	@Column(name="name")
	private String name;
	@Column(name="country")
	private String country;

	public Airport()
	{};
	public Airport(int distance, String name, String country)
	{
		this.distance = distance;
		this.name = name;
		this.country = country;
	}
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getDistance()
	{
		return distance;
	}
	public void setDistance(int distance)
	{
		this.distance = distance;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getCountry()
	{
		return country;
	}
	public void setCountry(String country)
	{
		this.country = country;
	}

	public String toString()
	{
		return "{id:'" + id + "', distance:'" + distance + "', name:'" + name
				+ "', country:'" + country + "'}";
	}

}
