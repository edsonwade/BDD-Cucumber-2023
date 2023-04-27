package com.example.demo.airport;

public class EconomyFlight extends Flight {

	public EconomyFlight(String id) {
		super(id);
	}

	@Override
	public boolean addPassenger(Passenger passenger) {
		passengersList.add(passenger);
		return true;
	}



	@Override
	public boolean removePassenger(Passenger passenger) {
		if (!passenger.isVip()) {
			return passengersList.remove(passenger);
		}
		return false;
	}

}
