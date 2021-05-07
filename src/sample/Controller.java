package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class Controller {
    @FXML private ChoiceBox courseButton1;
    @FXML private ChoiceBox courseButton2;
    @FXML private AnchorPane MyInfoPane1;
    @FXML private AnchorPane MyInfoPane2;
    @FXML private javafx.scene.control.TabPane TabPane;

    public void initialize() throws IOException {
        ObservableList<String> coursesList = FXCollections.observableArrayList(
                "English",
                "Spanish",
                "Maths",
                "Computer Science",
                "Chemistry",
                "Physics",
                "Biology",
                "Environmental Systems and Societies",
                "Theater Arts",
                "Art",
                "Music",
                "Psychology",
                "Economics"
        );
        courseButton1.getItems().setAll(coursesList);

    }



    public void MyInfoButton(ActionEvent actionEvent) {
        MyInfoPane1.setVisible(true);
        MyInfoPane2.setVisible(false);
        TabPane.setVisible(false);

    }

    public void MyUniButton(ActionEvent actionEvent) {

    }

    public void MyInfo2Btn(ActionEvent actionEvent) {
        MyInfoPane1.setVisible(false);
        MyInfoPane2.setVisible(true);
        TabPane.setVisible(false);
    }

    public void ReturnToTabBtn(ActionEvent actionEvent) {
        MyInfoPane1.setVisible(false);
        MyInfoPane2.setVisible(false);
        TabPane.setVisible(true);
    }


    {
        ObservableList<String> hlStButton1;

        hlStButton1 = FXCollections.observableArrayList(
                "HL",
                        "SL"
                );
    }
    {
        ObservableList<String> markButton1;

        markButton1 = FXCollections.observableArrayList(
                "1",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7"
        );
    }


}
