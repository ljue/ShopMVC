package dao;

import entities.CountryEntity;

import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

/**
 * Created by Людмила on 14.07.2017.
 */
public interface CountryDAO {
    public List<CountryEntity> getAllCountries() throws SQLException;
}
