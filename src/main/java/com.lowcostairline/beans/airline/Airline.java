package com.lowcostairline.beans.airline;


import com.lowcostairline.beans.Entity;

import java.util.Objects;

/**
 * airline - a class that describe basic information
 * about the airlines. Such as:
 * <ul>
 *     <li>Name of the airline</li>
 *     <li>Operating time of the airline</li>
 * </ul>
 * @author Marta Gulida
 * @version 1.1
 */
public class Airline extends Entity implements Comparable<Airline>{
    /** Field, that describes a name of the airline*/
    private String name;

    /** Operating time of the airline */
    private int operatingTime;

    /**
     * Constructor, which define all fields
     * of the class in the default values.
     *
     * @see Airline#Airline(String, int)
     */
    public Airline(){

    }

    /**
     * Constructor, which set all the fields
     * in the values, which are given by the user.
     *
     * @param name  String Name of the airline
     * @param operatingTime   int Operating type of the airline
     *
     * @see Airline#Airline()
     */
    public Airline(String name, int operatingTime){
        this.name = name;
        this.operatingTime = operatingTime;

    }

    /**
     * Set the operating time of the airline.
     * {@link Airline#operatingTime}
     *
     * @param operatingTime   int Operating time of the airline
     * @throws Exception    If the operating time is lower that 0 and higher than 15 - Exception
     */
    public void setOperatingTime(int operatingTime) throws Exception {

        int MIN_AGE = 0, MAX_AGE = 15;
        if ((operatingTime >= MIN_AGE) && (operatingTime < MAX_AGE))
            this.operatingTime = operatingTime;
        else
            throw new Exception("Invalidate age of the airlines.");

    }

    /**
     * Get the operating time of the airline
     * {@link Airline#operatingTime}
     *
     * @return  int Operating time of the airline
     */
    public int getOperatingTime() {

        return operatingTime;

    }

    /**
     * Set the name of the airline
     * {@link Airline#name}
     *
     * @param name  String Name of the airline
     */
    public void setName(String name) {

        this.name = name;

    }

    /**
     * Get the name of the airline
     * {@link Airline#name}
     *
     * @return  String Name of the airline
     */
    public String getName() {

        return name;

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

        Airline that = (Airline) o;

        if (operatingTime != that.operatingTime) {
            return false;
        }

        return name.equals(that.name);

    }

    @Override
    public int hashCode(){

        return Objects.hash(name, operatingTime);
    }

    @Override
    public String toString(){

        return "airline{" +
                "name='" + name +'\'' +
                ", operatingTime=" + operatingTime +
                "}";

    }

    public int compareTo(Airline another){

        return name.compareTo(another.name);

    }
}
