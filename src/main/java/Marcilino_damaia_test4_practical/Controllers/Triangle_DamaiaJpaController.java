/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Marcilino_damaia_test4_practical.Controllers;

import Marcilino_damaia_test4_practical.entities.Triangle_Damaia;
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
public class Triangle_DamaiaJpaController implements Serializable {

    public Triangle_DamaiaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Triangle_Damaia triangle_Damaia) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(triangle_Damaia);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Triangle_Damaia triangle_Damaia) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            triangle_Damaia = em.merge(triangle_Damaia);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = triangle_Damaia.getId();
                if (findTriangle_Damaia(id) == null) {
                    throw new NonexistentEntityException("The triangle_Damaia with id " + id + " no longer exists.");
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
            Triangle_Damaia triangle_Damaia;
            try {
                triangle_Damaia = em.getReference(Triangle_Damaia.class, id);
                triangle_Damaia.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The triangle_Damaia with id " + id + " no longer exists.", enfe);
            }
            em.remove(triangle_Damaia);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Triangle_Damaia> findTriangle_DamaiaEntities() {
        return findTriangle_DamaiaEntities(true, -1, -1);
    }

    public List<Triangle_Damaia> findTriangle_DamaiaEntities(int maxResults, int firstResult) {
        return findTriangle_DamaiaEntities(false, maxResults, firstResult);
    }

    private List<Triangle_Damaia> findTriangle_DamaiaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("select object(o) from Triangle_Damaia as o");
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Triangle_Damaia findTriangle_Damaia(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Triangle_Damaia.class, id);
        } finally {
            em.close();
        }
    }

    public int getTriangle_DamaiaCount() {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("select count(o) from Triangle_Damaia as o");
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    public void setBase(double input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setHeight(double input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
