package com.lowcostairline.dao.impl;

import com.lowcostairline.beans.aircraft.Aircraft;
import com.lowcostairline.dao.Dao;
import com.lowcostairline.dao.exception.DAOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class AircraftDao implements Dao<Aircraft> {

    private List<Aircraft> aircrafts = new ArrayList<>();

    public AircraftDao(){
        aircrafts.add(new Aircraft("Airbus", 200, "low",
                5000, false, 2));
        aircrafts.add(new Aircraft());
    }

    @Override
    public Optional<Aircraft> get(int id) throws DAOException {
        return Optional.ofNullable(aircrafts.get((int) id));
    }

    @Override
    public List<Aircraft> getAll() throws DAOException{
        return aircrafts;
    }

    @Override
    public void save(Aircraft entity)  throws DAOException{
        aircrafts.add(entity);
    }

    @Override
    public void update(Aircraft entity, String[] params) throws DAOException{
        if (params.length == 6){
            entity.setModel(Objects.requireNonNull(params[0], "Model cannot be null."));
            entity.setSeatAmount(Integer.parseInt(params[1]));
            entity.setType(Objects.requireNonNull(params[2], "Type cannot be null."));
            entity.setFuelSupply(Float.parseFloat(params[3]));
            entity.setIsluggageCompartment(Boolean.parseBoolean(params[4]));
            entity.setEmergencyExitAmount(Integer.parseInt(params[5]));
            aircrafts.add(entity);
        }
    }

    @Override
    public void delete(Aircraft entity)  throws DAOException{
        aircrafts.remove(entity);
    }
}
