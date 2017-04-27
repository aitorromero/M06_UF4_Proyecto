package controllers;

import DAO.AlumneDAO;
import elementos.Alumne;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class Alumne_Controller implements AlumneDAO {

    @Override
    public void insertar(Alumne p) {
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
    public void modificar(Alumne p) {
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
    public void eliminar(Alumne p) {
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

    public Alumne Buscar(Long id) {
        EntityManager em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");

        Alumne c = (Alumne) em.find(Alumne.class, id);

        System.out.println("close");
        em.close();

        return c;
    }

    public Alumne BuscarPerNom(String nom) {
        EntityManager em = new EM_Controller().getEntityManager();

        System.out.println("Busqueda per nom");
        Query query = em.createNamedQuery("cercaClientNom", Alumne.class);
        query.setParameter("nom", nom);
        Alumne c = (Alumne) query.getSingleResult();
        System.out.println("close");
        em.close();
        return c;
    }

    public void imprimirPersona(Alumne c) {
        System.out.println(c);
    }

    @Override
    public void cercaAlumnePerNom(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cercaAlumnePerCognom(String cognom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cercarAlumnes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
