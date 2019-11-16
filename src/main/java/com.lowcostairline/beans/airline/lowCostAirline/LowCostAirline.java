package com.lowcostairline.beans.airline.lowCostAirline;


import com.lowcostairline.beans.aircraft.Aircraft;
import com.lowcostairline.beans.aircraftCrew.pilot.Pilot;
import com.lowcostairline.beans.aircraftCrew.steward.Steward;
import com.lowcostairline.beans.airline.Airline;

import java.util.Objects;

/**
 * A class, which describe specific
 * characteristics of low cost airlines and
 * includes basic characteristics of all types
 * of the airlines. Such specific characteristics are:
 * <ul>
 *     <li>Category</li>
 *     <li>Information about the baggage (is payed or not)</li>
 *     <li>Information about the food (is payed or not)</li>
 * </ul>
 * @author Marta Gulida
 * @version 1.0
 */
public class LowCostAirline extends Airline {
    /** Field, that describes the category of the low cost airline(Ultra Lowcost, Middle Lowcost, Low Fare).*/
    private String category;

    private int costTicket;
    private Pilot pilot;
    private Steward steward;
    private Aircraft aircraft;

    /**
     * Constructor, which calls for default constructor
     * of the airline class and sets the fields in the
     * default values.
     *
     * @see LowCostAirline#LowCostAirline(String, int)
     */
    public LowCostAirline(){
    }

    public LowCostAirline(Pilot pilot, Steward steward, Aircraft aircraft, int costTicket){
        this.pilot = pilot;
        this.steward = steward;
        this.aircraft = aircraft;
        this.costTicket = costTicket;
    }

    /**
     * Constructor, which calls for constructor of the airline class
     * with 2 params and sets the fields in the values given by
     * the user.
     *
     * @param name  Name of the airline
     * @param operatingTime Operating time of the airline
     * @param category  Category of the LowCost airline
     *
     * @see Airline#Airline(String, int)
     * @see LowCostAirline#LowCostAirline()
     * @see LowCostAirline#LowCostAirline(String, int)
     */
    public LowCostAirline(String name, int operatingTime, String category,
                          Pilot pilot, Steward steward, Aircraft aircraft, int costTicket){

        super(name, operatingTime);
        this.category = category;
        this.costTicket = costTicket;
        this.pilot = pilot;
        this.steward = steward;
        this.aircraft = aircraft;
    }

    /**
     * Constructor, which calls for constructor of the airline class
     * with 2 params and sets the fields of the LowCost airline class in
     * the default values.
     *
     * @param name  Name of the airline
     * @param operatingTime Operating time of the airline
     *
     * @see Airline#Airline(String, int)
     * @see LowCostAirline#LowCostAirline()
     */
    public LowCostAirline(String name, int operatingTime){

        super(name, operatingTime);
    }

    /**
     * Get the category of the LowCost airline
     * {@link LowCostAirline#category}
     *
     * @return  String value, which describes the category
     */
    public String getCategory() {

        return category;
    }

    /**
     * Set the category of the LowCost airline
     * {@link LowCostAirline#category}
     *
     * @param category  String value, which describes the category
     */
    public void setCategory(String category) {

        this.category = category;
    }

    public int getCostTicket() {

        return costTicket;
    }

    public void setCostTicket(int costTicket) throws Exception{

        if (costTicket >= 0)
            this.costTicket = costTicket;
        else
            throw new Exception("Cost should be higher or equal 0.");
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public Steward getSteward() {
        return steward;
    }

    public void setSteward(Steward steward) {
        this.steward = steward;
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

        LowCostAirline that = (LowCostAirline) o;

        return category.equals(that.category);
    }

    @Override
    public int hashCode(){

        return Objects.hash(category, costTicket, pilot, steward, aircraft, getName(), getOperatingTime());
    }

    @Override
    public String toString(){

        return "lowCostAirline{" +
                "category='" + category +'\'' +
                ", pilot = " + pilot +
                ", steward = " + steward +
                ", aircraft = " + aircraft +
                ", costTicket = " + costTicket +
                "}";
    }
}
