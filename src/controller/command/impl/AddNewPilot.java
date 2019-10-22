package controller.command.impl;

import beans.aircraftCrew.pilot.Pilot;
import controller.command.Command;
import reader.Reader;
import service.exception.ServiceException;
import service.impl.PilotServiceImpl;

import java.util.Objects;

public class AddNewPilot implements Command {
    @Override
    public void execute(){
        PilotServiceImpl pilotService = new PilotServiceImpl();

        System.out.println("Enter name of the pilot: ");
        String name = Reader.nextString();

        System.out.println("Enter surname of the pilot: ");
        String surname = Reader.nextString();

        System.out.println("Enter amount of working experience");
        int workExperience = Integer.parseInt(Objects.requireNonNull(Reader.nextString()));

        Pilot pilot = new Pilot(name, surname, workExperience);

        try{
            pilotService.addNewPilot(pilot);
        }
        catch (ServiceException e){
            // TODO: throw controller exception
            System.out.println("Cannot add new pilot.");
        }
    }
}
