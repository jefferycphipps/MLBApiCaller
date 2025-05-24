import models.League;
import services.MLBAPICaller;

import java.util.Scanner;

public class MLBApi {


    public static void main(String[] args) {
        MLBAPICaller caller = new MLBAPICaller();
        League league = new League();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a year to see the stats for(2013 to present)");
        String year = scanner.nextLine();
//

        league = caller.searchSeasonByDate(year);

        System.out.println(league.toString());

    }

}
