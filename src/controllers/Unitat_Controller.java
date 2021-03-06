package controllers;

import DAO.UnitatFormativaDAO;
import elementos.Curs;
import elementos.Modul;
import elementos.UnitatFormativa;
import java.util.List;
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

    @Override
    public UnitatFormativa cercarPerId(Long id) {
        EntityManager em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        Query query = em.createNamedQuery(UnitatFormativa.UNITATFORMATIVA_ID, UnitatFormativa.class);
        query.setParameter("id", id);
        UnitatFormativa c = (UnitatFormativa) query.getSingleResult();

        return c;    
    }

    @Override
    public List<UnitatFormativa> cercarTot() {
        EntityManager em = new EM_Controller().getEntityManager();

        System.out.println("Consulta");
        Query a = em.createQuery("FROM UnitatFormativa");
        List<UnitatFormativa> lista = (List<UnitatFormativa>) a.getResultList();
        return lista;
    }

    /**
     * Metodo que mediante la query de UnitatFormativa busca una unitat formativa
     * en base a un curso que obtiene por parametro
     * @param curs
     * @return 
     */
    @Override
    public List<UnitatFormativa> cercaUfPerCurs(Curs curs) {
        
        EntityManager em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        Query query = em.createNamedQuery(UnitatFormativa.UNITATFORMATIVA_CURSID, UnitatFormativa.class);
        
        query.setParameter("curs", curs);
        
        List<UnitatFormativa> ufs = query.getResultList();
        
        
        System.out.println("close");
        System.out.println("funka");
        em.close();
        
        return ufs;
    }


}
