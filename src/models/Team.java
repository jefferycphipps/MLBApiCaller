package models;

public class Team {
    String name;
    String market;
    String abbr;
    String id;
    String away_loss;
    String away_win;
    String elimination_number;
    String games_back;
    String home_loss;
    String home_win;
    String last_10_lost;
    String last_10_win;
    String loss;
    String streak;
    String wild_card_back;
    String win;
    String win_p;
    String al_loss;
    String al_win;
    String c_loss;
    String c_win;
    String w_loss;
    String w_win;
    String e_loss;
    String e_win;
    String division_elimination_number;
    Rank rank;


    public Team(String name, String market, String abbr, String id, String away_loss, String away_win, String elimination_number, String games_back, String home_loss, String home_win, String last_10_lost, String last_10_win, String loss, String streak, String wild_card_back, String win, String win_p, String al_loss, String al_win, String c_loss, String c_win, String w_loss, String w_win, String e_loss, String e_win, String division_elimination_number, Rank rank) {
        this.name = name;
        this.market = market;
        this.abbr = abbr;
        this.id = id;
        this.away_loss = away_loss;
        this.away_win = away_win;
        this.elimination_number = elimination_number;
        this.games_back = games_back;
        this.home_loss = home_loss;
        this.home_win = home_win;
        this.last_10_lost = last_10_lost;
        this.last_10_win = last_10_win;
        this.loss = loss;
        this.streak = streak;
        this.wild_card_back = wild_card_back;
        this.win = win;
        this.win_p = win_p;
        this.al_loss = al_loss;
        this.al_win = al_win;
        this.c_loss = c_loss;
        this.c_win = c_win;
        this.w_loss = w_loss;
        this.w_win = w_win;
        this.e_loss = e_loss;
        this.e_win = e_win;
        this.division_elimination_number = division_elimination_number;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAway_loss() {
        return away_loss;
    }

    public void setAway_loss(String away_loss) {
        this.away_loss = away_loss;
    }

    public String getAway_win() {
        return away_win;
    }

    public void setAway_win(String away_win) {
        this.away_win = away_win;
    }

    public String getElimination_number() {
        return elimination_number;
    }

    public void setElimination_number(String elimination_number) {
        this.elimination_number = elimination_number;
    }

    public String getGames_back() {
        return games_back;
    }

    public void setGames_back(String games_back) {
        this.games_back = games_back;
    }

    public String getHome_loss() {
        return home_loss;
    }

    public void setHome_loss(String home_loss) {
        this.home_loss = home_loss;
    }

    public String getHome_win() {
        return home_win;
    }

    public void setHome_win(String home_win) {
        this.home_win = home_win;
    }

    public String getLast_10_lost() {
        return last_10_lost;
    }

    public void setLast_10_lost(String last_10_lost) {
        this.last_10_lost = last_10_lost;
    }

    public String getLast_10_win() {
        return last_10_win;
    }

    public void setLast_10_win(String last_10_win) {
        this.last_10_win = last_10_win;
    }

    public String getLoss() {
        return loss;
    }

    public void setLoss(String loss) {
        this.loss = loss;
    }

    public String getStreak() {
        return streak;
    }

    public void setStreak(String streak) {
        this.streak = streak;
    }

    public String getWild_card_back() {
        return wild_card_back;
    }

    public void setWild_card_back(String wild_card_back) {
        this.wild_card_back = wild_card_back;
    }

    public String getWin() {
        return win;
    }

    public void setWin(String win) {
        this.win = win;
    }

    public String getWin_p() {
        return win_p;
    }

    public void setWin_p(String win_p) {
        this.win_p = win_p;
    }

    public String getAl_loss() {
        return al_loss;
    }

    public void setAl_loss(String al_loss) {
        this.al_loss = al_loss;
    }

    public String getAl_win() {
        return al_win;
    }

    public void setAl_win(String al_win) {
        this.al_win = al_win;
    }

    public String getC_loss() {
        return c_loss;
    }

    public void setC_loss(String c_loss) {
        this.c_loss = c_loss;
    }

    public String getC_win() {
        return c_win;
    }

    public void setC_win(String c_win) {
        this.c_win = c_win;
    }

    public String getW_loss() {
        return w_loss;
    }

    public void setW_loss(String w_loss) {
        this.w_loss = w_loss;
    }

    public String getW_win() {
        return w_win;
    }

    public void setW_win(String w_win) {
        this.w_win = w_win;
    }

    public String getE_loss() {
        return e_loss;
    }

    public void setE_loss(String e_loss) {
        this.e_loss = e_loss;
    }

    public String getE_win() {
        return e_win;
    }

    public void setE_win(String e_win) {
        this.e_win = e_win;
    }

    public String getDivision_elimination_number() {
        return division_elimination_number;
    }

    public void setDivision_elimination_number(String division_elimination_number) {
        this.division_elimination_number = division_elimination_number;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return System.lineSeparator() + market + " " +  name + System.lineSeparator() +
                "Wins:" + win +   System.lineSeparator() +
                "Losses:" + loss +   System.lineSeparator();
    }
}
