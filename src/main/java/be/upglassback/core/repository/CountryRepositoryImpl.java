package be.upglassback.core.repository;

import be.upglassback.core.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CountryRepositoryImpl {


    /*
     * Pour partager une data source d'une maniere professioneel il faut utilisée des solitions par des orm
     * Ou D'utilisée Spring ou d'utilisée CDI
     * */


    // Ajoute des méthode que d'opération de CRUD.

    /*public void create(Country country) {
        // retourner un boolean pour dire si mon execution est bien passée.
        // retourner le pays qui a était insérer ?
        // le pays insérer on connais pas sont ID parceque c'est un autoIncrémente.
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.persist(country);
            tx.commit();
            System.out.println("Country ajouter");
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

    public void update(Country country) {
        // update country
    }

    public void delete(int id) {
        //Delete contry
    }

    // on fournira l'identifiant du pays a lire
    public Country getById(int id) {
        // le resultat d'une requête de récuperation d'un pays.
        Country country = new Country();
        Session session = null;

        session = HibernateUtil.getSessionFactory().getCurrentSession();
        country = session.get(Country.class, id);
        System.out.println("Country lu");
        return country;
    }

    public void renomme(int id, String nouveauNom) {
        Country country = new Country();
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            country = session.get(Country.class, id);
            country.setCountryName(nouveauNom);
            tx.commit();
            System.out.println("Country updated");
        } catch (Throwable t) {
            if (tx != null) {
                tx.rollback();
            }
            t.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    // public List<Country> list() {
    // c'est tres rare de vouloir lire l'intégralitée d'une table, normalement on fait une pagination.
    //List<Country> countries = new ArrayList<Country>();
    // ajouter les pays a la liste recupere par la requete via une boucle.
    // return countries;
    // }

*/
}
