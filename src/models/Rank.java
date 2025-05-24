package models;

public class Rank {
    String division;
    String league;

    public Rank(String division, String league) {
        this.division = division;
        this.league = league;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    @Override
    public String toString() {
        return "Rank{" +  System.lineSeparator() +
                "division='" + division + '\'' +  System.lineSeparator() +
                ", league='" + league + '\'' +  System.lineSeparator() +
                '}';
    }
}
