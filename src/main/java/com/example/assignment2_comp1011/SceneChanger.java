
package com.example.assignment2_comp1011;
/*
    import statements
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/*
    method for scene changing
 */
public class SceneChanger {

    public static void changeScenes(ActionEvent event, String fxmlFileName, String id) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxmlFileName));
        Scene scene = new Scene(fxmlLoader.load());

        //get the controller from the destination
        PlayerDetailsController controller = fxmlLoader.getController();
        controller.loadPlayerInfo(id);
        //get the stage object from the action event triggered when button is clicked
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}