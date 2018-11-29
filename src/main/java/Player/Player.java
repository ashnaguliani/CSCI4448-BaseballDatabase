package Player;

import Statistics.Statistic;
import java.util.ArrayList;
import java.util.UUID;


public class Player {
    private final String playerID;
    private ArrayList<Statistic> statistics=new ArrayList<Statistic>();

    /**
     * Class constructor
     * @param playerID the unique ID of the player
     */
    public Player(String playerID){
        this.playerID = playerID;
    }

    /**
     * @return the ID of the player
     */
    public String getPlayerId() {
        return playerID;
    }

    /**
     * @param statistic statistic to be added to the player
     */
    public void addStatistic(Statistic statistic){
        statistics.add(statistic);
    }

    /**
     * @return get all
     */
    public ArrayList<Statistic> getStatistics() {
        return statistics;
    }

    /**
     * @param statisticID ID of the stat to be removed
     * @return whether the stat was removed successfully
     */
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