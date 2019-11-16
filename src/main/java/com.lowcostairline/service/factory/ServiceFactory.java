package com.lowcostairline.service.factory;

import com.lowcostairline.service.AircraftService;
import com.lowcostairline.service.PilotService;
import com.lowcostairline.service.StewardService;
import com.lowcostairline.service.impl.AircraftServiceImpl;
import com.lowcostairline.service.impl.PilotServiceImpl;
import com.lowcostairline.service.impl.StewardServiceImpl;

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
