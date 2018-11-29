package Team;

import Player.Player;
import java.util.*;
import Statistics.*;

public class Team {
    /**
     * The unique ID of the team
     */
    private final UUID teamID;
    /**
     * The team's name
     */
    private final String teamName;
    /**
     * The list of players associated with the team
     */
    private ArrayList<Player> playersOnTeam=new ArrayList<>();

    /**
     * Constructor
     * @param teamName - name of the team
     */
    public Team(String teamName)
    {
        this.teamID = UUID.randomUUID();
        this.teamName = teamName;
    }

    /**
     * @return teamID
     */
    public UUID getTeamID() {
        return teamID;
    }

    /**
     * @return teamName
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * @return list of players on the team
     */
    public ArrayList<Player> getPlayersOnTeam() {
        return playersOnTeam;
    }

    /**
     * @param playerID - ID of the player to add
     * @return whether the player was added successfully
     */
    public boolean addPlayer(String playerID)
    {
        for (Player player: playersOnTeam){
            if (player.getPlayerId().equals(playerID)){
                return false;
            }
        }
        Player newPlayer = new Player(playerID);
        playersOnTeam.add(newPlayer);
        return true;
    }

    /**
     * @param playerIDToRemove - ID of the player to remove
     * @return whether the player was removed successfully
     */
    public boolean removePlayer(String playerIDToRemove){
        int indexToRemove = -1;
        for (int counter = 0; counter < playersOnTeam.size(); counter++) {
            if(playersOnTeam.get(counter).getPlayerId().equals(playerIDToRemove)){
                indexToRemove = counter;
            }
        }
        if(indexToRemove != -1) {
            playersOnTeam.remove(indexToRemove);
            return true;
        }else return false;
    }


    /**
     * @return the stats of the whole team
     */
    public ArrayList<Statistic> getTeamStatistics(){
        ArrayList<Statistic> statistics =new ArrayList<>();
        for(Player player : playersOnTeam){
            statistics.addAll(player.getStatistics());
        }
        return statistics;
    }
}