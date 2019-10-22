package controller.command.impl;

import beans.aircraft.Aircraft;
import controller.command.Command;
import reader.Reader;
import service.exception.ServiceException;
import service.impl.AircraftServiceImpl;

import java.util.Objects;

public class RemoveAircraft implements Command {
    @Override
    public void execute(){
        AircraftServiceImpl aircraftService = new AircraftServiceImpl();
        Aircraft aircraft = new Aircraft();

        System.out.println("Enter aircraft\'s model:");
        String model = Reader.nextString();

        System.out.println("Enter amount of seats:");
        // TODO: Checking type info
        int amountSeats = Integer.parseInt(Objects.requireNonNull(Reader.nextString()));

        System.out.println("Enter type of the aircraft: ");
        String type = Reader.nextString();

        System.out.println("Enter amount of fuel supply: ");
        float fuelSupply = Float.parseFloat(Objects.requireNonNull(Reader.nextString()));

        System.out.println("Is luggage compartment: ");
        boolean isLuggageCompartement = Boolean.parseBoolean(Objects.requireNonNull(Reader.nextString()));

        System.out.println("Enter amount of emergency exits: ");
        int emergencyExitAmount = Integer.parseInt(Objects.requireNonNull(Reader.nextString()));

        aircraft.setModel(model);
        aircraft.setEmergencyExitAmount(emergencyExitAmount);
        aircraft.setIsluggageCompartment(isLuggageCompartement);
        aircraft.setFuelSupply(fuelSupply);
        aircraft.setType(type);
        aircraft.setSeatAmount(amountSeats);

        try {
            aircraftService.removeAircraft(aircraft);
        }catch (ServiceException e){
            System.out.println("You cannot remove that aircraft.");
        }
    }
}
