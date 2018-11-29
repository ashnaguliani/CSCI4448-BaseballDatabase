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
     */
    public PitchingStatistic(UUID createdBy, int games, int wins, int saves, int losses, int inningsPitched,
                             int runs, int hits, int earnedRuns, int homeRuns, int walks, int strikeouts) {
        super(createdBy, "pitching");
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

}
