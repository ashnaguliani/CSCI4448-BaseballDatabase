package Player;

import Statistics.Statistic;

import java.util.ArrayList;

public class Player {
    private final String playerID;
    private ArrayList<Statistic> statistics=new ArrayList<Statistic>();

    public Player(String playerID){
        this.playerID = playerID;
    }

    public String getPlayerId() {
        return playerID;
    }

    public void addStatistic(Statistic statistic){
        statistics.add(statistic);
    }

    public ArrayList<Statistic> getStatistics() {
        return statistics;
    }
}