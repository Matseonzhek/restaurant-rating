package com.github.Matseonzhek.restaurantrating.repository;

import com.github.Matseonzhek.restaurantrating.model.VoteBoard;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface VoteBoardRepository {

    VoteBoard save(VoteBoard voteBoard, int userId);

    boolean delete(int id, int userId);

    List<VoteBoard> getAll();

    VoteBoard update (VoteBoard voteBoard, int userId);

}
