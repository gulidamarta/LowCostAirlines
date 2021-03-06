package com.lowcostairline.dao.factory;


import com.lowcostairline.dao.impl.AircraftDao;
import com.lowcostairline.dao.impl.PilotDao;
import com.lowcostairline.dao.impl.StewardDao;

public final class DaoFactory {

    private static final DaoFactory instance = new DaoFactory();
    private final AircraftDao aircraftDao = new AircraftDao();
    private final PilotDao pilotDao = new PilotDao();
    private final StewardDao stewardDao = new StewardDao();

    private DaoFactory(){}

    public static DaoFactory getInstance(){
        return instance;
    }

    public AircraftDao getAircraftDao(){
        return aircraftDao;
    }

    public PilotDao getPilotDao(){
        return pilotDao;
    }

    public StewardDao getStewardDao(){
        return stewardDao;
    }
}
