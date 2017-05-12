package controllers;

import DAO.FamiliaDAO;
import elementos.Familia;
import elementos.Modul;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class Familia_Controller implements FamiliaDAO {

    @Override
    public void insertar(Familia p) {
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
    public void modificar(Familia p) {
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

    }

    @Override
    public void eliminar(Familia p) {
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

    public Familia Buscar(Long id) {
        EntityManager em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");

        Familia c = (Familia) em.find(Familia.class, id);

     
        return c;
    }

    public Modul BuscarPerNom(String nom) {
        EntityManager em = new EM_Controller().getEntityManager();

        System.out.println("Busqueda per nom");
        Query query = em.createNamedQuery("cercaModulNom", Modul.class);
        query.setParameter("nom", nom);
        Modul c = (Modul) query.getSingleResult();
        System.out.println("close");
        em.close();
        return c;
    }
    
    public void tancarEM(){
        EntityManager em = new EM_Controller().getEntityManager();

           System.out.println("close");
        
        em.close();
    }

    @Override
    public Familia cercarPerId(int id) {
        EntityManager em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        Query query = em.createNamedQuery(Familia.FAMILIA_ID, Familia.class);
        query.setParameter("id", id);
        Familia c = (Familia) query.getSingleResult();

        return c;
    }

    @Override
    public List<Familia> cercarTot() {
        EntityManager em = new EM_Controller().getEntityManager();

        System.out.println("Consulta");
        Query a = em.createQuery("FROM Familia");
        List<Familia> lista = (List<Familia>) a.getResultList();
        return lista;
    }

}
