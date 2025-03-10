package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.models.Role;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;
import java.util.Set;

public interface UserService {
    List<User> getAllUsers();

    User findById(Long id);

    void addUser(User user, Set<Role> roles);

    void deleteUser(long id);

    void updateUser(User user, Set<Role> roles);

    User findByUsername(String username);
}