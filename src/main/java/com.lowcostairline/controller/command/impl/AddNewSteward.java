package com.lowcostairline.controller.command.impl;

import com.lowcostairline.beans.aircraftCrew.steward.Steward;
import com.lowcostairline.controller.command.Command;
import com.lowcostairline.reader.Reader;
import com.lowcostairline.service.exception.ServiceException;
import com.lowcostairline.service.impl.StewardServiceImpl;

import java.util.Objects;

public class AddNewSteward implements Command {
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
            stewardService.addNewSteward(steward);
        }
        catch (ServiceException e){
            //TODO: throw Controller exception
            System.out.println("You cannot add a steward.");
        }
    }
}
