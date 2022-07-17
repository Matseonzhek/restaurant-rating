package com.github.Matseonzhek.restaurantrating.web;

import com.github.Matseonzhek.restaurantrating.model.VoteBoard;
import com.github.Matseonzhek.restaurantrating.repository.DataJpaVoteBoardRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController
@Api (value = "Vote BoardController")
public class VoteController {

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
    @GetMapping("/")
    @ApiOperation(value = "Get all records of Vote Board")
    public List<VoteBoard> getAll() {
        return dataJpaVoteBoardRepository.getAll();
    }
}
