package Statistics;

import java.util.UUID;

public class Statistic {
    private final UUID statisticID;
    private final UUID createdBy;
    public String type;

    Statistic(UUID createdBy, String type){
        this.statisticID = UUID.randomUUID();
        this.createdBy = createdBy;
        this.type = type;
    }

    public UUID getCreatedBy() {
        return createdBy;
    }
    public UUID getStatisticID() {
        return statisticID;
    }
}

