/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konrad.edu.jpa.dao;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import konrad.edu.jpa.modelo.Persona;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import konrad.edu.jpa.dao.exceptions.NonexistentEntityException;
import konrad.edu.jpa.dao.exceptions.PreexistingEntityException;
import konrad.edu.jpa.modelo.TipoDocumento;

/**
 *
 * @author LENOVO
 */
public class TipoDocumentoJpaController implements Serializable {

    public TipoDocumentoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TipoDocumento tipoDocumento) throws PreexistingEntityException, Exception {
        if (tipoDocumento.getPersonaCollection() == null) {
            tipoDocumento.setPersonaCollection(new ArrayList<Persona>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Collection<Persona> attachedPersonaCollection = new ArrayList<Persona>();
            for (Persona personaCollectionPersonaToAttach : tipoDocumento.getPersonaCollection()) {
                personaCollectionPersonaToAttach = em.getReference(personaCollectionPersonaToAttach.getClass(), personaCollectionPersonaToAttach.getId());
                attachedPersonaCollection.add(personaCollectionPersonaToAttach);
            }
            tipoDocumento.setPersonaCollection(attachedPersonaCollection);
            em.persist(tipoDocumento);
            for (Persona personaCollectionPersona : tipoDocumento.getPersonaCollection()) {
                TipoDocumento oldTipoDocumentoOfPersonaCollectionPersona = personaCollectionPersona.getTipoDocumento();
                personaCollectionPersona.setTipoDocumento(tipoDocumento);
                personaCollectionPersona = em.merge(personaCollectionPersona);
                if (oldTipoDocumentoOfPersonaCollectionPersona != null) {
                    oldTipoDocumentoOfPersonaCollectionPersona.getPersonaCollection().remove(personaCollectionPersona);
                    oldTipoDocumentoOfPersonaCollectionPersona = em.merge(oldTipoDocumentoOfPersonaCollectionPersona);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findTipoDocumento(tipoDocumento.getId()) != null) {
                throw new PreexistingEntityException("TipoDocumento " + tipoDocumento + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TipoDocumento tipoDocumento) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TipoDocumento persistentTipoDocumento = em.find(TipoDocumento.class, tipoDocumento.getId());
            Collection<Persona> personaCollectionOld = persistentTipoDocumento.getPersonaCollection();
            Collection<Persona> personaCollectionNew = tipoDocumento.getPersonaCollection();
            Collection<Persona> attachedPersonaCollectionNew = new ArrayList<Persona>();
            for (Persona personaCollectionNewPersonaToAttach : personaCollectionNew) {
                personaCollectionNewPersonaToAttach = em.getReference(personaCollectionNewPersonaToAttach.getClass(), personaCollectionNewPersonaToAttach.getId());
                attachedPersonaCollectionNew.add(personaCollectionNewPersonaToAttach);
            }
            personaCollectionNew = attachedPersonaCollectionNew;
            tipoDocumento.setPersonaCollection(personaCollectionNew);
            tipoDocumento = em.merge(tipoDocumento);
            for (Persona personaCollectionOldPersona : personaCollectionOld) {
                if (!personaCollectionNew.contains(personaCollectionOldPersona)) {
                    personaCollectionOldPersona.setTipoDocumento(null);
                    personaCollectionOldPersona = em.merge(personaCollectionOldPersona);
                }
            }
            for (Persona personaCollectionNewPersona : personaCollectionNew) {
                if (!personaCollectionOld.contains(personaCollectionNewPersona)) {
                    TipoDocumento oldTipoDocumentoOfPersonaCollectionNewPersona = personaCollectionNewPersona.getTipoDocumento();
                    personaCollectionNewPersona.setTipoDocumento(tipoDocumento);
                    personaCollectionNewPersona = em.merge(personaCollectionNewPersona);
                    if (oldTipoDocumentoOfPersonaCollectionNewPersona != null && !oldTipoDocumentoOfPersonaCollectionNewPersona.equals(tipoDocumento)) {
                        oldTipoDocumentoOfPersonaCollectionNewPersona.getPersonaCollection().remove(personaCollectionNewPersona);
                        oldTipoDocumentoOfPersonaCollectionNewPersona = em.merge(oldTipoDocumentoOfPersonaCollectionNewPersona);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = tipoDocumento.getId();
                if (findTipoDocumento(id) == null) {
                    throw new NonexistentEntityException("The tipoDocumento with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TipoDocumento tipoDocumento;
            try {
                tipoDocumento = em.getReference(TipoDocumento.class, id);
                tipoDocumento.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tipoDocumento with id " + id + " no longer exists.", enfe);
            }
            Collection<Persona> personaCollection = tipoDocumento.getPersonaCollection();
            for (Persona personaCollectionPersona : personaCollection) {
                personaCollectionPersona.setTipoDocumento(null);
                personaCollectionPersona = em.merge(personaCollectionPersona);
            }
            em.remove(tipoDocumento);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TipoDocumento> findTipoDocumentoEntities() {
        return findTipoDocumentoEntities(true, -1, -1);
    }

    public List<TipoDocumento> findTipoDocumentoEntities(int maxResults, int firstResult) {
        return findTipoDocumentoEntities(false, maxResults, firstResult);
    }

    private List<TipoDocumento> findTipoDocumentoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TipoDocumento.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public TipoDocumento findTipoDocumento(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TipoDocumento.class, id);
        } finally {
            em.close();
        }
    }

    public int getTipoDocumentoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TipoDocumento> rt = cq.from(TipoDocumento.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
