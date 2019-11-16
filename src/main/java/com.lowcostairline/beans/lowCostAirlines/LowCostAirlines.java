package com.lowcostairline.beans.lowCostAirlines;


import com.lowcostairline.beans.Entity;
import com.lowcostairline.beans.aircraft.Aircraft;
import com.lowcostairline.beans.aircraftCrew.pilot.Pilot;
import com.lowcostairline.beans.aircraftCrew.steward.Steward;
import com.lowcostairline.beans.airline.lowCostAirline.LowCostAirline;

import java.util.Objects;

public class LowCostAirlines extends Entity {

    private LowCostAirline LowCostAirlineBlueSky;
    private LowCostAirline LowCostAirlineAmerican;

    public LowCostAirlines(){
        LowCostAirlineBlueSky = new LowCostAirline(
                "Blue sky", 200, "Ultra",
                new Pilot("Mark", "Lutz", 200, 200),
                new Steward("Andrew", "Gale", 200),
                new Aircraft("Airbus", 200, "low",
                        5000, false, 2),
                100);

        LowCostAirlineAmerican = new LowCostAirline(
                "American Portal", 250, "Middle",
                new Pilot("Jack", "Lop", 210, 230),
                new Steward("Mike", "Bee", 250),
                new Aircraft("Airbus", 200, "low",
                        5050, false, 3),
                200);
    }

    public LowCostAirline get_lowCostAirlineAmerican() {
        return LowCostAirlineAmerican;
    }

    public LowCostAirline get_lowCostAirlineBlueSky(){
        return LowCostAirlineBlueSky;
    }

    @Override
    public int hashCode(){
        return Objects.hash(LowCostAirlineAmerican, LowCostAirlineBlueSky);
    }


    @Override
    public boolean equals(Object o){

        if (this == o) {
            return true;
        }
        if (o == null
                || getClass()
                != o.getClass()) {
            return false;
        }

        LowCostAirlines that = (LowCostAirlines) o;

        if (LowCostAirlineAmerican.getAircraft() != that.LowCostAirlineAmerican.getAircraft()) {
            return false;
        }

        if (LowCostAirlineBlueSky.getAircraft() != that.LowCostAirlineBlueSky.getAircraft()){
            return false;
        }

        if (LowCostAirlineBlueSky.getSteward() != that.LowCostAirlineBlueSky.getSteward()){
            return false;
        }

        if (LowCostAirlineAmerican.getSteward() != that.LowCostAirlineAmerican.getSteward()) {
            return false;
        }

        if (LowCostAirlineBlueSky.getPilot() != that.LowCostAirlineBlueSky.getPilot()){
            return false;
        }

        if (LowCostAirlineAmerican.getPilot() != that.LowCostAirlineAmerican.getPilot()){
            return false;
        }

        if (!LowCostAirlineAmerican.getCategory().equals(that.LowCostAirlineAmerican.getCategory()))
        {
            return false;
        }

        if (!LowCostAirlineBlueSky.getCategory().equals(that.LowCostAirlineBlueSky.getCategory())){
            return false;
        }

        if (LowCostAirlineAmerican.getCostTicket() != that.LowCostAirlineAmerican.getCostTicket()){
            return false;
        }

        return LowCostAirlineBlueSky.getCostTicket() == that.LowCostAirlineBlueSky.getCostTicket();
    }

    @Override
    public String toString() {
        return "LowCostAirlines{" +
                "///}";
    }
}
