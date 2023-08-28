package com.generation.casellamanager.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name="ticket")
public class Ticket
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private	int id;
	@Column(name="passengername")
	private String passengerName;
	@Column(name="passengercf")
	private String passengerCF;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="planeid")
	private Plane plane;

	public Ticket()
	{
	};
	public Ticket(Plane plane, String passengerName,
			String passengerCF)
	{
		this.plane = plane;
		this.passengerName = passengerName;
		this.passengerCF = passengerCF;
	}

	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public Plane getPlane()
	{
		return plane;
	}
	public void setPlane(Plane plane)
	{
		this.plane = plane;
	}
	public String getPassengerName()
	{
		return passengerName;
	}
	public void setPassengerName(String passengerName)
	{
		this.passengerName = passengerName;
	}
	public String getPassengerCF()
	{
		return passengerCF;
	}
	public void setPassengerCF(String passengerCF)
	{
		this.passengerCF = passengerCF;
	}

	public String toString()
	{
		return "{id:'" + id + "', plane:'" + plane
				+ "', passengerName:'" + passengerName + "', passengerCF:'"
				+ passengerCF + "'}";
	}

}
