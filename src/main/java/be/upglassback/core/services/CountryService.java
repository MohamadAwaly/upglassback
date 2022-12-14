package be.upglassback.core.services;

import be.upglassback.core.HibernateUtil;
import be.upglassback.core.dto.CountryDTO;
import be.upglassback.core.repository.CountryRepositoryImpl;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.jpa.EntityManagerHolder;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CountryService {
/*
    //Une methode par besoin
    //Un service interagie avec un ou plusieur repository ( DAO )
    //On appel ca un service pass pla

    // Donc on appel le service dans le bean qui execute la methode au lieu d'appeler le repository.
    // Un service va interagir avec plein de composant
    private final CountryRepositoryImpl countryRepository;

    public CountryService() {
        this.countryRepository = new CountryRepositoryImpl();
    }

    public Country getById(int id) {
        return countryRepository.getById(id);
    }

    public Country testDTO(int id) {
        CountryDTO countryDTO = new CountryDTO();

        return countryRepository.getById(id);
    }

    public void renomme(int id, String nouveaunom) {

        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            tx = session.beginTransaction();
            Country country = countryRepository.getById(id);
            country.setCountryName(nouveaunom);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }


    }

    public Country getContry() {

        EntityManager em = null;
        EntityTransaction ts = null;
        Country country = null;
        try {
            em = new EntityManagerHolder().gerCurrentEntityManager();
            ts = em.getTransaction();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }

    }


    public void createCountry(Country country) {
        countryRepository.create(country);

        /*
         * Methode non valide pour les transactions .. C'est une vrai erreur de conseption
         * ouvrir la connexion dans la m??thode de service et de la passe en parametre au differente m??thode des
         * classes au type riposittorie
         *
         * DataSource dataSource = DataSourceProvider.getSingleDatasourceInstance();
         * Connection conn = dataSource.getconnexion();
         * conn.setAutoCommit(false)
         *
         * countryRepository.create(country);
         * conn.commit
         *
         * */

        /*
         * Premiere v??ritable option valide
         * Data Access Object ( DAO )
         * le dao ne saplique pas a une seul entit?? m??ti??
         * on peut avoir des m??thode tres sp??cialis??e qii applique plusieur table
         *
         * donc ici au lieu de faire appel a des repository on fait appel a des DAO
         * */

        // et donc ici on appel la m??thode qui invoque toutes les requ??tes. englober dans une transaction.
        // countryRepository.create(country);



        /*
         * Deuxieme Solution et je pense ce qu'on va utilis??
         *
         * Une m??thode de service peut etre transactionnelle.
         * Utilis?? de EJB
         * java EE est un ensemble d'api qui permet au developpeur de developper des applications de classe entreprise
         * des applications distruber ou differente composant parle entre eux.
         * et donc il y a plein d'api. et il y a des api qui conserne plus la logique m??tier et les bases de donn??es.
         *
         * cette solutionva consiste a utilis??e un logiciel a part qui s"appel le EJB et c'est une solution qui n'est pas recommander
         *
         *
         * Conseiller un contener l??ger par opisition au conteneur lourd EJB grace aux api javaEE CDI context and dependency injection
         * cette api est bien plus recente.
         * JTA java transaction API
         *
         * Troisieme solution
         * Utilis?? Spring ( programmation oriente aspect ). aspect oriented programming with Spring.
         *
         *
         * */


    //}
}
