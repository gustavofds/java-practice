package com.company;

import java.util.ArrayList;
import java.util.Collections;

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
        Team<SoccerPlayer> soccerTeam3 = new Team<>("Villareal");
        Team<SoccerPlayer> soccerTeam4 = new Team<>("Granada");

//        soccerTeam.matchResult(baseballTeam, 5, 1);

        soccerTeam.matchResult(soccerTeam2, 2, 1);
        soccerTeam.matchResult(soccerTeam3, 4, 1);
        soccerTeam2.matchResult(soccerTeam3, 1, 0);
        System.out.println("Rankings");
        System.out.println(soccerTeam.getName() + ": " + soccerTeam.ranking());
        System.out.println(soccerTeam2.getName() + ": " + soccerTeam2.ranking());
        System.out.println(soccerTeam3.getName() + ": " + soccerTeam3.ranking());

        System.out.println(soccerTeam.compareTo(soccerTeam2));
        System.out.println(soccerTeam3.compareTo(soccerTeam));
        System.out.println(soccerTeam3.compareTo(soccerTeam4));

        ArrayList<Team> teams = new ArrayList<>();
        teams.add(soccerTeam2);
        teams.add(soccerTeam4);
        teams.add(soccerTeam3);
        teams.add(soccerTeam);

        Collections.sort(teams);

        for (int i=0; i<teams.size(); i++) {
            System.out.println((i+1) + ". " + teams.get(i).getName());
        }

    }

}
