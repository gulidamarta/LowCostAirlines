package beans.aircraft;

import beans.Entity;

import java.util.Objects;

/**
 * aircraft is a class that implements basic
 * characteristics for all aircraft.
 * An aircraft object encapsulates the state information,
 * such as:
 * <ul>
 *    <li>Model of the current aircraft</li>
 *    <li>Amount of the seats</li>
 *    <li>Type of the current aircraft</li>
 *    <li>Fuel supply</li>
 *    <li>Information about the presence of the luggage compartment</li>
 *    <li>Amount of the emergence exits</li>
 * </ul>
 * @author Marta Gulida
 * @version 1.0
 */
public class Aircraft extends Entity implements java.io.Serializable, Comparable<Aircraft> {
    /** Field model */
    private String model;

    /** Field amount of the seats*/
    private int seatAmount;

    /** Field type of the aircraft */
    private String type;

    /** Field fuel supply */
    private float fuelSupply;

    /** Field, which indicates if aircraft has a luggage compartment*/
    private boolean isluggageCompartment;

    /** Field amount of the emergency exits */
    private int emergencyExitAmount;

    /**
     * Constructor, which set all the fields of the
     * aircraft in default values.
     *
     * @see Aircraft#Aircraft(String, int, String, float, boolean, int)
     */
    public Aircraft(){

    }

    /**
     * Constructor, which set all the fields of the
     * aircraft in the values, which are given
     * be the user.
     *
     * @param model                 model of the aircraft
     * @param seatNumber            number of the seats
     * @param type                  type of the aircraft
     * @param fuelSupply            amount of fuel, which is needed for that aircraft
     * @param isluggageCompartment  show the presence of the luggage compartment
     * @param emergencyExitAmount   amount of the emergency exits
     *
     * @see Aircraft#Aircraft()
     */
    public Aircraft(String model, int seatNumber, String type,
                    float fuelSupply, boolean isluggageCompartment,
                    int emergencyExitAmount){
        this.model = model;
        this.seatAmount = seatNumber;
        this.type = type;
        this.fuelSupply = fuelSupply;
        this.isluggageCompartment = isluggageCompartment;
        this.emergencyExitAmount = emergencyExitAmount;
    }

    /**
     * Set the model field in the value given in the brackets
     * {@link Aircraft#model}
     *
     * @param model model of the aircraft
     */
    public void setModel(String model){
        this.model = model;
    }

    /**
     *  Get the model of the aircraft
     *  {@link Aircraft#model}
     *
     * @return  string  Return model name
     */
    public String getModel(){
        return model;
    }

    /**
     * Set the amount of the seats field
     * {@link Aircraft#seatAmount}
     *
     * @param seatAmount    amount of the seats
     */
    public void setSeatAmount(int seatAmount){
        this.seatAmount = seatAmount;
    }

    /**
     * Get the amount of the seats in the aircraft
     * {@link Aircraft#seatAmount}
     *
     * @return  int Returns amount of the seats
     */
    public int getSeatAmount(){
        return seatAmount;
    }

    /**
     * Set the type field
     * {@link Aircraft#type}
     *
     * @param type  type of the aircraft
     */
    public void setType(String type){
        this.type = type;
    }

    /**
     * Get the type of the aircraft
     * {@link Aircraft#type}
     *
     * @return  String  Returns type of the aircraft
     */
    public String getType(){
        return type;
    }

    /**
     * Set the fuel supply field
     * {@link Aircraft#fuelSupply}
     *
     * @param fuelSupply    amount of the fuel, which is needed for aircraft
     */
    public void setFuelSupply(float fuelSupply) {
        this.fuelSupply = fuelSupply;
    }

    /**
     * Get the fuel supply
     * {@link Aircraft#fuelSupply}
     *
     * @return  float   Returns fuel supply for aircraft
     */
    public float getFuelSupply() {
        return fuelSupply;
    }

    /**
     * Set the boolean value for presence of the luggage compartment
     * {@link Aircraft#isluggageCompartment}
     *
     * @param isluggageCompartment  boolean value, which describes presence of luggage compartment
     */
    public void setIsluggageCompartment(boolean isluggageCompartment) {
        this.isluggageCompartment = isluggageCompartment;
    }

    /**
     * Get the boolean value, which describes luggage compartment
     * {@link Aircraft#isluggageCompartment}
     *
     * @return  boolean Returns true, if the aircraft has luggage compartment,
     * otherwise - false.
     */
    public boolean isIsluggageCompartment() {
        return isluggageCompartment;
    }

    /**
     * Set the amount of the emergency exits in the aircraft
     * {@link Aircraft#emergencyExitAmount}
     *
     * @param emergencyExitAmount   amount of the emergency exits
     */
    public void setEmergencyExitAmount(int emergencyExitAmount){
        this.emergencyExitAmount = emergencyExitAmount;
    }

    /**
     * Get the amount of the emergency exits
     * {@link Aircraft#emergencyExitAmount}
     *
     * @return  int Returns the amount of the emergency exits
     */
    public int getEmergencyExitAmount() {
        return emergencyExitAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null
                || getClass()
                != o.getClass()) {
            return false;
        }

        Aircraft that = (Aircraft) o;

        if (isluggageCompartment != that.isluggageCompartment) {
            return false;
        }

        if(seatAmount != that.seatAmount)
            return false;

        // if you want to implement equals for Float you should convert float value to int value
        if(Float.floatToIntBits(fuelSupply) != Float.floatToIntBits(that.fuelSupply))
            return false;

        if(emergencyExitAmount != that.emergencyExitAmount)
            return false;

        if(!model.equals(that.model))
            return false;

        return type.equals(that.type);
    }

    public int compareTo(Aircraft another){
        return model.compareTo(another.model);
    }

    @Override
    public int hashCode(){
        return Objects.hash(type, model, isluggageCompartment, seatAmount, emergencyExitAmount, fuelSupply);
    }

    @Override
    public String toString(){
        return "aircraft{" +
                "model='" + model +'\'' +
                ", seatAmount=" + seatAmount +
                ", type=" + type + '\'' +
                ", fuelSupply=%.2f" + fuelSupply +
                ", isluggageCompartment=" + isluggageCompartment +
                ", emergencyExitAmount=" + emergencyExitAmount +
                '\'' + "}";
    }
}
