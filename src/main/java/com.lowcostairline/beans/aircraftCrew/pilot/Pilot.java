package com.lowcostairline.beans.aircraftCrew.pilot;


import com.lowcostairline.beans.aircraftCrew.AircraftCrew;

import java.util.Objects;

/**
 * Class, which define pilot and his/her
 * characteristic(-s).
 */
public class Pilot extends AircraftCrew {
    /** Flight hours of that pilot*/
    private int flightHours;

    /**
     * Constructor, which calls constructor without
     * params of th aircraft Crew class and sets all the
     * fields in the default values.
     *
     * @see AircraftCrew#AircraftCrew()
     * @see Pilot#Pilot(String, String, int, int)
     * @see Pilot#Pilot(String, String, int)
     * @see Pilot#Pilot(int)
     */
    public Pilot(){
        this.flightHours = 350;
    }

    /**
     * Constructor, which calls constructor without
     * params of the aircraft crew class and sets all the
     * fields in the values, given by the user.
     *
     * @param flightHours   Flight hours of that pilot(int)
     *
     * @see AircraftCrew#AircraftCrew()
     * @see Pilot#Pilot()
     * @see Pilot#Pilot(String, String, int, int)
     * @see Pilot#Pilot(String, String, int)
     */
    public Pilot(int flightHours){
        this.flightHours = flightHours;
    }

    /**
     * Constructor, which calls constructor with 3 params
     * of the aircraft Crew class and sets all fields of that class
     * in the default values.
     *
     * @param name  Name of the pilot.
     * @param surname   Surname of the pilot.
     * @param workExperience    Work experience of the pilot.
     *
     * @see AircraftCrew#AircraftCrew(String, String, int)
     * @see Pilot#Pilot(int)
     * @see Pilot#Pilot()
     * @see Pilot#Pilot(String, String, int, int)
     */
    public Pilot(String name, String surname, int workExperience){
        super(name, surname, workExperience);
        this.flightHours = 350;
    }

    /**
     * Constructor, which calls constructor with 3 params
     * of the aircraft crew class and sets all the fields in
     * the values, given by the user.
     *
     * @param name  Name of the pilot
     * @param surname   Surname of the pilot
     * @param workExperience    Work experience of the pilot.
     * @param flightHours   Amount of the flight hours.
     *
     * @see AircraftCrew#AircraftCrew(String, String, int)
     * @see Pilot#Pilot(String, String, int)
     * @see Pilot#Pilot(int)
     * @see Pilot#Pilot()
     */
    public Pilot(String name, String surname, int workExperience,
                 int flightHours){
        super(name, surname, workExperience);
        this.flightHours = flightHours;
    }

    /**
     * Get the amount of flight hours of the pilot.
     * {@link Pilot#flightHours}
     *
     * @return  Amount of the flight hours of the pilot.
     */
    public int getFlightHours() {
        return flightHours;
    }

    /**
     * Set the amount of flight hours of the pilot.
     * {@link Pilot#flightHours}
     *
     * @param flightHours   Amount of flight hours of the pilot.
     * @throws Exception    This is exception is raised, when flight hours is less than 250.
     */
    public void setFlightHours(int flightHours) throws Exception{
        int MIN_FLIGHT_HOURS = 0;
        if(flightHours >= MIN_FLIGHT_HOURS)
            this.flightHours = flightHours;
        else
            throw new Exception("Amount of the flight hours should be above 250 hours.");
    }

    public int compareTo(AircraftCrew another){
        return getName().compareTo(another.getName());
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

        Pilot that = (Pilot) o;

        return flightHours == that.flightHours;
    }

    @Override
    public int hashCode(){
        return Objects.hash(getName(), getSurname(), getWorkExperience(), flightHours);
    }

    @Override
    public String toString(){
        return "pilot{" +
                "flightHours='" +  flightHours +
                "}";
    }
}
