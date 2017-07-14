package dao.Impl;

import dao.CountryDAO;
import entities.CountryEntity;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import util.HibernateUtil;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Людмила on 14.07.2017.
 */

@Repository
public class CountryDAOImpl implements CountryDAO {


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
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            countries = session.createCriteria(CountryEntity.class).list();
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
