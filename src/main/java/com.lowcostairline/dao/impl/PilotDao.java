package com.lowcostairline.dao.impl;

import com.lowcostairline.beans.aircraftCrew.pilot.Pilot;
import com.lowcostairline.dao.Dao;
import com.lowcostairline.dao.exception.DAOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PilotDao implements Dao<Pilot> {

    private List<Pilot> pilots = new ArrayList<>();

    public PilotDao(){
        pilots.add(new Pilot("David", "Kuliash", 20));
        pilots.add(new Pilot("Mark", "Lubiadko", 25));
    }

    @Override
    public Optional<Pilot> get(int id)  throws DAOException {
        return Optional.ofNullable(pilots.get((int) id));
    }

    @Override
    public List<Pilot> getAll() throws DAOException {
        return pilots;
    }

    @Override
    public void save(Pilot entity) throws DAOException {
        pilots.add(entity);
    }

    @Override
    public void update(Pilot entity, String[] params) throws Exception {
        if (params.length == 3){
            entity.setName(Objects.requireNonNull(params[0], "Name cannot be null."));
            entity.setSurname(Objects.requireNonNull(params[1], "Surname cannot be null."));
            entity.setWorkExperience(Integer.parseInt(params[2]));
            pilots.add(entity);
        }
    }

    @Override
    public void delete(Pilot entity)  throws DAOException{
        pilots.remove(entity);
    }
}
