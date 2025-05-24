package models;

public class League {
    String alias;
    String name;
    String id;
    Season season;

    public League(){

    }

    public League(String alias, String name, String id, Season season) {
        this.alias = alias;
        this.name = name;
        this.id = id;
        this.season = season;
    }

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

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }


    @Override
    public String toString() {
        return "League{" +
                "alias='" + alias + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", season=" + season +
                '}';
    }
}
