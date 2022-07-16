package com.github.Matseonzhek.restaurantrating.web;

import com.github.Matseonzhek.restaurantrating.model.VoteBoard;
import com.github.Matseonzhek.restaurantrating.repository.DataJpaVoteBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public  class VoteController {

    private final int USER = 10001;

    @Autowired
    private final DataJpaVoteBoardRepository dataJpaVoteBoardRepository;

    public VoteController(DataJpaVoteBoardRepository dataJpaVoteBoardRepository) {
        this.dataJpaVoteBoardRepository = dataJpaVoteBoardRepository;
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

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<VoteBoard> getAll() {
        return dataJpaVoteBoardRepository.getAll();
    }
}
