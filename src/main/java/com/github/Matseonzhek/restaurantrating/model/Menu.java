package com.github.Matseonzhek.restaurantrating.model;

import sun.util.resources.LocaleData;

public class Menu extends AbstractBaseEntity {

    private LocaleData date;
    private String dish;
    private double price;

    private Restaurant restaurant;
    private User user;

    public Menu() {
    }

    public Menu(LocaleData date, String dish, double price, Restaurant restaurant, User user) {
        this.date = date;
        this.dish = dish;
        this.price = price;
        this.restaurant = restaurant;
        this.user = user;
    }

    public LocaleData getDate() {
        return date;
    }

    public void setDate(LocaleData date) {
        this.date = date;
    }

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", date=" + date +
                ", dish='" + dish + '\'' +
                ", price=" + price +
                ", restaurant=" + restaurant +
                '}';
    }
}
