package de.itdesign.incubating.rmg.model;

import java.util.Collection;

public class ProjectPlan {
    String id;
    Player owner;
    Project project;
    int projectStartTime;
    Collection<ResourceCard> cards;

    public ProjectPlan(String id, Player owner, Project project, int projectStartTime, Collection<ResourceCard> cards) {
        this.id = id;
        this.owner = owner;
        this.project = project;
        this.projectStartTime = projectStartTime;
        this.cards = cards;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public int getProjectStartTime() {
        return projectStartTime;
    }

    public void setProjectStartTime(int projectStartTime) {
        this.projectStartTime = projectStartTime;
    }

    public Collection<ResourceCard> getCards() {
        return cards;
    }

    public void setCards(Collection<ResourceCard> cards) {
        this.cards = cards;
    }
}
