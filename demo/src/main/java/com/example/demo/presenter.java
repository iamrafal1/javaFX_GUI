package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class presenter {
    @FXML
    private TextField email_field;
    @FXML
    private TextField password_field;
    @FXML
    private Label result;


    @FXML
    protected void onSubmitButtonClick() {

        String email = email_field.getText();
        String password = password_field.getText();

        if (!model.checkEmail(email)) {
            result.setText("Email format is incorrect!");
        }

        else if (!model.checkPassword(password)){
            result.setText("Password is not strong enough!");
        }
        else{
            result.setText("Account created successfully!");
        }

    }
}