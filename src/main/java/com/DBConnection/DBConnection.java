package com.DBConnection;

import com.HibernateConfig.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DBConnection {

    private SessionFactory sessionFactory;

    public DBConnection() {
        sessionFactory = HibernateConfig.getSessionFactory();
    }

    protected Session GetSession() {

        Session session = sessionFactory.openSession();

        return session;

    }

}
