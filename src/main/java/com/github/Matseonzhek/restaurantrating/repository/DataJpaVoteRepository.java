package com.github.Matseonzhek.restaurantrating.repository;

import com.github.Matseonzhek.restaurantrating.model.VoteBoard;

import java.util.List;

public class DataJpaVoteRepository implements VoteBoardRepository{


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
