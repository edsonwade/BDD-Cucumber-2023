package com.example.demo.airport;

import java.util.*;

public abstract class Flight {

	private String id;

	Set<Passenger> passengerSet = new HashSet<>();



	List<Passenger> passengersList = new ArrayList<Passenger>();

	public Flight(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public List<Passenger> getPassengersList() {
		return Collections.unmodifiableList(passengersList);
	}

	public Set<Passenger> getPassengersSet() {
		return Collections.unmodifiableSet(passengerSet);
	}

	public abstract boolean addPassenger(Passenger passenger);

	public abstract boolean removePassenger(Passenger passenger);

}
