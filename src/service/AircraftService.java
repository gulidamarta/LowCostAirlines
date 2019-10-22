package service;

import beans.aircraft.Aircraft;
import service.exception.ServiceException;

public interface AircraftService {
    void addNewAircraft(Aircraft aircraft) throws ServiceException;
    void editAircraftInfo(Aircraft aircraft, String[] params) throws ServiceException;
    void removeAircraft(Aircraft aircraft) throws ServiceException;
}
