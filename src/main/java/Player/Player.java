package Player;

public class Player {
    private final String playerID;
    private boolean batter;
    private boolean pitcher;

    public Player(String playerID, boolean batter, boolean pitcher){
        this.playerID = playerID;
        this.batter = batter;
        this.pitcher = pitcher;
    }

    public String getPlayerId() {
        return playerID;
    }

    public boolean getBatter() {
        return batter;
    }

    public boolean getPitcher() {
        return pitcher;
    }

    public void setBatter(boolean batter) {
        this.batter = batter;
    }

    public void setPitcher(boolean pitcher) {
        this.pitcher = pitcher;
    }
}