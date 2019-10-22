package controller.command.impl;

import beans.aircraft.Aircraft;
import controller.command.Command;
import reader.Reader;
import service.exception.ServiceException;
import service.impl.AircraftServiceImpl;

import java.util.Objects;

public class AddNewAircraft implements Command {
    @Override
    public void execute(){
        AircraftServiceImpl aircraftService = new AircraftServiceImpl();

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

        Aircraft aircraft = new Aircraft();
        aircraft.setModel(model);
        aircraft.setSeatAmount(amountSeats);
        aircraft.setType(type);
        aircraft.setFuelSupply(fuelSupply);
        aircraft.setIsluggageCompartment(isLuggageCompartement);
        aircraft.setEmergencyExitAmount(emergencyExitAmount);

        try {
            aircraftService.addNewAircraft(aircraft);
        }
        catch (ServiceException e){
            //
        }
    }
}
