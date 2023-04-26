package com.example.demo;

public class EconomyFlight extends Flight {

	public EconomyFlight(String id) {
		super(id);
	}

	@Override
	public boolean addPassenger(Passenger passenger) {
		return passengersList.add(passenger);
	}

	@Override
	public boolean removePassenger(Passenger passenger) {
		if (!passenger.isVip()) {
			return passengersList.remove(passenger);
		}
		return false;
	}

}