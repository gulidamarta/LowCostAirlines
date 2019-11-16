package com.lowcostairline.service.impl;

import com.lowcostairline.beans.aircraftCrew.steward.Steward;
import com.lowcostairline.dao.exception.DAOException;
import com.lowcostairline.dao.factory.DaoFactory;
import com.lowcostairline.dao.impl.StewardDao;
import com.lowcostairline.service.StewardService;
import com.lowcostairline.service.exception.ServiceException;

public class StewardServiceImpl implements StewardService {
    @Override
    public void addNewSteward(Steward steward) throws ServiceException {
        // TODO: Check params
        try {
            DaoFactory daoFactory = DaoFactory.getInstance();
            StewardDao stewardDao = daoFactory.getStewardDao();
            stewardDao.save(steward);
        }
        catch (DAOException e){
            throw new ServiceException(e);
        }
    }

    @Override
    public void editStewardInfo(Steward steward, String[] params) throws Exception {
        // TODO: Check params
        DaoFactory daoFactory = DaoFactory.getInstance();
        StewardDao stewardDao = daoFactory.getStewardDao();
        stewardDao.update(steward, params);
    }

    @Override
    public void dismissSteward(Steward steward) throws ServiceException{
        // TODO: Check params
        try {
            DaoFactory daoFactory = DaoFactory.getInstance();
            StewardDao stewardDao = daoFactory.getStewardDao();
            stewardDao.delete(steward);
        }
        catch (DAOException e){
            throw new ServiceException(e);
        }
    }
}
