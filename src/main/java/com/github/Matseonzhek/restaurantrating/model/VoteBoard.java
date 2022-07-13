package com.github.Matseonzhek.restaurantrating.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "VOTE_BOARD")
public class VoteBoard extends AbstractBaseEntity {

    @Column(name = "restaurant", nullable = false)
    @NotNull
    private String restaurantName;
    @Column(name = "dish", nullable = false)
    @NotNull
    private String dishName;
    @Column(name = "dish_price", nullable = false)
    @NotNull
    private Long dishPrice;
    @Column(name = "date_time", nullable = false)
    @NotNull
    private LocalDateTime dateTimeOfVote;

    @Column(name = "vote", nullable = false)
    @NotNull
    private boolean vote = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @NotNull
    private User user;

    public VoteBoard() {
    }

    public VoteBoard(String restaurantName, String dishName, Long dishPrice,
                     LocalDateTime dateTimeOfVote, boolean vote) {
        this.restaurantName = restaurantName;
        this.dishName = dishName;
        this.dishPrice = dishPrice;
        this.dateTimeOfVote = dateTimeOfVote;
        this.vote = vote;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public Long getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(Long dishPrice) {
        this.dishPrice = dishPrice;
    }

    public LocalDateTime getDateTimeOfVote() {
        return dateTimeOfVote;
    }

    public void setDateTimeOfVote(LocalDateTime dateOfVote) {
        this.dateTimeOfVote = dateOfVote;
    }

    public boolean isVote() {
        return vote;
    }

    public void setVote(boolean vote) {
        this.vote = vote;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "VoteBoard{" +
                "id=" + id +
                ", restaurantName='" + restaurantName + '\'' +
                ", dishName='" + dishName + '\'' +
                ", dishPrice=" + dishPrice +
                ", date and time of vote=" + dateTimeOfVote +
                ", vote=" + vote +
                ", user=" + user +
                '}';
    }
}
