/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Marcilino_damaia_test4_practical.Controllers;

import Marcilino_damaia_test4_practical.entities.Shape_Damaia;
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
public class Shape_DamaiaJpaController implements Serializable {

    public Shape_DamaiaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Shape_Damaia shape_Damaia) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(shape_Damaia);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Shape_Damaia shape_Damaia) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            shape_Damaia = em.merge(shape_Damaia);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = shape_Damaia.getId();
                if (findShape_Damaia(id) == null) {
                    throw new NonexistentEntityException("The shape_Damaia with id " + id + " no longer exists.");
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
            Shape_Damaia shape_Damaia;
            try {
                shape_Damaia = em.getReference(Shape_Damaia.class, id);
                shape_Damaia.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The shape_Damaia with id " + id + " no longer exists.", enfe);
            }
            em.remove(shape_Damaia);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Shape_Damaia> findShape_DamaiaEntities() {
        return findShape_DamaiaEntities(true, -1, -1);
    }

    public List<Shape_Damaia> findShape_DamaiaEntities(int maxResults, int firstResult) {
        return findShape_DamaiaEntities(false, maxResults, firstResult);
    }

    private List<Shape_Damaia> findShape_DamaiaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("select object(o) from Shape_Damaia as o");
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Shape_Damaia findShape_Damaia(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Shape_Damaia.class, id);
        } finally {
            em.close();
        }
    }

    public int getShape_DamaiaCount() {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("select count(o) from Shape_Damaia as o");
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
