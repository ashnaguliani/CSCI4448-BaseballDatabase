package Statistics;

import java.util.UUID;

public class BattingStatistic extends Statistic{
    private int games;
    private int plateAppearances;
    private int runs;
    private int hits;
    private int doubles;
    private int triples;
    private int homeRuns;
    private int runsBattedIn;
    private int stolenBases;
    private int caughtStealing;
    private int walks;
    private int strikeouts;

    /**
     * @param createdBy - user who created the stat
     * @param games - how many games the player appeared in
     * @param plateAppearances - how many plate appearances the player had
     * @param runs - how many runs the player scored
     * @param hits - how many hits the player had
     * @param doubles - how many doubles the player had
     * @param triples - how many triples the player had
     * @param homeRuns - how many home runs the player had
     * @param runsBattedIn - how many runs the player batted in
     * @param stolenBases - how many stolen bases the player had
     * @param caughtStealing - how many times the player was caught stealing
     * @param walks - how many times the player walked
     * @param strikeouts - how many times the player struck out
     */
    public BattingStatistic(UUID createdBy, int games, int plateAppearances, int runs, int hits,
                            int doubles, int triples, int homeRuns, int runsBattedIn, int stolenBases,
                            int caughtStealing, int walks, int strikeouts) {
        super(createdBy, "batting");
        this.games = games;
        this.plateAppearances = plateAppearances;
        this.runs = runs;
        this.hits = hits;
        this.doubles = doubles;
        this.triples = triples;
        this.homeRuns = homeRuns;
        this.runsBattedIn = runsBattedIn;
        this.stolenBases = stolenBases;
        this.caughtStealing = caughtStealing;
        this.walks = walks;
        this.strikeouts = strikeouts;
    }

}
