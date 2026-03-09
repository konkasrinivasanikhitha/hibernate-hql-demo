package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.loader.ProductDataLoader;
import com.hibernate.util.HibernateUtil;

public class HQLDemo {

    public static void main(String[] args) {

        SessionFactory factory = HibernateUtil.getSessionFactory();

        Session session = factory.openSession();

        ProductDataLoader.loadSampleProducts(session);

        session.close();
        factory.close();
    }
}