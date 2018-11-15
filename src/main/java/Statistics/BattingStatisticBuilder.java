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

    public BattingStatisticBuilder setCreatedBy(UUID createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public BattingStatisticBuilder setGames(int games) {
        this.games = games;
        return this;
    }

    public BattingStatisticBuilder setPlateAppearances(int plateAppearances) {
        this.plateAppearances = plateAppearances;
        return this;
    }

    public BattingStatisticBuilder setRuns(int runs) {
        this.runs = runs;
        return this;
    }

    public BattingStatisticBuilder setHits(int hits) {
        this.hits = hits;
        return this;
    }

    public BattingStatisticBuilder setDoubles(int doubles) {
        this.doubles = doubles;
        return this;
    }

    public BattingStatisticBuilder setTriples(int triples) {
        this.triples = triples;
        return this;
    }

    public BattingStatisticBuilder setHomeRuns(int homeRuns) {
        this.homeRuns = homeRuns;
        return this;
    }

    public BattingStatisticBuilder setRunsBattedIn(int runsBattedIn) {
        this.runsBattedIn = runsBattedIn;
        return this;
    }

    public BattingStatisticBuilder setStolenBases(int stolenBases) {
        this.stolenBases = stolenBases;
        return this;
    }

    public BattingStatisticBuilder setCaughtStealing(int caughtStealing) {
        this.caughtStealing = caughtStealing;
        return this;
    }

    public BattingStatisticBuilder setWalks(int walks) {
        this.walks = walks;
        return this;
    }

    public BattingStatisticBuilder setStrikeouts(int strikeouts) {
        this.strikeouts = strikeouts;
        return this;
    }

    public BattingStatistic createBattingStatistic() {
        return new BattingStatistic(createdBy, games, plateAppearances, runs, hits, doubles, triples, homeRuns, runsBattedIn, stolenBases, caughtStealing, walks, strikeouts);
    }
}