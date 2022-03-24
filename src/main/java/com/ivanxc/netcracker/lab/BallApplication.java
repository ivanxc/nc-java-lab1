package com.ivanxc.netcracker.lab;

import com.ivanxc.netcracker.lab.test.LabTest;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BallApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
            getClass().getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 440);
        stage.setTitle("Ball in container");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        // Запуск JavaFX
        launch();
//        LabTest.circleTest();
//        LabTest.rectangleTest();
//        LabTest.employeeTest();
//        LabTest.bookTest();
//        LabTest.myPointTest();
//        LabTest.myTriangleTest();
//        LabTest.myComplexTest();
//        LabTest.myPolynomialTest();
//        LabTest.ballTest();
    }
}