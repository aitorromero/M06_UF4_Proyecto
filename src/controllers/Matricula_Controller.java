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
/*
    @Override
    public Matricula cercaMatriculaPerNif(Long nif) {
        em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        Query query = em.createNamedQuery(Matricula.ALUMNE_PER_NIF, Matricula.class);
        query.setParameter("nif", nif);
        Matricula a = (Matricula) query.getSingleResult();

        return a;
    }

    @Override
    public List<Matricula> cercarTot() {
        EntityManager em = new EM_Controller().getEntityManager();

        System.out.println("Consulta");
        Query a = em.createQuery("FROM Matricula");
        List<Matricula> lista = (List<Matricula>) a.getResultList();
        return lista;
    }

    @Override
    public Matricula cercarPerId(int id) {
        EntityManager em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        Query query = em.createNamedQuery(Matricula.ALUMNE_PER_ID, Matricula.class);
        query.setParameter("id", id);
        Matricula c = (Matricula) query.getSingleResult();

        return c;
    }

    @Override
    public List<Alumne> cercaAlumnePerUf(UnitatFormativa uf) {
        em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        Query query = em.createNamedQuery(Matricula.ALUMNE_PER_UF, Matricula.class);
        query.setParameter("uf", uf);
        List<Alumne> lista = (List<Alumne>) query.getResultList();
        return lista;
    }

    @Override
    public List<Alumne> cercaAlumnePerCurs(Curs curs) {
        em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        Query query = em.createNamedQuery(Matricula.ALUMNE_PER_CURS, Matricula.class);
        query.setParameter("curs", curs);
        List<Alumne> lista = (List<Alumne>) query.getResultList();
        return lista;
    }

    @Override
    public List<Alumne> cercaAlumnePerCicle(Cicle cicle) {
        em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        Query query = em.createNamedQuery(Matricula.ALUMNE_PER_CICLE, Matricula.class);
        query.setParameter("cicle", cicle);
        List<Alumne> lista = (List<Alumne>) query.getResultList();
        return lista;
    }

    @Override
    public List<Alumne> cercaAlumnePerFamilia(Familia familia) {
        em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        Query query = em.createNamedQuery(Matricula.ALUMNE_PER_FAMILIA, Matricula.class);
        query.setParameter("familia", familia);
        List<Alumne> lista = (List<Alumne>) query.getResultList();
        return lista;
    }
*/

    @Override
    public List<Alumne> cercaAlumnePerUf(UnitatFormativa uf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Alumne> cercaAlumnePerCurs(Curs curs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Alumne> cercaAlumnePerCicle(Cicle cicle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Alumne> cercaAlumnePerFamilia(Familia familia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Matricula cercaMatriculaPerNif(Long nif) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Matricula> cercarTot() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Matricula cercarPerId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
