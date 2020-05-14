package com.sarracent.data.jpa.models.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ClienteDaoImpl implements IClienteDao {
    @PersistenceContext
    private EntityManager em;

    @Transactional(readOnly = true)
    @Override
    public List findAll() {
        return em.createQuery("from Cliente").getResultList();
    }
}
