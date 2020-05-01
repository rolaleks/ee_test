package ru.geekbrains.servlet.route.repository;

import ru.geekbrains.servlet.route.record.Role;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class RoleRepository extends BaseRepository {


    public List<Role> findAll() {
        return entityManager.createQuery("from Role", Role.class).getResultList();
    }

    @Override
    public Object find(Integer id) {
        return entityManager.find(Role.class, id);
    }
}
