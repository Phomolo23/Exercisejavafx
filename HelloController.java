package com.example.increament;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class HelloController {

    @FXML
    private Button decreament;

    @FXML
    private AnchorPane display;

    @FXML
    private TextField field_TXT;

    int num=0;

    @FXML
    void ActionDecreament(ActionEvent event) {
          if (field_TXT.getText().isBlank()){
              num=num--;
              field_TXT.setText(String.valueOf(num));
          }else {
              num = Integer.parseInt(field_TXT.getText());
              num = num-1;
              field_TXT.setText(String.valueOf(num));
          }
    }

    @FXML
    void ActionIncreament(ActionEvent event) {
        if (field_TXT.getText().isBlank()){
            num=num++;
            field_TXT.setText(String.valueOf(num));
        }else {
            num = Integer.parseInt(field_TXT.getText());
            num = num+1;
            field_TXT.setText(String.valueOf(num));
        }
    }
}