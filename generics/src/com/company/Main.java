package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> soccerTeam = new Team<>("Real Madrid");
        soccerTeam.addPlayer(beckham);

        Team<SoccerPlayer> soccerTeam2 = new Team<>("Barcelona");

//        soccerTeam.matchResult(baseballTeam, 5, 1);

        soccerTeam.matchResult(soccerTeam2, 5, 1);
        System.out.println(soccerTeam.ranking());
    }

}
