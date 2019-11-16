package com.lowcostairline.dao.impl;

import com.lowcostairline.beans.aircraftCrew.steward.Steward;
import com.lowcostairline.dao.Dao;
import com.lowcostairline.dao.exception.DAOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class StewardDao implements Dao<Steward> {

    public List<Steward> stewards = new ArrayList<>();

    public StewardDao(){
        stewards.add(new Steward("Jesica", "Pando", 5, "female", 175, false));
        stewards.add(new Steward("Bob", "Malkin", 7, "male", 178, true));
    }

    @Override
    public Optional<Steward> get(int id)  throws DAOException {
        return Optional.ofNullable(stewards.get((int) id));
    }

    @Override
    public List<Steward> getAll() throws DAOException {
        return stewards;
    }

    @Override
    public void save(Steward entity) throws DAOException {
        stewards.add(entity);
    }

    @Override
    public void update(Steward entity, String[] params) throws Exception {
        if (params.length == 6){
            entity.setName(Objects.requireNonNull(params[0], "Name cannot be null."));
            entity.setSurname(Objects.requireNonNull(params[1], "Surname cannot be null."));
            entity.setWorkExperience(Integer.parseInt(params[2]));
            entity.setGender(Objects.requireNonNull(params[3], "Gender cannot be null."));
            entity.setHeight(Integer.parseInt(params[4]));
            entity.setChiefPurser(Boolean.parseBoolean(params[5]));
        }
        if (params.length == 3){
            entity.setName(Objects.requireNonNull(params[0], "Name cannot be null."));
            entity.setSurname(Objects.requireNonNull(params[1], "Surname cannot be null."));
            entity.setWorkExperience(Integer.parseInt(params[2]));
        }
    }

    @Override
    public void delete(Steward entity) throws DAOException{
        stewards.remove(entity);
    }
}
