package svc.Impl;

import dao.Impl.CountryDAOImpl;
import entities.CountryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import svc.CountryService;
import svc.Factory;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Людмила on 14.07.2017.
 */
@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryDAOImpl countryDAO;

    @Override
    public List<CountryEntity> getAllCountries() throws SQLException {
        return countryDAO.getAllCountries();
    }
}
