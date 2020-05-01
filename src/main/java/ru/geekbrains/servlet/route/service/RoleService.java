package ru.geekbrains.servlet.route.service;

import ru.geekbrains.servlet.route.repository.RoleRepository;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class RoleService implements Serializable {

    @Inject
    private RoleRepository roleRepository;

    @TransactionAttribute
    public List<RoleRepr> findAll() {
        return roleRepository.findAll().stream()
                .map(RoleRepr::new)
                .collect(Collectors.toList());
    }
}
