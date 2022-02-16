package com.github.Matseonzhek.restaurantrating.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class VoteBoard extends AbstractBaseEntity {

    private Restaurant restaurant;
    private LocalDate dateOfVote;
    private LocalTime timeOfVote;
    private boolean vote = false;
    private User user;

    public VoteBoard() {
    }

    public VoteBoard(Restaurant restaurant, LocalDate dateOfVote, LocalTime timeOfVote, boolean vote, User user) {
        this.restaurant = restaurant;
        this.dateOfVote = dateOfVote;
        this.timeOfVote = timeOfVote;
        this.vote = vote;
        this.user = user;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
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
                ", restaurant=" + restaurant +
                ", dateOfVote=" + dateOfVote +
                ", timeOfVote=" + timeOfVote +
                ", vote=" + vote +
                ", user=" + user +
                '}';
    }
}
