package com.Jacky.dao;

import com.Jacky.model.ArchivesDeCasConcrets;
import com.Jacky.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;
 
import org.hibernate.Session;
import org.hibernate.Transaction;
 
 
public class ArchivesDeCasConcretsDao {
 
/* Methode pour ajouter un cahier des charges */   
	
 public void addCahier(ArchivesDeCasConcretsDao cahierId) {
	 
//initialisation de la variable trns de type Transaction
        Transaction trns = null;
        
//ouverture d'une nouvelle connexion avec la DB qu'il faudra fermer à la fin des opérations 
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
//methode save pour générer un nouvel identifiant sans faire de vérification
            session.save(cahierId);
            
//enregistre les nouvelles données dans le DB de façon permanente
            session.getTransaction().commit();
            
        } catch (RuntimeException e) {
            if (trns != null) {
            	
//rollback des données (récupérations des anciennes) lors d'une exception
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
        	
//synchro des données avec la DB avec les nouvelles données
//garde les données dans la memoire cache, si une exception intervient, elles seront disponible        	
//Hibernate de lui-même lance le flush des opérations
            
            
//fermeture de la connexion avec la DB
            session.close();
        }
    } 
    
 
/* Recuperer tous les cahiers des charges  */
    public List<ArchivesDeCasConcrets> getAllCahier() {
    	
    	
        List<ArchivesDeCasConcrets> cahier = new ArrayList<ArchivesDeCasConcrets>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            cahier = session.createQuery("from ArchivesDeCasConcrets").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
    
        }
        return cahier;
    }
    
    
}

