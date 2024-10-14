package com.example.javafxapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.text.DecimalFormat;

public class HelloController {
    @FXML
    private Label myLabel;
    @FXML
    private Label text1;
    @FXML
    private Label text2;
    @FXML
    private TextField myText;
    @FXML
    private TextField myText1;
    @FXML
    private TextField myText2;
    @FXML
    private TextField myText3;
    DecimalFormat df = new DecimalFormat("#.##");
    @FXML
    private void onClickButton(){
        int number=Integer.parseInt(myText.getText());
        int number1=Integer.parseInt(myText1.getText());
        double bmiMetric = number / ((number1 / 100.0) * (number1 / 100.0));
        if(bmiMetric<18.5){
            text1.setText(String.valueOf(df.format(bmiMetric)+ "-Underweight"));
        }else if(bmiMetric>18.5 && bmiMetric<24.9){
            text1.setText(String.valueOf(df.format(bmiMetric)+ "-Normal"));
        }else if(bmiMetric>25 && bmiMetric<29.9){
            text1.setText(String.valueOf(df.format(bmiMetric)+ "-Overweight"));
        }else if(bmiMetric>30){
            text1.setText(String.valueOf(df.format(bmiMetric)+ "-Obesity"));
        }
    }
    @FXML
    private void onClickButton1(){
        int number2=Integer.parseInt(myText2.getText());
        int number3=Integer.parseInt(myText3.getText());
        double bmiEnglish = number2*703.0 /(number3*number3);

        if(bmiEnglish<18.5){
            text2.setText(String.valueOf(df.format(bmiEnglish)+ "-Underweight"));
        }else if(bmiEnglish>18.5 && bmiEnglish<24.9){
            text2.setText(String.valueOf(df.format(bmiEnglish)+ "-Normal"));
        }else if(bmiEnglish>25 && bmiEnglish<29.9){
            text2.setText(String.valueOf(df.format(bmiEnglish)+ "-Overweight"));
        }else if(bmiEnglish>30){
            text2.setText(String.valueOf(df.format(bmiEnglish)+ "-Obesity"));
        }

    }
}
