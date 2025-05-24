This is an demo of creating an external call to the SportsRadar MLB Standings by season. 
https://developer.sportradar.com/baseball/reference/mlb-standings
API Key is NOT provided. You can sign up for one by going to https://developer.sportradar.com/


In main, season is coded to return 2023 season but this can be changed very easily within the application. 
MLBApiCaller returns the league for given year with the season by year, leagues, divisions, and teams in that order. 
Each part is broken into sub classes to use Google's GSon parser. 
More information here: https://github.com/google/gson/tree/main

Feel free to use as need
