package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

// this is where I create the Choice Box, referring to each button connecting it to the GUI
public class Controller {
    @FXML private ChoiceBox markButton1;
    @FXML private ChoiceBox markButton2;
    @FXML private ChoiceBox markButton3;
    @FXML private ChoiceBox markButton4;
    @FXML private ChoiceBox markButton5;
    @FXML private ChoiceBox markButton6;
    @FXML private ChoiceBox markButton7; //tok letters
    @FXML private ChoiceBox markButton8;//EE letters

    @FXML private ChoiceBox courseButton1;
    @FXML private ChoiceBox courseButton2;
    @FXML private ChoiceBox courseButton3;
    @FXML private ChoiceBox courseButton4;
    @FXML private ChoiceBox courseButton5;
    @FXML private ChoiceBox courseButton6;

    @FXML private ChoiceBox hlStButton1;
    @FXML private ChoiceBox hlStButton2;
    @FXML private ChoiceBox hlStButton3;
    @FXML private ChoiceBox hlStButton4;
    @FXML private ChoiceBox hlStButton5;
    @FXML private ChoiceBox hlStButton6;

    // Here I connect my coding with the GUI features, such as Text Field and Date Picker
    @FXML private TextField nameIn;
    @FXML private TextField lastNameIn;
    @FXML private TextField mailIn;
    @FXML private DatePicker yofgIn;


    @FXML private AnchorPane MyInfoPane1;
    @FXML private AnchorPane MyInfoPane2;
    @FXML private javafx.scene.control.TabPane TabPane;

    public void initialize() throws IOException {

        ChoiceBox[] choices = {courseButton1,courseButton2,courseButton3,courseButton4,courseButton5,courseButton6};
        ChoiceBox[] marks = {markButton1,markButton2,markButton3,markButton4,markButton5,markButton6};
        ChoiceBox[] marksL = {markButton7, markButton8};
        ChoiceBox[] hlsl = {hlStButton1,hlStButton2,hlStButton3,hlStButton4,hlStButton5,hlStButton6};

        for (ChoiceBox c: choices) {
            c.getItems().setAll("English",
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
                    "Economics");

            c.setOnAction(event -> {

                //if this choice box is the same as any of the others, tell the user they already selected that course.
                for (ChoiceBox cb: choices) {
                    if (c.getSelectionModel().getSelectedIndex() == cb.getSelectionModel().getSelectedIndex()){
                        c.setValue("Already chosen, try again");
                    }
                }

            });
        }
        for (ChoiceBox m: marks){
            m.getItems().setAll("1","2","3","4","5","6","7");
        }
        for (ChoiceBox ms: marksL) {
            ms.getItems().setAll("A","B","C","D","E");
        }
        for (ChoiceBox hs: hlsl) {
            hs.getItems().setAll("SL","HL");
        }

        //create a user class that can store all of the user information.
        Main.user = new User();

        //one json file for your user information
        //one json file for universities/course

       // if no user information has been saved before (first time user)...
            //create an object called user that is empty.

            //go to first page of user info...

        //else if a save file already exists,
              //  load the ifnrmation and skip to the tab page.

        ArrayList<University> universities = new ArrayList<University>();
        universities.add(new University("Cambridge", 15000, "Lima"));

    }


    public void MyInfoButton(ActionEvent actionEvent) {
        MyInfoPane1.setVisible(true);
        MyInfoPane2.setVisible(false);
        TabPane.setVisible(false);
        //read all of the user information and set the boxes up.// text boxes, check boxes, etc.


    }

    public void MyUniButton(ActionEvent actionEvent) {


    }

    public void ShowMyInfo2Btn(ActionEvent actionEvent) {
        MyInfoPane1.setVisible(false);
        MyInfoPane2.setVisible(true);
        TabPane.setVisible(false);
        Main.user.saveUser(nameIn.getText(), lastNameIn.getText(), mailIn.getText(), yofgIn.getValue());

    }

    public void ShowTabPaneBtn(ActionEvent actionEvent) {
        MyInfoPane1.setVisible(false);
        MyInfoPane2.setVisible(false);
        TabPane.setVisible(true);


    }



}
