package svc;

import entities.CountryEntity;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Людмила on 14.07.2017.
 */
public interface CountryService {
    List<CountryEntity> getAllCountries() throws SQLException;
}
