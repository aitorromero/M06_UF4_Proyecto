package controllers;

import DAO.AlumneDAO;
import elementos.Alumne;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class Alumne_Controller implements AlumneDAO {

    EntityManager em;

    @Override
    public void insertar(Alumne p) {
        EM_Controller oem = new EM_Controller();
        em = oem.getEntityManager();

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
        em = oem.getEntityManager();

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
        em = oem.getEntityManager();

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
        em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");

        Alumne c = (Alumne) em.find(Alumne.class, id);

        System.out.println("close");
        em.close();

        return c;
    }

    public Alumne BuscarPerNom(String nom) {
        em = new EM_Controller().getEntityManager();

        System.out.println("Busqueda per nom");
        Query query = em.createNamedQuery("cercaClientNom", Alumne.class);
        query.setParameter("nom", nom);
        Alumne c = (Alumne) query.getSingleResult();
        System.out.println("close");
        em.close();
        return c;
    }


    @Override
    public Alumne cercarPerId(Long id) {
        em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        Query query = em.createNamedQuery(Alumne.ID_ALUMNE, Alumne.class);
        query.setParameter("id", id);
        Alumne a = (Alumne) query.getSingleResult();
        System.out.println("close");
        em.close();        
        return a;
    }

    @Override
    public List<Alumne> cercaAlumnePerNom(String nom) {
        em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        Query query = em.createNamedQuery(Alumne.NOM_ALUMNE, Alumne.class);
        query.setParameter("nom", nom);
        List<Alumne> lista = (List<Alumne>) query.getResultList();
        return lista;
    }

    @Override
    public List<Alumne> cercaAlumnePerCognom(String cognom) {
        em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        Query query = em.createNamedQuery(Alumne.COGNOM_ALUMNE, Alumne.class);
        query.setParameter("cognom", cognom);
        List<Alumne> lista = (List<Alumne>) query.getResultList();
        System.out.println("close");
        em.close();
        return lista;
    }

    @Override
    public List<Alumne> cercarTot() {
        em = new EM_Controller().getEntityManager();

        System.out.println("Consulta");
        Query a = em.createQuery("FROM Alumne");
        List<Alumne> lista = (List<Alumne>) a.getResultList();
        System.out.println("close");
        em.close();        
        return lista;
    }

    @Override
    public Alumne cercarPerNif(Long nif) {
        em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        Query query = em.createNamedQuery(Alumne.NIF_ALUMNE, Alumne.class);
        query.setParameter("nif", nif);
        Alumne a = (Alumne) query.getSingleResult();
        System.out.println("close");
        em.close();        
        return a;
    }

}
