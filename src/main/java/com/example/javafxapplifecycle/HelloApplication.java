package com.example.javafxapplifecycle;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        System.out.println("Start begins");

        stage.setTitle("Life Cycle");

        FlowPane rootFlowPane = new FlowPane(Orientation.VERTICAL, 5, 5);
        rootFlowPane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(rootFlowPane, 700, 400);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void init() throws Exception {
        super.init();
        System.out.println("Init begins");
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        System.out.println("Stop begins");
    }

    public static void main(String[] args) {
        launch();
    }
}