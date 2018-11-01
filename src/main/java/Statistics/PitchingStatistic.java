package Statistics;

import java.util.UUID;

public class PitchingStatistic extends Statistic{
    private int games;
    private int wins;
    private int saves;
    private int losses;
    private int inningsPitched;
    private int runs;
    private int hits;
    private int earnedRuns;
    private int homeRuns;
    private int walks;
    private int strikeouts;

    public PitchingStatistic(UUID createdBy, int games, int wins, int saves, int losses, int inningsPitched,
                             int runs, int hits, int earnedRuns, int homeRuns, int walks, int strikeouts) {
        super(createdBy);
        this.games = games;
        this.wins = wins;
        this.saves = saves;
        this.losses = losses;
        this.inningsPitched = inningsPitched;
        this.runs = runs;
        this.hits = hits;
        this.earnedRuns = earnedRuns;
        this.homeRuns = homeRuns;
        this.walks = walks;
        this.strikeouts = strikeouts;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getSaves() {
        return saves;
    }

    public void setSaves(int saves) {
        this.saves = saves;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getInningsPitched() {
        return inningsPitched;
    }

    public void setInningsPitched(int inningsPitched) {
        this.inningsPitched = inningsPitched;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getEarnedRuns() {
        return earnedRuns;
    }

    public void setEarnedRuns(int earnedRuns) {
        this.earnedRuns = earnedRuns;
    }

    public int getHomeRuns() {
        return homeRuns;
    }

    public void setHomeRuns(int homeRuns) {
        this.homeRuns = homeRuns;
    }

    public int getWalks() {
        return walks;
    }

    public void setWalks(int walks) {
        this.walks = walks;
    }

    public int getStrikeouts() {
        return strikeouts;
    }

    public void setStrikeouts(int strikeouts) {
        this.strikeouts = strikeouts;
    }
}
