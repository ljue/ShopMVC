package dao.Impl;

import dao.CountryDAO;
import entities.CountryEntity;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import util.HibernateUtil;

import javax.swing.*;
import java.io.FileWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Людмила on 14.07.2017.
 */

@Repository
public class CountryDAOImpl implements CountryDAO {

    private static Logger log = Logger.getLogger(CountryDAOImpl.class.getName());
//    public ClientEntity getClientById(Long id) throws SQLException {
//        Session session = null;
//        ClientEntity client = null;
//
//        try {
//            session = HibernateUtil.getSessionFactory().openSession();
//            client = session.load(ClientEntity.class, id);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'findById'", JOptionPane.OK_OPTION);
//        } finally {
//            if (session != null && session.isOpen()) {
//                session.close();
//            }
//        }
//        return client;
//
//    }
//
    public List<CountryEntity>  getAllCountries() throws SQLException {

        Session session = null;
        List countries = new ArrayList<CountryEntity>();
        System.out.println("Привет!");
        log.info("Some message");
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            countries = session.createCriteria(CountryEntity.class).list();
            for (Object ce:countries) {
                System.out.println(ce.toString());
                log.info(ce.toString());
            }
//            try(FileWriter writer = new FileWriter("D:\\JavaSchoolProject\\log.txt", true))
//            {
//                writer.append("reaction");
//                for (Object ce:countries) {
//                    writer.write(ce.toString());
//                    writer.append('\n');
//                }
//                writer.flush();
//            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'getAll'", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return countries;
    }
}
