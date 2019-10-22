package service.impl;

import beans.aircraft.Aircraft;
import dao.exception.DAOException;
import dao.impl.AircraftDao;
import dao.factory.DaoFactory;
import service.AircraftService;
import service.exception.ServiceException;

public class AircraftServiceImpl implements AircraftService {
    @Override
    public void addNewAircraft(Aircraft aircraft) throws ServiceException{
        // TODO: Check params
        try {
            DaoFactory daoFactory = DaoFactory.getInstance();
            AircraftDao aircraftDao = daoFactory.getAircraftDao();
            aircraftDao.save(aircraft);
        }
        catch (DAOException e){
            throw new ServiceException(e);
        }
    }

    @Override
    public void editAircraftInfo(Aircraft aircraft, String[] params) throws ServiceException {
        if (params == null)
            throw new ServiceException("You should pass params");
        try {
            DaoFactory daoFactory = DaoFactory.getInstance();
            AircraftDao aircraftDao = daoFactory.getAircraftDao();
            aircraftDao.update(aircraft, params);
        }
        catch (DAOException e){
            throw new ServiceException(e);
        }
    }

    @Override
    public void removeAircraft(Aircraft aircraft) throws ServiceException{
        // TODO: Check params
        try {
            DaoFactory daoFactory = DaoFactory.getInstance();
            AircraftDao aircraftDao = daoFactory.getAircraftDao();
            aircraftDao.delete(aircraft);
        }
        catch (DAOException e){
            throw new ServiceException(e);
        }
    }
}
