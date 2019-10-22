package service.factory;

import service.AircraftService;
import service.PilotService;
import service.StewardService;
import service.impl.AircraftServiceImpl;
import service.impl.PilotServiceImpl;
import service.impl.StewardServiceImpl;

public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final AircraftService aircraftService = new AircraftServiceImpl();
    private final PilotService pilotService = new PilotServiceImpl();
    private final StewardService stewardService = new StewardServiceImpl();

    private ServiceFactory() {}

    public static ServiceFactory getInstance(){
        return instance;
    }

    public AircraftService getAircraftService(){
        return aircraftService;
    }

    public PilotService getPilotService(){
        return pilotService;
    }

    public StewardService getStewardService(){
        return stewardService;
    }
}
