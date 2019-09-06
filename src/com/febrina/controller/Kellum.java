package com.febrina.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import java.text.DecimalFormat;

/**
 * @author Febrina Anastasha 1772006
 * Class Kellum
 */

public class Kellum {
    public TextField txtLength;
    public TextField txtWidth;
    public TextField txtRadius;
    public TextField txtHeight;
    public double hasilKel=0;
    public double hasilLum=0;
    public double hasilLuas=0;
    public double hasilLuasPerm=0;
    public String bangunRuang="";
    DecimalFormat df2 = new DecimalFormat(".##");

    /**
     * @author Febrina Anastasha 1772006
     * Class Square
     */

    public void Square(ActionEvent actionEvent) {
        txtRadius.setDisable(true);
        txtHeight.setDisable(true);
        txtLength.setDisable(false);
        txtWidth.setDisable(false);
        bangunRuang = "Square";

    }

    /**
     * @author Febrina Anastasha 1772006
     * Class Ball
     */

    public void Ball(ActionEvent actionEvent) {
        txtWidth.setDisable(true);
        txtHeight.setDisable(true);
        txtLength.setDisable(true);
        txtRadius.setDisable(false);
        bangunRuang = "Ball";

    }

    /**
     * @author Febrina Anastasha 1772006
     * Class Tube
     */

    public void Tube(ActionEvent actionEvent) {
        txtWidth.setDisable(true);
        txtLength.setDisable(true);
        txtRadius.setDisable(false);
        txtHeight.setDisable(false);
        bangunRuang = "Tube";

    }

    /**
     * @author Febrina Anastasha 1772006
     * Class Submit
     */

    public void Submit(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        if(bangunRuang.contains("Tube") )
        {
            hasilLuasPerm= 2*3.14*Double.valueOf(txtRadius.getText())*Double.valueOf(txtRadius.getText());
            hasilLum=3.14*(Double.valueOf(txtHeight.getText())*Double.valueOf(txtRadius.getText())*Double.valueOf(txtRadius.getText()));
            alert.setContentText("Surface Area: "+df2.format(hasilLuasPerm)+" Volume: "+df2.format(hasilLum));
            alert.show();
    }
        else if(bangunRuang.contains("Ball") )
        {
            hasilLuasPerm= 4*(Double.valueOf(txtRadius.getText())*Double.valueOf(txtRadius.getText()))*3.14;
            hasilLum=4/3*(Double.valueOf(txtRadius.getText())*Double.valueOf(txtRadius.getText())*Double.valueOf(txtRadius.getText()))*3.14;
            alert.setContentText("Surface Area: "+df2.format(hasilLuasPerm)+" Volume: "+df2.format(hasilLum));
            alert.show();
        }
        else if(bangunRuang.contains("Square") )
        {
            hasilLuas= Double.valueOf(txtWidth.getText())*Double.valueOf(txtLength.getText());
            hasilKel=2*(Double.valueOf(txtWidth.getText())+Double.valueOf(txtLength.getText()));
            alert.setContentText("Area: "+df2.format(hasilLuas)+" Circumference: "+df2.format(hasilKel));
            alert.show();
        }

    }
}
