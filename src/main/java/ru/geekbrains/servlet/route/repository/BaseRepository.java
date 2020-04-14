package ru.geekbrains.servlet.route.repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

public abstract class BaseRepository {

    @PersistenceContext(unitName = "ds")
    protected EntityManager entityManager;

    @Transactional
    public void insert(Object o) {
        entityManager.persist(o);
    }

    @Transactional
    public void update(Object o) {
        entityManager.merge(o);
    }

    @Transactional
    public void delete(Integer id) {
        Object o = this.find(id);
        if (o != null) {
            entityManager.remove(o);
        }
    }

    @Transactional
    public void delete(Object o) {
        entityManager.remove(o);
    }

    public abstract Object find(Integer id);
}
