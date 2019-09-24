package com.company.AircraftCrew;

public abstract class AircraftCrew implements java.io.Serializable{
    protected String name;
    protected String surname;
    protected int workExperience;
    protected final int MAX_WORK_EXPERIENCE = 30;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) throws Exception{
        if ((workExperience < MAX_WORK_EXPERIENCE) &&
                (workExperience >= 0))
            this.workExperience = workExperience;
        else
            throw new Exception("Working experience should be equal or" +
                    " higher than 0 and lower than 30.");
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
