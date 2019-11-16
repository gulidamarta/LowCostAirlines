package com.lowcostairline.service;

import com.lowcostairline.beans.aircraftCrew.steward.Steward;
import com.lowcostairline.service.exception.ServiceException;

public interface StewardService {
     void addNewSteward(Steward steward) throws ServiceException;
     void editStewardInfo(Steward steward, String[] params) throws Exception;
     void dismissSteward(Steward steward) throws ServiceException;
}
