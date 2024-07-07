package com.example.demo2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class physics_project extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group() ;

        Circle circle = new Circle(300, 300, 100);
        circle.setStroke(Color.RED);
        circle.setStrokeWidth(4);
        circle.setFill(Color.TRANSPARENT) ;

        int lineCount = 16;

        for (int i = 0; i < lineCount; i++) {
            double angle = 2 * Math.PI * i / lineCount ;
            double x1 = 300 + 80 * Math.cos(angle) ;
            double y1 = 300 + 80 * Math.sin(angle) ;
            double x2 = 300 + 150 * Math.cos(angle) ;
            double y2 = 300 + 150 * Math.sin(angle) ;
            Line line = new Line(x1, y1, x2, y2) ;
            line.setStroke(Color.BLUE) ;
            root.getChildren().add(line) ;


        }
        root.getChildren().add(circle) ;

        Text northPole = new Text(295, 170, "N") ;
        northPole.setFill(Color.RED) ;

        Text southPole = new Text(295, 435, "S") ;
        southPole.setFill(Color.RED) ;

        Text westPole = new Text(150, 305, "W") ;
        westPole.setFill(Color.RED) ;

        Text eastPole = new Text(440, 305, "E") ;
        eastPole.setFill(Color.RED) ;

        root.getChildren().addAll(northPole, southPole, westPole, eastPole);

        Text nameText = new Text(250, 580, "sadra ghofran");
        nameText.setFill(Color.GREEN);

        root.getChildren().add(nameText);

        Scene scene = new Scene(root, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}