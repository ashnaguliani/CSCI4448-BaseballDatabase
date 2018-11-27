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

    public PitchingStatisticBuilder setCreatedBy(UUID createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public PitchingStatisticBuilder setGames(int games) {
        this.games = games;
        return this;
    }

    public PitchingStatisticBuilder setWins(int wins) {
        this.wins = wins;
        return this;
    }

    public PitchingStatisticBuilder setSaves(int saves) {
        this.saves = saves;
        return this;
    }

    public PitchingStatisticBuilder setLosses(int losses) {
        this.losses = losses;
        return this;
    }

    public PitchingStatisticBuilder setInningsPitched(int inningsPitched) {
        this.inningsPitched = inningsPitched;
        return this;
    }

    public PitchingStatisticBuilder setRuns(int runs) {
        this.runs = runs;
        return this;
    }

    public PitchingStatisticBuilder setHits(int hits) {
        this.hits = hits;
        return this;
    }

    public PitchingStatisticBuilder setEarnedRuns(int earnedRuns) {
        this.earnedRuns = earnedRuns;
        return this;
    }

    public PitchingStatisticBuilder setHomeRuns(int homeRuns) {
        this.homeRuns = homeRuns;
        return this;
    }

    public PitchingStatisticBuilder setWalks(int walks) {
        this.walks = walks;
        return this;
    }

    public PitchingStatisticBuilder setStrikeouts(int strikeouts) {
        this.strikeouts = strikeouts;
        return this;
    }

    public PitchingStatistic createPitchingStatistic( UUID createdBy, int games, int wins, int saves, int losses,
                                                      int inningsPitched, int runs, int hits, int earnedRuns,
                                                      int homeRuns, int walks, int strikeouts)
    {
        return new PitchingStatistic(createdBy, games, wins, saves, losses, inningsPitched, runs, hits, earnedRuns,
                homeRuns, walks, strikeouts);
    }
}