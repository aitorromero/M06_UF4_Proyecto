package controllers;

import DAO.CursDAO;
import elementos.Curs;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class Curs_Controller implements CursDAO {

    @Override
    public void insertar(Curs p) {
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
    public void modificar(Curs p) {
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
    public void eliminar(Curs p) {
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

    public Curs Buscar(Long id) {
        EntityManager em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");

        Curs c = (Curs) em.find(Curs.class, id);


        return c;
    }
    
    public void tancarEm(){
        EntityManager em = new EM_Controller().getEntityManager();
        
        System.out.println("close");
        em.close();
    }

    public Curs BuscarPerNom(String nom) {
        EntityManager em = new EM_Controller().getEntityManager();

        System.out.println("Busqueda per nom");
        Query query = em.createNamedQuery("cercaCursNom", Curs.class);
        query.setParameter("nom", nom);
        Curs c = (Curs) query.getSingleResult();
        System.out.println("close");
        em.close();
        return c;
    }

    @Override
    public Curs cercarPerId(Long id) {
        EntityManager em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        Query query = em.createNamedQuery(Curs.CURS_ID, Curs.class);
        query.setParameter("id", id);
        Curs c = (Curs) query.getSingleResult();

        return c;
    }

    @Override
    public List<Curs> cercarTot() {
        EntityManager em = new EM_Controller().getEntityManager();

        System.out.println("Consulta");
        Query a = em.createQuery("FROM Curs");
        List<Curs> lista = (List<Curs>) a.getResultList();
        return lista;
    }

}
