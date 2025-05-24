import models.League;
import services.MLBAPICaller;

public class MLBApi {


    public static void main(String[] args) {
        MLBAPICaller caller = new MLBAPICaller();
        League league = new League();
        league = caller.searchSeasonByDate("2023");

        System.out.println(league.toString());

    }

}
