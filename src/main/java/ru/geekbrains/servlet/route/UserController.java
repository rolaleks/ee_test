package ru.geekbrains.servlet.route;

import ru.geekbrains.servlet.route.service.RoleRepr;
import ru.geekbrains.servlet.route.service.RoleService;
import ru.geekbrains.servlet.route.service.UserRepr;
import ru.geekbrains.servlet.route.service.UserService;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@SessionScoped
@Named
public class UserController implements Serializable {

    @EJB
    private UserService userService;

    @Inject
    private RoleService roleRepository;

    private UserRepr user;

    private List<RoleRepr> roles;

    private List<UserRepr> users;

    public void preLoad() {
        this.roles = roleRepository.findAll();
        this.users = userService.findAll();
    }

    public UserRepr getUser() {
        return user;
    }

    public void setUser(UserRepr user) {
        this.user = user;
    }

    public List<UserRepr> getAllUsers() {
        return users;
    }

    public String editUser(UserRepr user) {
        this.user = user;
        return "/admin/user.xhtml?faces-redirect=true";
    }

    public void deleteUser(UserRepr user) {
        userService.delete(user.getId());
    }

    public String createUser() {
        this.user = new UserRepr();
        return "/admin/user.xhtml?faces-redirect=true";
    }

    public String saveUser() {
        userService.update(this.user);
        return "/admin/users.xhtml?faces-redirect=true";
    }

    public List<RoleRepr> getAllRoles() {
        return roles;
    }
}
