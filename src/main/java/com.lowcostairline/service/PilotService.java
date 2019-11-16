package com.lowcostairline.service;

import com.lowcostairline.beans.aircraftCrew.pilot.Pilot;
import com.lowcostairline.service.exception.ServiceException;

public interface PilotService {
    void addNewPilot(Pilot pilot) throws ServiceException;
    void editPilotInfo(Pilot pilot, String[] params) throws Exception;
    void dismissPilot(Pilot pilot) throws ServiceException;
}
