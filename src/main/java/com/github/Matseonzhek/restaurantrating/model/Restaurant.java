package com.github.Matseonzhek.restaurantrating.model;

public class Restaurant extends AbstractNamedEntity {

    private User user;

    public Restaurant() {
    }

    public Restaurant(Integer id, String name, User user) {
        super(id, name);
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Restaurant{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
