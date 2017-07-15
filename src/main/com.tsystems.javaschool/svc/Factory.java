package svc;

import dao.ClientDAO;
import dao.CountryDAO;
import dao.Impl.ClientDAOImpl;
import dao.Impl.CountryDAOImpl;
import entities.CountryEntity;

/**
 * Created by Людмила on 14.07.2017.
 */
public class Factory {

    private static Factory instance = null;
    //private static ClientDAO clientDAO = null;
    private static CountryDAO countryDAO = null;

    public static synchronized Factory getInstance(){
        if (instance == null){
            instance = new Factory();
        }
        return instance;
    }

    public CountryDAO getCountryDAO(){
        if (countryDAO == null){
            countryDAO = new CountryDAOImpl();
        }
        return countryDAO;
    }
}
