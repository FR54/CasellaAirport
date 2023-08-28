package com.generation.casellamanager.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="terminal")
public class Terminal
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="number")
	private int number;
	@Column(name="name")
	private String name;

	public Terminal()
	{};
	public Terminal(int number, String name)
	{
		this.number = number;
		this.name = name;
	}
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getNumber()
	{
		return number;
	}
	public void setNumber(int number)
	{
		this.number = number;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public String toString()
	{
		return "{id:'" + id + "', number:'" + number + "', name:'" + name
				+ "'}";
	}

}
