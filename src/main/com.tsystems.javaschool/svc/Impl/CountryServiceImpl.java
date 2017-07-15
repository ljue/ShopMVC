package svc.Impl;

import dao.CountryDAO;
import dao.Impl.CountryDAOImpl;
import entities.CountryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import svc.CountryService;
import svc.Factory;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Людмила on 14.07.2017.
 */

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryDAO countryDAO;

    @Transactional
    @Override
    public List<CountryEntity> getAllCountries() throws SQLException {


//        try(FileWriter writer = new FileWriter("D:\\JavaSchoolProject\\log.txt", true))
//        {
//            writer.append("reaction");
////            for (Object ce:countries) {
////                writer.write(ce.toString());
////                writer.append('\n');
////            }
//            writer.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return countryDAO.getAllCountries();
    }
}
