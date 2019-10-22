package controller.command.impl;

import beans.aircraftCrew.steward.Steward;
import controller.command.Command;
import reader.Reader;
import service.exception.ServiceException;
import service.impl.StewardServiceImpl;

import java.util.Objects;

public class DismissSteward implements Command {
    @Override
    public void execute(){
        StewardServiceImpl stewardService = new StewardServiceImpl();

        System.out.println("Enter name of the steward: ");
        String name = Reader.nextString();

        System.out.println("Enter surname of the steward: ");
        String surname = Reader.nextString();

        System.out.println("Enter amount of working experience: ");
        int workExperience = Integer.parseInt(Objects.requireNonNull(Reader.nextString()));

        System.out.println("Enter gender of the steward: ");
        String gender = Reader.nextString();

        System.out.println("Enter height of the steward: ");
        int height = Integer.parseInt(Objects.requireNonNull(Reader.nextString()));

        System.out.println("Is this steward a chief purser: ");
        boolean isChiefPurser = Boolean.parseBoolean(Objects.requireNonNull(Reader.nextString()));

        Steward steward = new Steward(name, surname, workExperience, gender, height, isChiefPurser);

        try{
            stewardService.dismissSteward(steward);
        }catch(ServiceException e){
            // TODO: throw Controller exception
        }

    }
}
