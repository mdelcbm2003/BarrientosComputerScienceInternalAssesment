package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class Controller {
    @FXML private AnchorPane MyInfoPane1;
    @FXML private AnchorPane MyInfoPane2;
    @FXML private javafx.scene.control.TabPane TabPane;

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
}
