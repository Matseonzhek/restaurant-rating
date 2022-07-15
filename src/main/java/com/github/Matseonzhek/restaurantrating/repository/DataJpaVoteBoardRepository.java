package com.github.Matseonzhek.restaurantrating.repository;

import com.github.Matseonzhek.restaurantrating.model.VoteBoard;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class DataJpaVoteBoardRepository {

    private final VoteBoardRepository voteBoardRepository;
    private final UserRepository userRepository;

    public DataJpaVoteBoardRepository(VoteBoardRepository voteBoardRepository, UserRepository userRepository) {
        this.voteBoardRepository = voteBoardRepository;
        this.userRepository = userRepository;
    }

    public boolean delete(int id) {
        return voteBoardRepository.delete(id) != 0;
    }

    @Transactional
    public VoteBoard save(VoteBoard newVoteRecord) {
        return voteBoardRepository.save(newVoteRecord);
    }

    public List<VoteBoard> getAll (){ return voteBoardRepository.findAll(Sort.by("dateTimeOfVote"));}

}
