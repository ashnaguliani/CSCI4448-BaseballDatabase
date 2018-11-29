package Statistics;

import java.util.UUID;

public class BattingStatisticBuilder {
    private UUID createdBy;
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
     *
     *
     *
     *
     *
     *
     */

    /**
     * @param createdBy - user who created the stat
     * @return the whole object
     */
    public BattingStatisticBuilder setCreatedBy(UUID createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * @param games - how many games the player appeared in
     * @return the whole object
     */
    public BattingStatisticBuilder setGames(int games) {
        this.games = games;
        return this;
    }

    /**
     * @param plateAppearances - how many plate appearances the player had
     * @return the whole object
     */
    public BattingStatisticBuilder setPlateAppearances(int plateAppearances) {
        this.plateAppearances = plateAppearances;
        return this;
    }

    /**
     * @param runs - how many runs the player scored
     * @return the whole object
     */
    public BattingStatisticBuilder setRuns(int runs) {
        this.runs = runs;
        return this;
    }

    /**
     * @param hits - how many hits the player had
     * @return the whole object
     */
    public BattingStatisticBuilder setHits(int hits) {
        this.hits = hits;
        return this;
    }

    /**
     * @param doubles - how many doubles the player had
     * @return the whole object
     */
    public BattingStatisticBuilder setDoubles(int doubles) {
        this.doubles = doubles;
        return this;
    }

    /**
     * @param triples - how many triples the player had
     * @return the whole object
     */
    public BattingStatisticBuilder setTriples(int triples) {
        this.triples = triples;
        return this;
    }

    /**
     * @param homeRuns - how many home runs the player had
     * @return the whole object
     */
    public BattingStatisticBuilder setHomeRuns(int homeRuns) {
        this.homeRuns = homeRuns;
        return this;
    }

    /**
     * @param runsBattedIn - how many runs the player batted in
     * @return the whole object
     */
    public BattingStatisticBuilder setRunsBattedIn(int runsBattedIn) {
        this.runsBattedIn = runsBattedIn;
        return this;
    }

    /**
     * @param stolenBases - how many stolen bases the player had
     * @return the whole object
     */
    public BattingStatisticBuilder setStolenBases(int stolenBases) {
        this.stolenBases = stolenBases;
        return this;
    }

    /**
     * @param caughtStealing - how many times the player was caught stealing
     * @return the whole object
     */
    public BattingStatisticBuilder setCaughtStealing(int caughtStealing) {
        this.caughtStealing = caughtStealing;
        return this;
    }

    /**
     * @param walks - how many times the player walked
     * @return the whole object
     */
    public BattingStatisticBuilder setWalks(int walks) {
        this.walks = walks;
        return this;
    }

    /**
     * @param strikeouts - how many times the player struck out
     * @return the whole object
     */
    public BattingStatisticBuilder setStrikeouts(int strikeouts) {
        this.strikeouts = strikeouts;
        return this;
    }

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
    public BattingStatistic createBattingStatistic(UUID createdBy, int games, int plateAppearances, int runs, int hits,
                                                   int doubles, int triples, int homeRuns, int runsBattedIn,
                                                   int stolenBases, int caughtStealing, int walks, int strikeouts)
    {
        return new BattingStatistic(createdBy, games, plateAppearances, runs, hits, doubles, triples,
                homeRuns, runsBattedIn, stolenBases, caughtStealing, walks, strikeouts);
    }
}