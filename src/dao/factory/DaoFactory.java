package dao.factory;


import dao.impl.AircraftDao;
import dao.impl.PilotDao;
import dao.impl.StewardDao;

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
