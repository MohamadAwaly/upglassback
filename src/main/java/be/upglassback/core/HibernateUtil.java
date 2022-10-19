package be.upglassback.core;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    //Quand l'application demarre on passe par build session factory et pour l'obtenir on ecrit
    // new Configuration().configure().buildSessionFactory();
    // ca veux dire va chercher un fichier de configuration hibernate.cfg
    //qui contient un sesison factory
    // est donc on peut le recupere avec getSessionFactory().
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            return new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    public static SessionFactory getSessionFactory() {

        return sessionFactory;
    }
}
