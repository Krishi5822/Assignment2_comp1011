package com.example.assignment2_comp1011;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SearchViewController implements Initializable {



    @FXML
    private ListView<PlayerData> resultListView;

    @FXML
    private TextField searchTextField;

    @FXML
    private Button getDetailsButton;

    @FXML
    private Label msgLabel;


    @FXML
    private void searchPlayers() {
        APIResponse apiResponse = APIUtility.getPlayerDataFromCrickApi(searchTextField.getText());
        resultListView.getItems().clear();
        if(apiResponse.getData() != null)
        {
            resultListView.getItems().addAll(apiResponse.getData());
            msgLabel.setText("");
        }

        else
            msgLabel.setText("Player not found");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        getDetailsButton.setVisible(true);
        msgLabel.setText("");
//
//        resultListView.getSelectionModel().selectedItemProperty().addListener(
//                (obs, oldPlayerSelected, newPlayerSelected) -> {
//            getDetailsButton.setVisible(true);
//            try{
//
//            }
    }





/**
 * This method will pass the player details to the Player details controller
 */
@FXML
private void getDetails(ActionEvent event) throws IOException {
    String id = resultListView.getSelectionModel().getSelectedItem().getId();
    System.out.println("Player Id: "+id);
    SceneChanger.changeScenes(event, "PlayerDetails.fxml", id);
}
}




