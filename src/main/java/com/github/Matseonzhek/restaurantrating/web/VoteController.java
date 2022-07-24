package com.github.Matseonzhek.restaurantrating.web;

import com.github.Matseonzhek.restaurantrating.model.VoteBoard;
import com.github.Matseonzhek.restaurantrating.repository.DataJpaVoteBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping(value = "rest/vote-board", produces = MediaType.APPLICATION_JSON_VALUE)
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
//
//    public void update(VoteBoard voteBoard, int voteId) {
//        if (voteBoard.getId() == voteId) {
////            voteBoardRepository.save(voteBoard, USER);
//        } else throw new IllegalArgumentException(voteBoard + "must be with id = " + voteId);
//    }

//    public VoteBoard create(VoteBoard voteBoard) {
//        return voteBoardRepository.save(voteBoard, USER);
//    }

    @GetMapping
    public List<VoteBoard> getAll() {
        return dataJpaVoteBoardRepository.getAll();
    }
}
