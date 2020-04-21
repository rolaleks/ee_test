package ru.geekbrains.servlet.route.repository;


import javax.ejb.TransactionAttribute;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

public abstract class BaseRepository {

    @PersistenceContext(unitName = "ds")
    protected EntityManager entityManager;

    @TransactionAttribute
    public void insert(Object o) {
        entityManager.persist(o);
    }

    @TransactionAttribute
    public void update(Object o) {
        entityManager.merge(o);
    }

    @TransactionAttribute
    public void delete(Integer id) {
        Object o = this.find(id);
        if (o != null) {
            entityManager.remove(o);
        }
    }

    @TransactionAttribute
    public void delete(Object o) {
        entityManager.remove(o);
    }

    public abstract Object find(Integer id);
}
