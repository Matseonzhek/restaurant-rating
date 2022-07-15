package com.github.Matseonzhek.restaurantrating.repository;


import com.github.Matseonzhek.restaurantrating.model.User;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaUserRepository {

    private final UserRepository userRepository;

    public DataJpaUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public boolean delete(int id) {
        return userRepository.delete(id) != 0;
    }

    public User get(int id) {
        return userRepository.getById(id);
    }

    public List<User> getAll() {
        return userRepository.findAll(Sort.by("email"));
    }
}
