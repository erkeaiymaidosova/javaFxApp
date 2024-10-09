package com.example.javafxapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label myLabel;
    @FXML
    private TextField myText;
    @FXML
    private TextField myText1;
    @FXML
    private void onClickButton(){
        int number=Integer.parseInt(myText.getText());
        int number1=Integer.parseInt(myText1.getText());
        double bmiMetric = number / ((number1 / 100.0) * (number1 / 100.0));
        if(bmiMetric<18.5){
            myLabel.setText(String.valueOf(bmiMetric)+ "-Underweight");
        }else if(bmiMetric>18.5 && bmiMetric<24.9){
            myLabel.setText(String.valueOf(bmiMetric)+ "-Normal");
        }else if(bmiMetric>25 && bmiMetric<29.9){
            myLabel.setText(String.valueOf(bmiMetric)+ "-Overweight");
        }else if(bmiMetric>30){
            myLabel.setText(String.valueOf(bmiMetric)+ "-Obesity");
        }

    }
}
