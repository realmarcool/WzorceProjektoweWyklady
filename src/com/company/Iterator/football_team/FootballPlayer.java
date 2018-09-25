package com.company.Iterator.football_team;

public class FootballPlayer {
    private String name;
    private String lastName;
    private FootballPlayerPosition position;

    public FootballPlayer(String name, String lastName, FootballPlayerPosition position) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public FootballPlayerPosition getPosition() {
        return position;
    }

    public void setPosition(FootballPlayerPosition position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position=" + position +
                '}';
    }
}