package subject_selector;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;

import javax.swing.*;

public class subject_controllor {

    @FXML
    Label lblCourses;

    @FXML
    Label groupLbl;

    @FXML
    Label lblChoice;

    @FXML
    Label lblBig;

    @FXML
    Label lblLevel;

    @FXML
    Label group1Lbl;

    @FXML
    Label group2Lbl;

    @FXML
    Label group3Lbl;

    @FXML
    Label group4Lbl;

    @FXML
    Label group5Lbl;

    @FXML
    Label group6Lbl;

    @FXML
    Label lblLang;

    @FXML
    TextArea txtArea1;

    public void initialize(){
        MenuButton mbLang = new MenuButton("Language");

        // create menuitems
        MenuItem m1 = new MenuItem("French");
        MenuItem m2 = new MenuItem("Spanish");
        MenuItem m3 = new MenuItem("Arabic A");

        // add menu items to menu
        mbLang.getItems().add(m1);
        mbLang.getItems().add(m2);
        mbLang.getItems().add(m3);

        EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                lblLang.setText(((MenuItem)e.getSource()).getText());
                System.out.println(lblLang.getText());
            }
        };
        m1.setOnAction(test1);
        m2.setOnAction(event1);
        m3.setOnAction(event1);
    }

    public void test1(){
        lblLang.setText("French");
    }

    public void onClickAddEntry(ActionEvent actionEvent) {
    }
}