package com.example.assignment2_comp1011;


import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.FileReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;

public class APIUtility {

    public static APIResponse getPlayerInfoFromJSONFile(String filename)
    {
        //create a GSON object to parse the objects
        Gson gson = new Gson();
        APIResponse responses = null;


        //try with resources - anything inside () will "auto close"
        try(
                //opens the JSON file from hard drive
                FileReader fileReader = new FileReader(filename);
                JsonReader jsonReader = new JsonReader(fileReader);

                ){
            //converting JSON object into API response  object
            responses = gson.fromJson(jsonReader, APIResponse.class);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return responses;

    }



    /**
     * This method will call the API and write to a file
     */
    public static APIResponse getPlayerDataFromCrickApi(String searchData) {
        searchData = searchData.replace(" ", "%20");
        String uri = "https://api.cricapi.com/v1/players?apikey=65c7cf53-44bb-4e8c-bf33-efb8bc192e42&offset=0&search=" +searchData;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(uri)).build();

        //this will call API
        try {
            HttpResponse<Path> response = client.send(httpRequest, HttpResponse
                    .BodyHandlers.ofFile(Paths.get("JavaApiFetched.json")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return getPlayerInfoFromJSONFile("JavaApiFetched.json");
    }

    /**
     * This method will call API and return the object without creating a Json file on hard drive
     */
    public static APIResponse getPlayerDataFromCrickApiQuick (String searchData)
    {
        searchData = searchData.replace(" ", "%20");
        String uri = "https://api.cricapi.com/v1/players?apikey=65c7cf53-44bb-4e8c-bf33-efb8bc192e42&offset=0&search=" +searchData;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(uri)).build();

        //this will call API
        try {
            HttpResponse<String> response = client.send(httpRequest, HttpResponse
                    .BodyHandlers.ofString());
            Gson gson = new Gson();
            return gson.fromJson(response.body(), APIResponse.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static APIResponse2 getIndividualPlayerDataFromCrickApiQuick (String id)
    {

        String uri = "https://api.cricapi.com/v1/players_info?apikey=65c7cf53-44bb-4e8c-bf33-efb8bc192e42&offset=0&id=" +id;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(uri)).build();

        //this will call API
        try {
            HttpResponse<String> response = client.send(httpRequest, HttpResponse
                    .BodyHandlers.ofString());
            Gson gson = new Gson();
            return gson.fromJson(response.body(), APIResponse2.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * This method receives an id and will call the Player Details object
     */
    public static PlayerInfo getPlayerInfo(String id){
        String uri = "https://api.cricapi.com/v1/players_info?apikey=65c7cf53-44bb-4e8c-bf33-efb8bc192e42&offset=0&id=" +id;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(uri)).build();

        //this will call API
        try {
            HttpResponse<String> response = client.send(httpRequest, HttpResponse
                    .BodyHandlers.ofString());
            Gson gson = new Gson();
            return gson.fromJson(response.body(), PlayerInfo.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
