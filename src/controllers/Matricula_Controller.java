package controllers;

import DAO.MatriculaDAO;
import elementos.Alumne;
import elementos.Matricula;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class Matricula_Controller implements MatriculaDAO {

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

    public void imprimirPersona(Matricula c) {
        System.out.println(c);
    }

    @Override
    public void cercaAlumnePerUf(Alumne a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cercaAlumnePerCurs(Alumne a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cercaAlumnePerCicle(Alumne a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cercaAlumnePerFamilia(Alumne a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cercaMatriculaPerNif(Long nif) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cercaMatricules() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
