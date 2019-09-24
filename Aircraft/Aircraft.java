package com.company.Aircraft;

// Use @see when there is related code that might help the user understand how to use the API.

/**
 * Aircraft is a class that implements basic
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
 *    <li>Registration number of the current airplane,
 *      which is given according to the
 *      <a href="https://en.wikipedia.org/wiki/Aircraft_registration">
 *          following rule</a></li>
 * </ul>
 * @author Marta Gulida
 * @version 1.0
 */
public class Aircraft implements java.io.Serializable {
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

    /** Field id, which should be in the correct format */
    private String id;

    /**
     * Constructor, which set all the fields of the
     * aircraft in default values.
     *
     * @see Aircraft#Aircraft(String, int, String, float, boolean, int, String)
     */
    public Aircraft(){
        // values, which will be used as default
        model = "Airbus 700";
        seatAmount = 100;
        type = "React";
        fuelSupply = 23830;
        isluggageCompartment = true;
        emergencyExitAmount = 4;
        id = "AA756600";
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
     * @param id                    registration number
     *
     * @see Aircraft#Aircraft()
     */
    public Aircraft(String model, int seatNumber, String type,
                    float fuelSupply, boolean isluggageCompartment,
                    int emergencyExitAmount, String id){
        this.model = model;
        this.seatAmount = seatNumber;
        this.type = type;
        this.fuelSupply = fuelSupply;
        this.isluggageCompartment = isluggageCompartment;
        this.emergencyExitAmount = emergencyExitAmount;
        this.id = id;
    }

    /**
     * Check the given id for correctness. This method will
     * return true if the first two symbols are letters and
     * other four symbols are digits. Otherwise - false.
     *
     * @param id    id to be checked
     * @return      <code>true</code> if id is in the correct format;
     */
    private boolean isCorrectId(String id){
        if (id.length() != 6)
            return false;
        char firstChar = id.charAt(0);
        char secondChar = id.charAt(1);
        if ((!Character.isAlphabetic(firstChar))
                || (!Character.isAlphabetic(secondChar)))
            return false;
        for(int i = 2; i < id.length(); i++) {
            if (!Character.isDigit(id.charAt(i)))
                return false;
        }
        return true;
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

    /**
     * Set the id (Registration number)
     * {@link Aircraft#id}
     *
     * @param id    Registration number of the aircraft
     * @throws Exception    Throws Exception, when given first two symbols are not letters
     * or follow four symbols are not digits.
     */
    public void setId(String id) throws Exception {
        if (isCorrectId(id))
            this.id = id;
        else
            throw new Exception("Id is incorrect. First two symbols should be letters, and other should be digits.");
    }

    /**
     * Get id of the aircraft
     * {@link Aircraft#id}
     *
     * @return  String  Returns id of the aircraft
     */
    public String getId() {
        return id;
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

        if(!id.equals(that.id))
            return false;

        if(!model.equals(that.model))
            return false;

        return type.equals(that.type);
    }

    @Override
    public int hashCode(){
        int result = type != null ? type.hashCode()
                                    : 0;
        int temp1 = model != null ? model.hashCode()
                                    : 0;
        int temp2 = id != null ? id.hashCode()
                                : 0;

        // expression for calculating hash code
        result = 31 * result + 2*temp1 + (isluggageCompartment ? 1 : 0) +
                5*seatAmount + 2*emergencyExitAmount + 3*temp2 +
                Float.floatToIntBits(fuelSupply)*4;
        return result;
    }

    @Override
    public String toString(){
        return "Aircraft{" +
                "model='" + model +'\'' +
                ", seatAmount=" + seatAmount +
                ", type=" + type + '\'' +
                ", fuelSupply=%.2f" + fuelSupply +
                ", isluggageCompartment=" + isluggageCompartment +
                ", emergencyExitAmount=" + emergencyExitAmount +
                ", id=" + id + '\'' + "}";
    }
}
