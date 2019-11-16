package com.lowcostairline.beans.aircraftCrew.steward;


import com.lowcostairline.beans.aircraftCrew.AircraftCrew;

import java.util.Objects;

/**
 * Class that describes basic features of the
 * steward. It includes:
 * <ul>
 *     <li>Gender</li>
 *     <li>Height, which is very important for steward</li>
 *     <li>Boolean value, which says is steward a chief purser or not</li>
 * </ul>
 * @author Marta Gulida
 * @version 1.0
 */
public class Steward extends AircraftCrew {
    /** Field, which describes gender of the steward */
    private String gender;

    /** Field, which describes height of the steward */
    private int height;

    /** Field, which says is steward a chief purser or not */
    private boolean isChiefPurser;

    /**
     * Constructor, which calls default constructor
     * of the aircraftCrew class and sets all the
     * fields in the default values.
     *
     * @see AircraftCrew#AircraftCrew()
     * @see Steward#Steward(String, String, int)
     * @see Steward#Steward(String, int, boolean)
     * @see Steward#Steward(String, String, int, String, int, boolean)
     */
    public Steward(){
        this.gender = "";
        this.height = 170;
        this.isChiefPurser = false;
    }

    /**
     * Constructor, which calls default constructor
     * of the aircraftCrew class and sets all the
     * fields in the values, given by the user.
     *
     * @param gender    Gender of the steward
     * @param height    Height of the steward
     * @param isChiefPurser Boolean values, which says is steward a chief purser or not
     *
     * @see AircraftCrew#AircraftCrew()
     * @see Steward#Steward()
     * @see Steward#Steward(String, String, int)
     * @see Steward#Steward(String, String, int, String, int, boolean)
     */
    public Steward(String gender, int height, boolean isChiefPurser){
        this.gender = gender;
        this.height = height;
        this.isChiefPurser = isChiefPurser;
    }

    /**
     * Constructor, which calls the constructor of the
     * aircraftCrew class and sets all the fields in the
     * default values.
     *
     * @param name  Name of the steward
     * @param surname   Surname of the steward
     * @param workExperience    Work experience of the steward
     *
     * @see AircraftCrew#AircraftCrew(String, String, int)
     * @see Steward#Steward(String, int, boolean)
     * @see Steward#Steward()
     * @see Steward#Steward(String, String, int, String, int, boolean)
     */
    public Steward(String name, String surname, int workExperience){
        super(name, surname, workExperience);
        this.gender = "male";
        this.height = 180;
        this.isChiefPurser = false;
    }

    /**
     * Constructor, which calls for the constructor
     * of the aircraft Crew class with 3 params and sets
     * all the fields in the values given by the user.
     *
     * @param name  Name of the steward
     * @param surname   Surname of the steward
     * @param workExperience    Work experience of the steward
     * @param gender    Gender of the steward
     * @param height    Height of the steward
     * @param isChiefPurser Boolean values, which says is steward a chief purser or not
     *
     * @see AircraftCrew#AircraftCrew(String, String, int)
     * @see Steward#Steward(String, String, int)
     * @see Steward#Steward()
     * @see Steward#Steward(String, int, boolean)
     */
    public Steward(String name, String surname, int workExperience,
                   String gender, int height, boolean isChiefPurser){
        super(name, surname, workExperience);
        this.gender = gender;
        this.height = height;
        this.isChiefPurser = isChiefPurser;
    }

    /**
     * Get the boolean value, which says is steward a
     * chief purser or not.
     * {@link Steward#isChiefPurser}
     *
     * @return  Boolean values, which says is steward a chief purser or not
     */
    public boolean isChiefPurser() {
        return isChiefPurser;
    }

    /**
     * Set the boolean value, which says is steward
     * a chief purser or not.
     * {@link Steward#isChiefPurser}
     *
     * @param chiefPurser   Boolean values, which says is steward a chief purser or not
     */
    public void setChiefPurser(boolean chiefPurser) {
        isChiefPurser = chiefPurser;
    }

    /**
     * Get the height of the steward.
     * {@link Steward#height}
     *
     * @return  Height of the steward
     */
    public int getHeight() {
        return height;
    }

    /**
     * Set the height of the steward.
     * {@link Steward#height}
     *
     * @param height    Height of the steward
     * @throws IndexOutOfBoundsException    This exception is thrown, when height is less than 160
     *                                      and above 200.
     */
    public void setHeight(int height) throws IndexOutOfBoundsException{
        int MIN_HEIGHT = 160;
        int MAX_HEIGHT = 200;
        if ((height > MIN_HEIGHT) &&
                (height < MAX_HEIGHT))
            this.height = height;
        else
            throw new IndexOutOfBoundsException("Height of the steward should be less than 200" +
                    " and above 160.");
    }

    /**
     * Set the gender of the steward.
     * {@link Steward#gender}
     *
     * @param gender    Gender of the steward
     */
    public void setGender(String gender){
        this.gender = gender;
    }

    /**
     * Get the gender of the steward.
     * {@link Steward#gender}
     *
     * @return  Gender of the steward
     */
    public String getGender() {
        return gender;
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

        Steward that = (Steward) o;


        if(!gender.equals(that.gender)) {
            return false;
        }

        if (isChiefPurser != that.isChiefPurser){
            return false;
        }

        return height == that.height;
    }

    @Override
    public int hashCode(){
        return Objects.hash(getName(), getSurname(), getWorkExperience(), gender, isChiefPurser);
    }

    @Override
    public String toString(){
        return "steward{" +
                " gender='" + gender +'\'' +
                ", height=" + height +
                ", isChiefPurser=" + isChiefPurser +
                "}";
    }

    @Override
    public int compareTo(AircraftCrew another){
        return getName().compareTo(another.getName());
    }
}
