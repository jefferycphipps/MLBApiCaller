package models;

import java.util.List;

public class Season {
    String id;
    String year;
    String type;
    List<Leagues> leagues;

    public Season(String id, String year, String type, List<Leagues> leagues) {
        this.id = id;
        this.year = year;
        this.type = type;
        this.leagues = leagues;
    }

    public Season() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Leagues> getLeagues() {
        return leagues;
    }

    public void setLeagues(List<Leagues> leagues) {
        this.leagues = leagues;
    }

    @Override
    public String toString() {
        return System.lineSeparator() +
                "Year:" + year + System.lineSeparator() +
                "Leagues" + System.lineSeparator() + leagues + System.lineSeparator();
    }
}
