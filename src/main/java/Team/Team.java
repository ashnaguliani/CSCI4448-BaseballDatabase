package Team;

import Player.Player;
import java.util.*;
import Statistics.*;

public class Team {
    private final UUID teamID;
    private final String teamName;
    private ArrayList<Player> playersOnTeam=new ArrayList<>();

    public Team(String teamName)
    {
        this.teamID = UUID.randomUUID();
        this.teamName = teamName;
    }

    public UUID getTeamID() {
        return teamID;
    }

    public String getTeamName() {
        return teamName;
    }

    public ArrayList<Player> getPlayersOnTeam() {
        return playersOnTeam;
    }

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


    public ArrayList<Statistic> getTeamStatistics(){
        ArrayList<Statistic> statistics =new ArrayList<>();
        for(Player player : playersOnTeam){
            statistics.addAll(player.getStatistics());
        }
        return statistics;
    }
}