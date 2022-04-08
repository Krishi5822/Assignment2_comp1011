package com.example.assignment2_comp1011;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application   {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(FXMLLoader.load(Main.class.getResource("search-view.fxml")));
//        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Search Players");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch();
//        APIResponse2 apiResponse = APIUtility.getIndividualPlayerDataFromCrickApiQuick("5d85ff9a-fe87-4b27-bf34-ad7bd74d5195");
//        System.out.println(apiResponse);

//        APIResponse apiResponse = APIUtility.getPlayerDataFromCrickApi("Rohit");
//        System.out.println(apiResponse);

//        APIResponse apiResponse2 = APIUtility.getClashOfClanFromCocAPIQuick("#2LUV2Q9LP");
//        System.out.println(apiResponse2);
    }
}