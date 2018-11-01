package Team;

import Player.Player;
import java.util.*;

public class Team {
    private final UUID teamID;
    private final String teamName;
    private ArrayList<Player> playersOnTeam=new ArrayList<Player>();

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

    boolean addPlayer(String playerID, boolean batter, boolean pitcher)
    {
        Player newPlayer = new Player(playerID, batter, pitcher);
        playersOnTeam.add(newPlayer);
        return true;
    }

    boolean removePlayer(String playerIDToRemove){
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

}