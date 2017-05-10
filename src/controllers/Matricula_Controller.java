package controllers;

import DAO.MatriculaDAO;
import elementos.Alumne;
import elementos.Cicle;
import elementos.Curs;
import elementos.Familia;
import elementos.Matricula;
import elementos.UnitatFormativa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class Matricula_Controller implements MatriculaDAO {
    EntityManager em;

    @Override
    public void insertar(Matricula p) {
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
    public void modificar(Matricula p) {
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
    public void eliminar(Matricula p) {
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

    public Matricula Buscar(Long id) {
        EntityManager em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");

        Matricula c = (Matricula) em.find(Matricula.class, id);

        System.out.println("close");
        em.close();

        return c;
    }

    public Matricula BuscarPerNom(String nom) {
        EntityManager em = new EM_Controller().getEntityManager();

        System.out.println("Busqueda per nom");
        Query query = em.createNamedQuery("cercaMatriNom", Matricula.class);
        query.setParameter("nom", nom);
        Matricula c = (Matricula) query.getSingleResult();
        System.out.println("close");
        em.close();
        return c;
    }

    @Override
    public Matricula cercaAlumnePerUf(UnitatFormativa uf) {
return null;
    }

    @Override
    public Matricula cercaAlumnePerCurs(Curs curs) {
return null;
    }

    @Override
    public Matricula cercaAlumnePerCicle(Cicle cicle) {
return null;
    }

    @Override
    public Matricula cercaAlumnePerFamilia(Familia familia) {
        return null;
    }

    @Override
    public Matricula cercaAlumnePerNif(Long nif) {
        em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        Query query = em.createNamedQuery(Matricula.ALUMNE_PER_NIF, Matricula.class);
        query.setParameter("nif", nif);
        Matricula a = (Matricula) query.getSingleResult();

        return a;
    }

    @Override
    public List<Matricula> cercarTot() {
return null;
    }

    @Override
    public Matricula cercarPerId(int id) {
return null;
    }

}
