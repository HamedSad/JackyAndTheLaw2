package com.Jacky.dao;

import com.Jacky.model.Users;
import com.Jacky.util.HibernateUtil;
 
import org.hibernate.Session;
import org.hibernate.Transaction;
 
 
public class UsersDao {
 
/* Methode pour ajouter un utilisateur */   
	
 public void addUser(Users user, String nom, String prenom,String motDePasse, String mail, String entreprise, String domaineProfessionel) {
	 
//initialisation de la variable trns de type Transaction
        Transaction trns = null;
        System.out.println("test UserDao 1");
               
//ouverture d'une nouvelle connexion avec la DB qu'il faudra fermer à la fin des opérations 
             
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        user = new Users();
        user.setNomUser(nom);
        user.setPrenomUser(prenom);
        user.setMotDePasse(motDePasse);
        user.setMail(mail);
        user.setEntreprise(entreprise);
        user.setDomaineProfessionel(domaineProfessionel);
        
        try {
        	 System.out.println("test Userdao 2");
            trns = session.beginTransaction();
//methode save pour générer un nouvel identifiant sans faire de vérification
            session.save(user);
            System.out.println("test UserDao 3");
//enregistre les nouvelles données dans le DB de façon permanente
            session.getTransaction().commit();
            System.out.println("test UserDao 4");
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
 
}