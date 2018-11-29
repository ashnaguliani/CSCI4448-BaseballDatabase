package Statistics;

import java.util.UUID;

public class PitchingStatisticBuilder {
    private UUID createdBy;
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

    /**
     * @param createdBy - user who created the stat
     * @return the whole object
     */
    public PitchingStatisticBuilder setCreatedBy(UUID createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * @param games - how many games the player pitched
     * @return the whole object
     */
    public PitchingStatisticBuilder setGames(int games) {
        this.games = games;
        return this;
    }

    /**
     * @param wins - how many games the player won
     * @return the whole object
     */
    public PitchingStatisticBuilder setWins(int wins) {
        this.wins = wins;
        return this;
    }

    /**
     * @param saves - how many saves the player had
     * @return the whole object
     */
    public PitchingStatisticBuilder setSaves(int saves) {
        this.saves = saves;
        return this;
    }

    /**
     * @param losses - how many games the player lost
     * @return the whole object
     */
    public PitchingStatisticBuilder setLosses(int losses) {
        this.losses = losses;
        return this;
    }

    /**
     * @param inningsPitched - how many innings the player pitched
     * @return the whole object
     */
    public PitchingStatisticBuilder setInningsPitched(int inningsPitched) {
        this.inningsPitched = inningsPitched;
        return this;
    }

    /**
     * @param runs - how many runs the player allowed
     * @return the whole object
     */
    public PitchingStatisticBuilder setRuns(int runs) {
        this.runs = runs;
        return this;
    }

    /**
     * @param hits - how many hits the player allowed
     * @return the whole object
     */
    public PitchingStatisticBuilder setHits(int hits) {
        this.hits = hits;
        return this;
    }

    /**
     * @param earnedRuns - how many earned runs the player allowed
     * @return the whole object
     */
    public PitchingStatisticBuilder setEarnedRuns(int earnedRuns) {
        this.earnedRuns = earnedRuns;
        return this;
    }

    /**
     * @param homeRuns - how many home runs the player allowed
     * @return the whole object
     */
    public PitchingStatisticBuilder setHomeRuns(int homeRuns) {
        this.homeRuns = homeRuns;
        return this;
    }

    /**
     * @param walks - how many walks the player allowed
     * @return the whole object
     */
    public PitchingStatisticBuilder setWalks(int walks) {
        this.walks = walks;
        return this;
    }

    /**
     * @param strikeouts - how many strikeouts the player had
     * @return the whole object
     */
    public PitchingStatisticBuilder setStrikeouts(int strikeouts) {
        this.strikeouts = strikeouts;
        return this;
    }

    /**
     * @param createdBy - user who created the stat
     * @param games - how many games the player pitched
     * @param wins - how many games the player won
     * @param saves - how many saves the player had
     * @param losses - how many games the player lost
     * @param inningsPitched - how many innings the player pitched
     * @param runs - how many runs the player allowed
     * @param hits - how many hits the player allowed
     * @param earnedRuns - how many earned runs the player allowed
     * @param homeRuns - how many home runs the player allowed
     * @param walks - how many walks the player allowed
     * @param strikeouts - how many strikeouts the player had
     * @return the whole object
     */
    public PitchingStatistic createPitchingStatistic( UUID createdBy, int games, int wins, int saves, int losses,
                                                      int inningsPitched, int runs, int hits, int earnedRuns,
                                                      int homeRuns, int walks, int strikeouts)
    {
        return new PitchingStatistic(createdBy, games, wins, saves, losses, inningsPitched, runs, hits, earnedRuns,
                homeRuns, walks, strikeouts);
    }
}