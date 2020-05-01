package ru.geekbrains.servlet.route.service;

import ru.geekbrains.servlet.route.record.User;
import ru.geekbrains.servlet.route.repository.UserRepository;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class UserService {

    @EJB
    private UserRepository userRepository;

    @TransactionAttribute
    public void update(UserRepr user) {
        User u = new User(user);
        userRepository.update(u);
        user.setId(u.getId());
    }

    @TransactionAttribute
    public void delete(int id) {
        userRepository.delete(id);
    }

    @TransactionAttribute
    public UserRepr find(int id) {
        return new UserRepr(userRepository.find(id));
    }

    @TransactionAttribute
    public List<UserRepr> findAll() {
        return userRepository.findAll().stream()
                .map(UserRepr::new)
                .collect(Collectors.toList());
    }

}
