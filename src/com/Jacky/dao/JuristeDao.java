package com.Jacky.dao;

import com.Jacky.model.Juriste;
import com.Jacky.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class JuristeDao {
	
    public List<Juriste> getAllJuristes() {
    	
    	
        List<Juriste> juriste = new ArrayList<Juriste>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            juriste = session.createQuery("from Juriste").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
    
        }
        return juriste;
    }

}
