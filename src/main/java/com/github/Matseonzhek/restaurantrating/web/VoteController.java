package com.github.Matseonzhek.restaurantrating.web;

import com.github.Matseonzhek.restaurantrating.model.VoteBoard;
import com.github.Matseonzhek.restaurantrating.repository.VoteBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public  class VoteController {

    private final int USER = 10001;

    @Autowired
    private final VoteBoardRepository voteBoardRepository;


    public VoteController(VoteBoardRepository voteBoardRepository) {
        this.voteBoardRepository = voteBoardRepository;
    }

//    public void delete(int id) {
//        voteBoardRepository.delete(id, USER);
//    }

    public void update(VoteBoard voteBoard, int voteId) {
        if (voteBoard.getId() == voteId) {
//            voteBoardRepository.save(voteBoard, USER);
        } else throw new IllegalArgumentException(voteBoard + "must be with id = " + voteId);
    }

//    public VoteBoard create(VoteBoard voteBoard) {
//        return voteBoardRepository.save(voteBoard, USER);
//    }

//    public List<VoteBoard> getAll() {
//        return voteBoardRepository.getAll();
//    }
}
