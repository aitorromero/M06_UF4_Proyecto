package controllers;

import DAO.UnitatFormativaDAO;
import elementos.UnitatFormativa;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class Unitat_Controller implements UnitatFormativaDAO {

    @Override
    public void insertar(UnitatFormativa p) {
        EM_Controller oem = new EM_Controller();
        EntityManager em = oem.getEntityManager();

        //em.getTransaction().begin();
        EntityTransaction etx = em.getTransaction();

        System.out.println("begin");
        etx.begin();

        System.out.println("persist");
        em.persist(p);

        System.out.println("commit");
        //em.getTransaction().commit();
        etx.commit();

        System.out.println("close");
        em.close();
    }

    @Override
    public void modificar(UnitatFormativa p) {
        EM_Controller oem = new EM_Controller();
        EntityManager em = oem.getEntityManager();

        //em.getTransaction().begin();
        EntityTransaction etx = em.getTransaction();

        System.out.println("begin");
        etx.begin();

        System.out.println("merge");
        em.merge(p);

        System.out.println("commit");
        //em.getTransaction().commit();
        etx.commit();

        System.out.println("close");
        em.close();
    }

    @Override
    public void eliminar(UnitatFormativa p) {
        EM_Controller oem = new EM_Controller();
        EntityManager em = oem.getEntityManager();

        //em.getTransaction().begin();
        EntityTransaction etx = em.getTransaction();

        System.out.println("begin");
        etx.begin();

        System.out.println("remove");
        em.remove(em.contains(p) ? p : em.merge(p));

        System.out.println("commit");
        //em.getTransaction().commit();
        etx.commit();

        System.out.println("close");
        em.close();
    }

    public UnitatFormativa Buscar(Long id) {
        EntityManager em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");

        UnitatFormativa c = (UnitatFormativa) em.find(UnitatFormativa.class, id);

        System.out.println("close");
        em.close();

        return c;
    }

    public UnitatFormativa BuscarPerNom(String nom) {
        EntityManager em = new EM_Controller().getEntityManager();

        System.out.println("Busqueda per nom");
        Query query = em.createNamedQuery("cercaUnitatNom", UnitatFormativa.class);
        query.setParameter("nom", nom);
        UnitatFormativa c = (UnitatFormativa) query.getSingleResult();
        System.out.println("close");
        em.close();
        return c;
    }

    public void imprimirPersona(UnitatFormativa c) {
        System.out.println(c);
    }

}
