package com.github.Matseonzhek.restaurantrating.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class VoteBoard extends AbstractBaseEntity {

    private String restaurantName;
    private String dishName;
    private Long dishPrice;
    private LocalDate dateOfVote;
    private LocalTime timeOfVote;
    private boolean vote = false;
    private User user;

    public VoteBoard() {
    }

    public VoteBoard(String restaurantName, String dishName, Long dishPrice,
                     LocalDate dateOfVote, LocalTime timeOfVote, boolean vote) {
        this.restaurantName = restaurantName;
        this.dishName = dishName;
        this.dishPrice = dishPrice;
        this.dateOfVote = dateOfVote;
        this.timeOfVote = timeOfVote;
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

    public LocalDate getDateOfVote() {
        return dateOfVote;
    }

    public void setDateOfVote(LocalDate dateOfVote) {
        this.dateOfVote = dateOfVote;
    }

    public LocalTime getTimeOfVote() {
        return timeOfVote;
    }

    public void setTimeOfVote(LocalTime timeOfVote) {
        this.timeOfVote = timeOfVote;
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
                ", dateOfVote=" + dateOfVote +
                ", timeOfVote=" + timeOfVote +
                ", vote=" + vote +
                ", user=" + user +
                '}';
    }
}
