package com.company.Prototyp.football_team;


public class FootballMatch {

    public static void main(String[] args) throws CloneNotSupportedException {
        FootballPlayer footballPlayer = new FootballPlayer(
                "Piotr", "Brzozowski", 28, "Obronca");
        FootballPlayer footballPlayer1 = (FootballPlayer) footballPlayer.clone();
        System.out.println(footballPlayer);
        System.out.println(footballPlayer1);
        footballPlayer1.setName("Andrzej");
        System.out.println(footballPlayer);
        System.out.println(footballPlayer1);
    }
}
