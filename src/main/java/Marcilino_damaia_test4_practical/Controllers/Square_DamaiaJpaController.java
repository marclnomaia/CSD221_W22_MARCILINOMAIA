/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Marcilino_damaia_test4_practical.Controllers;

import Marcilino_damaia_test4_practical.entities.Square_Damaia;
import Marcilino_damaia_test4_practical.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;

/**
 *
 * @author maron
 */
public class Square_DamaiaJpaController implements Serializable {

    public Square_DamaiaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Square_Damaia square_Damaia) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(square_Damaia);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Square_Damaia square_Damaia) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            square_Damaia = em.merge(square_Damaia);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = square_Damaia.getId();
                if (findSquare_Damaia(id) == null) {
                    throw new NonexistentEntityException("The square_Damaia with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Square_Damaia square_Damaia;
            try {
                square_Damaia = em.getReference(Square_Damaia.class, id);
                square_Damaia.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The square_Damaia with id " + id + " no longer exists.", enfe);
            }
            em.remove(square_Damaia);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Square_Damaia> findSquare_DamaiaEntities() {
        return findSquare_DamaiaEntities(true, -1, -1);
    }

    public List<Square_Damaia> findSquare_DamaiaEntities(int maxResults, int firstResult) {
        return findSquare_DamaiaEntities(false, maxResults, firstResult);
    }

    private List<Square_Damaia> findSquare_DamaiaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("select object(o) from Square_Damaia as o");
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Square_Damaia findSquare_Damaia(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Square_Damaia.class, id);
        } finally {
            em.close();
        }
    }

    public int getSquare_DamaiaCount() {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("select count(o) from Square_Damaia as o");
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    public void setTheLength(double input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setWidth(double input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
