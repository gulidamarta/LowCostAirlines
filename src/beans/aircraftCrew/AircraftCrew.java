package beans.aircraftCrew;

import java.util.Objects;

import beans.Entity;

/**
 * aircraft - a class that implements basic
 * characteristics of all types of aircraft crew.
 * It can be extended, if you want to create:
 * <ul>
 *     <li>pilot</li>
 *     <li>steward</li>
 *     <li>Stewardess</li>
 * </ul>
 * @author Marta Gulida
 * @version 1.0
 */

public abstract class AircraftCrew extends Entity implements java.io.Serializable, Comparable<AircraftCrew>{
    /** Field name for name of the aircraft crew member */
    private String name;

    /** Field surname for surname of the aircraft crew member*/
    private String surname;

    /** Field work experience, which show how many years a person has been working */
    private int workExperience;

    /**
     * Construct, which sets all fields
     * in the default value.
     *
     * @see AircraftCrew#AircraftCrew(String, String, int)
     * */
    public AircraftCrew(){

        name = "Name: ";
        surname = "Surname: ";
        workExperience = 0;

    }

    /**
     * Constructor, which sets all fields
     * in the values, which are given by the user.
     *
     * @param name  name of the aircraft member
     * @param surname   surname of the aircraft member
     * @param workExperience    work experience in the years
     *
     * @see AircraftCrew#AircraftCrew()
     */
    public AircraftCrew(String name, String surname, int workExperience){
        this.name = name;
        this.surname = surname;
        this.workExperience = workExperience;
    }

    /**
     * Get the name of the aircraft member.
     * {@link AircraftCrew#name}
     *
     * @return  string  name of the aircraft member
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the aircraft member.
     * {@link AircraftCrew#name}
     *
     * @param name  name of the aircraft member
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the number of the years, which
     * that worker has worked.
     * {@link AircraftCrew#workExperience}
     *
     * @return  int amount(in years) of work experience
     */
    public int getWorkExperience() {
        return workExperience;
    }

    /**
     * Set the number of the work experience
     * {@link AircraftCrew#workExperience}

     * @param workExperience    amount(in years) of working experience
     * @throws Exception    if you try to pass invalidate number of years(smaller than 0)
     *                      or higher than 30
     */
    public void setWorkExperience(int workExperience) throws Exception{
        int MAX_WORK_EXPERIENCE = 500;
        if ((workExperience < MAX_WORK_EXPERIENCE) &&
                (workExperience >= 0))
            this.workExperience = workExperience;
        else
            throw new Exception("Working experience should be equal or" +
                    " higher than 0 and lower than 30.");
    }

    /**
     * Get the surname of the aircraft crew member
     * {@link AircraftCrew#surname}
     *
     * @return  String  surname of the aircraft member
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Set the surname of the aircraft crew member
     * {@link AircraftCrew#surname}
     *
     * @param surname   String  surname of the aircraft crew member
     */
    public void setSurname(String surname) {
        this.surname = surname;
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

        AircraftCrew that = (AircraftCrew) o;

        if(!name.equals(that.name))
            return false;

        if(!surname.equals(that.surname))
            return false;

        return workExperience == that.workExperience;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, surname, workExperience);
    }

    @Override
    public String toString(){
        return "aircraftCrew{" +
                "name='" + name +'\'' +
                ", surname=" + surname + '\'' +
                ", workExperience=" + workExperience + "}";
    }

    public abstract int compareTo(AircraftCrew another);
}
