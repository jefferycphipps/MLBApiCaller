package services;

import models.League;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;


public class MLBAPICaller {

    public static String getApiKey() throws IOException {
        return new String(Files.readAllBytes(Paths.get("apiKey.txt"))).trim();
    }

    Gson gson = new GsonBuilder().create();

    public League searchSeasonByDate(String year){

        HttpResponse<String> response = null;
        League league = new League();
        try{
            String apiKey = getApiKey();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.sportradar.com/mlb/trial/v8/en/seasons/"+year+"/REG/standings.json"))
                    .header("x-api-key", apiKey)
                    .setHeader("Content-Type", "application/json")
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            String answer = response.body().substring(response.body().indexOf(":")+1,response.body().lastIndexOf(","));

            league = gson.fromJson(answer, new TypeToken<League>(){}.getType());
        }catch (
                    IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
        }
        return league;
    }

}

