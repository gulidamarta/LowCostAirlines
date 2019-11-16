package com.lowcostairline;

import com.lowcostairline.controller.Controller;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.writeToFile();
        /*
        try {
            XSDValidator.validate(new File("lowcost.xml"), new File("lowcost.xsd"));
            System.out.println("Validation has run successfully.");
        } catch (ValidationException e) {
            System.out.println("Validation failed.");
            //logger.error(e.getMessage());
            //return;
        }
        */
        //Controller controller = new Controller();
        //controller.writeToFile();
    }
}
