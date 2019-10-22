package controller.command.impl;

import beans.aircraft.Aircraft;
import controller.command.Command;
import reader.Reader;
import service.exception.ServiceException;
import service.impl.AircraftServiceImpl;

public class EditAircrfatInfo implements Command {
    @Override
    public void execute() {
        AircraftServiceImpl aircraftService = new AircraftServiceImpl();
        String[] params = new String[6];

        System.out.println("Enter aircraft\'s model:");
        String model = Reader.nextString();

        System.out.println("Enter amount of seats:");
        // TODO: Checking type info
        String amountSeats = Reader.nextString();

        System.out.println("Enter type of the aircraft: ");
        String type = Reader.nextString();

        System.out.println("Enter amount of fuel supply: ");
        String fuelSupply = Reader.nextString();

        System.out.println("Is luggage compartment: ");
        String isLuggageCompartement = Reader.nextString();

        System.out.println("Enter amount of emergency exits: ");
        String emergencyExitAmount = Reader.nextString();

        Aircraft aircraft = new Aircraft();
        params[0] = model;
        params[1] = amountSeats;
        params[2] = type;
        params[3] = fuelSupply;
        params[4] = isLuggageCompartement;
        params[5] = emergencyExitAmount;

        try {
            aircraftService.editAircraftInfo(aircraft, params);
        } catch (
                ServiceException e) {
            //
        }
    }
}
