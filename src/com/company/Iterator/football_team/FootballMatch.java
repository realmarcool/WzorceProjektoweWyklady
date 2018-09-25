package com.company.Iterator.football_team;

public class FootballMatch {

    public static void main(String[] args) {
        FootballTeam footballTeam = new FootballTeam();
        FootballPlayer footballPlayer = new FootballPlayer("Cristiano", "Ronaldo", FootballPlayerPosition.ATTACKER);
        FootballPlayer footballPlayer1 = new FootballPlayer("Kamil", "Glik", FootballPlayerPosition.DEFENDER);
        footballTeam.addFootballPlayer(footballPlayer);
        footballTeam.addFootballPlayer(footballPlayer1);
        Iterator iterator = footballTeam.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}