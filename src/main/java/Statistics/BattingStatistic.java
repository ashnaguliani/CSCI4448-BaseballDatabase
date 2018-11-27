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

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getPlateAppearances() {
        return plateAppearances;
    }

    public void setPlateAppearances(int plateAppearances) {
        this.plateAppearances = plateAppearances;
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

    public int getDoubles() {
        return doubles;
    }

    public void setDoubles(int doubles) {
        this.doubles = doubles;
    }

    public int getTriples() {
        return triples;
    }

    public void setTriples(int triples) {
        this.triples = triples;
    }

    public int getHomeRuns() {
        return homeRuns;
    }

    public void setHomeRuns(int homeRuns) {
        this.homeRuns = homeRuns;
    }

    public int getRunsBattedIn() {
        return runsBattedIn;
    }

    public void setRunsBattedIn(int runsBattedIn) {
        this.runsBattedIn = runsBattedIn;
    }

    public int getStolenBases() {
        return stolenBases;
    }

    public void setStolenBases(int stolenBases) {
        this.stolenBases = stolenBases;
    }

    public int getCaughtStealing() {
        return caughtStealing;
    }

    public void setCaughtStealing(int caughtStealing) {
        this.caughtStealing = caughtStealing;
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
