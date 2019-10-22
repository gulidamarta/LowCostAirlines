package controller.command.impl;

import beans.aircraftCrew.pilot.Pilot;
import controller.command.Command;
import reader.Reader;
import service.impl.PilotServiceImpl;

public class EditPilotInfor implements Command {
    @Override
    public void execute(){
        PilotServiceImpl pilotService = new PilotServiceImpl();
        Pilot pilot = new Pilot();

        String[] params = new String[3];

        System.out.println("Enter name of the pilot: ");
        String name = Reader.nextString();

        System.out.println("Enter surname of the pilot: ");
        String surname = Reader.nextString();

        System.out.println("Enter amount of working experience: ");
        String workExperience = Reader.nextString();

        params[0] = name;
        params[1] = surname;
        params[2] = workExperience;

        try{
            pilotService.editPilotInfo(pilot, params);
        }
        catch (Exception e){
            //TODO: throw command exception
            System.out.println("Cannot edit pilot information.");
        }
    }
}
