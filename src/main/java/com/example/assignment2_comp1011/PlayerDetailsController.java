package com.example.assignment2_comp1011;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;


public class PlayerDetailsController {

    @FXML
    private Label idLabel;

    @FXML
    private Label playerNameLabel;

    @FXML
    private Label dateOfBirthLabel;

    @FXML
    private Label roleLabel;

    @FXML
    private Label battingStyleLabel;

    @FXML
    private Label bowlingStyleLabel;

    @FXML
    private Label placeOfBirthLabel;

    @FXML
    private ImageView imageView;




    private PlayerInfo player;

    /**
     * This method will load a playerID
     */

    public void loadPlayerInfo(String id)
    {
        player = APIUtility.getPlayerInfo(id);

        playerNameLabel.setText(player.getName());
        idLabel.setText(player.getId());
        dateOfBirthLabel.setText(player.getDateOfBirth());
        roleLabel.setText(player.getRole());
        battingStyleLabel.setText(player.getBattingStyle());
        bowlingStyleLabel.setText(player.getBowlingStyle());
        placeOfBirthLabel.setText(player.getPlaceOfBirth());
//
//        try{
//            imageView.setImage(new Image((player.getPlayerImg())));
//        }catch
//        (IllegalArgumentException e)
//        {
//            imageView.setImage(new Image("https://trailerfailure.com/img/images/missingCoverPhoto.jpg"));
//        }
    }
}
