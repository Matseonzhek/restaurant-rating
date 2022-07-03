package com.github.Matseonzhek.restaurantrating.repository;

import com.github.Matseonzhek.restaurantrating.model.VoteBoard;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaVoteBoardRepository implements VoteBoardRepository {

    public DataJpaVoteBoardRepository() {    }

    @Override
    public VoteBoard save(VoteBoard voteBoard, int userId) {
        return null;
    }

    @Override
    public boolean delete(int id, int userId) {
        return false;
    }

    @Override
    public List<VoteBoard> getAll() {
        return null;
    }

    @Override
    public VoteBoard update(VoteBoard voteBoard, int userId) {
        return null;
    }


}
