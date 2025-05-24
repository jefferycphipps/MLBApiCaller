package models;

import java.util.List;

public class Division {
    String alias;
    String name;
    String id;
    List<Team> teams;

    public Division(String alias, String name, String id, List<Team> teams) {
        this.alias = alias;
        this.name = name;
        this.id = id;
        this.teams = teams;
    }

    public Division() {}

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return System.lineSeparator() + name.toUpperCase() + System.lineSeparator() +
                "Teams:" + System.lineSeparator() + teams + System.lineSeparator();
    }
}
