package com.example.demo.airport;

public class PremiumFlight extends Flight{
    public PremiumFlight(String id) {
        super(id);
    }

    @Override
    public boolean addPassenger(Passenger passenger) {
        if (!passenger.isVip()) return false;
        passengersList.add(passenger);
        return true;

    }

    @Override
    public boolean removePassenger(Passenger passenger) {
        if (passenger.isVip()) passengersList.remove(passenger);
        return false;
    }
}
