package com.example.demojavaee;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User findById(Long id);
    User save(User user);
    void deleteById(Long id);
}
