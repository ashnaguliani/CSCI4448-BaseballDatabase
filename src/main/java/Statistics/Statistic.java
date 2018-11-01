package Statistics;

import java.util.UUID;

public class Statistic {
    private final UUID statisticID;
    private final UUID createdBy;

    Statistic(UUID createdBy){
        this.statisticID = UUID.randomUUID();
        this.createdBy = createdBy;
    }

    public UUID getCreatedBy() {
        return createdBy;
    }

    public UUID getStatisticID() {
        return statisticID;
    }
}

