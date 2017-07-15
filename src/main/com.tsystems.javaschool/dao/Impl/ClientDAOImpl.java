package dao.Impl;

import dao.ClientDAO;
import org.hibernate.Session;
import util.HibernateUtil;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Людмила on 14.07.2017.
 */
public class ClientDAOImpl implements ClientDAO {


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
//    public Collection getAllClients() throws SQLException {
//
//        Session session = null;
//        List clients = new ArrayList<ClientEntity>();
//        try {
//            session = HibernateUtil.getSessionFactory().openSession();
//            clients = session.createCriteria(ClientEntity.class).list();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'getAll'", JOptionPane.OK_OPTION);
//        } finally {
//            if (session != null && session.isOpen()) {
//                session.close();
//            }
//        }
//        return clients;
//    }
}
