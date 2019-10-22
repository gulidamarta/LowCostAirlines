package service;

import beans.aircraftCrew.steward.Steward;
import service.exception.ServiceException;

public interface StewardService {
     void addNewSteward(Steward steward) throws ServiceException;
     void editStewardInfo(Steward steward, String[] params) throws Exception;
     void dismissSteward(Steward steward) throws ServiceException;
}
