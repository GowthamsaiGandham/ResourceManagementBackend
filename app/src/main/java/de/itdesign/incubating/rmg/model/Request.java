package de.itdesign.incubating.rmg.model;

public class Request {
    String id;
    String targetProjectBoardId;
    Demand demand;

    public Request(String id, String targetProjectBoardId, Demand demand) {
        this.id = id;
        this.targetProjectBoardId = targetProjectBoardId;
        this.demand = demand;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTargetProjectBoardId() {
        return targetProjectBoardId;
    }

    public void setTargetProjectBoardId(String targetProjectBoardId) {
        this.targetProjectBoardId = targetProjectBoardId;
    }

    public Demand getDemand() {
        return demand;
    }

    public void setDemand(Demand demand) {
        this.demand = demand;
    }
}
