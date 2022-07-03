package com.github.Matseonzhek.restaurantrating.repository;

import com.github.Matseonzhek.restaurantrating.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {

    User save(User user);

    boolean delete(int id);

    User get(int id);

    List<User> getAll();

}
