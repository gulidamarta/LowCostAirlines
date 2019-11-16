package com.lowcostairline.service.impl;

import com.lowcostairline.beans.aircraftCrew.pilot.Pilot;
import com.lowcostairline.dao.exception.DAOException;
import com.lowcostairline.dao.factory.DaoFactory;
import com.lowcostairline.dao.impl.PilotDao;
import com.lowcostairline.service.PilotService;
import com.lowcostairline.service.exception.ServiceException;

public class PilotServiceImpl implements PilotService {
    @Override
    public void addNewPilot(Pilot pilot) throws ServiceException {
        // TODO: Check params
        try {
            DaoFactory daoFactory = DaoFactory.getInstance();
            PilotDao pilotDao = daoFactory.getPilotDao();
            pilotDao.save(pilot);
        }catch (DAOException e){
            throw new ServiceException(e);
        }
    }

    @Override
    public void editPilotInfo(Pilot pilot, String[] params) throws Exception {
        // TODO: Check params
        DaoFactory daoFactory = DaoFactory.getInstance();
        PilotDao pilotDao = daoFactory.getPilotDao();
        pilotDao.update(pilot, params);
    }

    @Override
    public void dismissPilot(Pilot pilot) throws ServiceException{
        // TODO: Check params
        try {
            DaoFactory daoFactory = DaoFactory.getInstance();
            PilotDao pilotDao = daoFactory.getPilotDao();
            pilotDao.delete(pilot);
        }
        catch (DAOException e){
            throw new ServiceException(e);
        }
    }
}
