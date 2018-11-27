package Player;

import Statistics.Statistic;
import java.util.ArrayList;
import java.util.UUID;


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

    public boolean removeStatistic(UUID statisticID){
        for (Statistic stat : statistics){
            if (stat.getStatisticID().equals(statisticID)){
                statistics.remove(stat);
                return true;
            }
        }
        return false;
    }
}