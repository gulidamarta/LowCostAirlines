package service.impl;

import beans.aircraftCrew.pilot.Pilot;
import dao.exception.DAOException;
import dao.factory.DaoFactory;
import dao.impl.PilotDao;
import service.PilotService;
import service.exception.ServiceException;

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
