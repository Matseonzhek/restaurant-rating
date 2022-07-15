package com.github.Matseonzhek.restaurantrating.repository;

import com.github.Matseonzhek.restaurantrating.model.VoteBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


public interface VoteBoardRepository extends JpaRepository<VoteBoard, Integer> {
    @Modifying
    @Transactional
    @Query("DELETE FROM VoteBoard v where v.id=:id")
    int delete(@Param("id") int id);

}
