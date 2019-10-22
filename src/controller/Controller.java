package controller;

import beans.aircraftCrew.steward.Steward;
import controller.command.Command;
import controller.command.impl.DisplayHelp;
import reader.Reader;
import writer.XmlWriter;
import writer.exception.XmlOutInException;

public class Controller {

    public void writeToFile(){
        Steward steward = new Steward("Gale", "mee", 200);
        XmlWriter xmlWriter = new XmlWriter();
        try {
            xmlWriter.Write(steward, "lowcost.xml");
        }catch (XmlOutInException e){
            System.out.println("Cannot write to the file.");
        }
    }

    public void execute(){
        Command displayHelp = new DisplayHelp();
        displayHelp.execute();

        int result = Reader.nextInt();

        try {
            while (result != 0) {
                CommandName ct = ConsoleCommand.getCommandTypeByNumber(result);
                ct.getCommand().execute();
                result = Reader.nextInt();
            }
            ConsoleCommand
                    .getCommandTypeByNumber(result)
                    .getCommand()
                    .execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
