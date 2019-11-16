package com.lowcostairline.controller.command.impl;

import com.lowcostairline.beans.aircraftCrew.steward.Steward;
import com.lowcostairline.controller.command.Command;
import com.lowcostairline.reader.Reader;
import com.lowcostairline.service.impl.StewardServiceImpl;

public class EditStewardInfo implements Command {
    @Override
    public void execute(){
        StewardServiceImpl stewardService = new StewardServiceImpl();
        Steward steward = new Steward();
        String[] params = new String[6];

        System.out.println("Enter name of the steward: ");
        params[0] = Reader.nextString();

        System.out.println("Enter surname of the steward: ");
        params[1] = Reader.nextString();

        System.out.println("Enter amount of working experience: ");
        params[2] = Reader.nextString();

        System.out.println("Enter gender of the steward: ");
        params[3] = Reader.nextString();

        System.out.println("Enter height of the steward: ");
        params[4] = Reader.nextString();

        System.out.println("Is she/he a chief purser: ");
        params[5] = Reader.nextString();

        try{
            stewardService.editStewardInfo(steward, params);
        }
        catch (Exception e){
            //TODO: Throw Controller exception
            System.out.println("You cannot edit steward information.");
        }
    }
}
