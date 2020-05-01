package ru.geekbrains.servlet.route.repository;

import ru.geekbrains.servlet.route.record.User;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;
import java.util.List;

@Stateless
public class UserRepository extends BaseRepository {

    @Override
    public User find(Integer id) {
        return entityManager.find(User.class, id);
    }

    @TransactionAttribute
    public List<User> findAll() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<User> query = cb.createQuery(User.class);
        Root<User> from = query.from(User.class);
        from.fetch("roles", JoinType.LEFT);
        query.select(from).distinct(true);
        return entityManager.createQuery(query).getResultList();
    }

}
