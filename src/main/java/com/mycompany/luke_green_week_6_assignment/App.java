package com.mycompany.luke_green_week_6_assignment;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;


public class App extends Application {

    @Override
    public void start(Stage stage) {

        var label = new Label("A House");
        int sizeDoors = 3;
        Rectangle[] doors = new Rectangle[sizeDoors];
        int sizeSteps = 11;
        Rectangle[] steps = new Rectangle[sizeSteps];
        int sizeSpots = 10;
        Rectangle[] spots1 = new Rectangle[sizeSpots];
        Rectangle[] spots2 = new Rectangle[sizeSpots];
        Rectangle[] spots3 = new Rectangle[sizeSpots];
        
        //backround grass color
        Rectangle grass = new Rectangle(0, 335, 9999, 9999);
        grass.setFill(Color.LIMEGREEN);

        //this is the brown background for the house
        Rectangle base = new Rectangle();
        base.setX(110);
        base.setY(200);
        base.setFill(Color.BROWN);
        base.setHeight(400);
        base.setWidth(550);
        //this adds the outline to all shapes added
        base.setStroke(Color.BLACK);
        base.setStrokeWidth(2);
        
        
        //this is the bsae of the roof
        Rectangle roofBase = new Rectangle(110, 175, 550, 25);
        roofBase.setFill(Color.WHITE);
        roofBase.setStroke(Color.BLACK);
        roofBase.setStrokeWidth(2);
        
        
        //this is the roof itself
        Polygon roof = new Polygon();
        roof.getPoints().addAll(new Double[]{
            387.5, 0.0,
            70.0, 175.0,
            700.0, 175.0 });
        roof.setFill(Color.WHITE);
        roof.setStroke(Color.BLACK);
        roof.setStrokeWidth(2);
        
        
        //the gray rectangle above the doors
        Rectangle plack = new Rectangle(346, 230, 80, 50);
        plack.setFill(Color.LIGHTGRAY);
        plack.setStroke(Color.BLACK);
        plack.setStrokeWidth(2);
        
        
        //thiese are for the doors
        Rectangle door1 = new Rectangle(346, 335, 80, 185);
        door1.setFill(Color.WHITE);
        door1.setStroke(Color.BLACK);
        door1.setStrokeWidth(2);
        
        Rectangle door2 = new Rectangle(188, 365, 80, 155);
        door2.setFill(Color.WHITE);
        door2.setStroke(Color.BLACK);
        door2.setStrokeWidth(2);
        
        Rectangle door3 = new Rectangle(502, 365, 80, 155);
        door3.setFill(Color.WHITE);
        door3.setStroke(Color.BLACK);
        door3.setStrokeWidth(2);
        
        
        //these are the pillars on the house
        Rectangle pillar1 = new Rectangle(124, 200, 50, 320);
        pillar1.setFill(Color.WHITE);
        pillar1.setStroke(Color.BLACK);
        pillar1.setStrokeWidth(2);

        Rectangle pillar2 = new Rectangle(283, 200, 50, 320);
        pillar2.setFill(Color.WHITE);
        pillar2.setStroke(Color.BLACK);
        pillar2.setStrokeWidth(2);

        Rectangle pillar3 = new Rectangle(439, 200, 50, 320);
        pillar3.setFill(Color.WHITE);
        pillar3.setStroke(Color.BLACK);
        pillar3.setStrokeWidth(2);
        
        Rectangle pillar4 = new Rectangle(596, 200, 50, 320);
        pillar4.setFill(Color.WHITE);
        pillar4.setStroke(Color.BLACK);
        pillar4.setStrokeWidth(2);
        
        
        //these are the white rectangles under the pillars
        Rectangle support1 = new Rectangle(114, 505, 70, 15);
        support1.setFill(Color.WHITE);
        support1.setStroke(Color.BLACK);
        support1.setStrokeWidth(2);
        
        Rectangle support2 = new Rectangle(273, 505, 70, 15);
        support2.setFill(Color.WHITE);
        support2.setStroke(Color.BLACK);
        support2.setStrokeWidth(2);
        
        Rectangle support3 = new Rectangle(429, 505, 70, 15);
        support3.setFill(Color.WHITE);
        support3.setStroke(Color.BLACK);
        support3.setStrokeWidth(2);
        
        Rectangle support4 = new Rectangle(586, 505, 70, 15);
        support4.setFill(Color.WHITE);
        support4.setStroke(Color.BLACK);
        support4.setStrokeWidth(2);
        
        
        //small gray supports under pillar supports
        Rectangle pilSupport1 = new Rectangle(110, 520, 74, 7);
        pilSupport1.setFill(Color.LIGHTGRAY);
        pilSupport1.setStroke(Color.BLACK);
        pilSupport1.setStrokeWidth(2);
        
        Rectangle pilSupport2 = new Rectangle(586, 520, 74, 7);
        pilSupport2.setFill(Color.LIGHTGRAY);
        pilSupport2.setStroke(Color.BLACK);
        pilSupport2.setStrokeWidth(2);
        
        
        //this will add the circles at the top of the pillars
        Circle c1 = new Circle(124, 214, 14);
        c1.setFill(Color.WHITE);
        c1.setStroke(Color.BLACK);
        c1.setStrokeWidth(2);
        
        Circle c2 = new Circle(174, 214, 14);
        c2.setFill(Color.WHITE);
        c2.setStroke(Color.BLACK);
        c2.setStrokeWidth(2);
        
        Circle c3 = new Circle(283, 214, 14);
        c3.setFill(Color.WHITE);
        c3.setStroke(Color.BLACK);
        c3.setStrokeWidth(2);
        
        Circle c4 = new Circle(333, 214, 14);
        c4.setFill(Color.WHITE);
        c4.setStroke(Color.BLACK);
        c4.setStrokeWidth(2);
        
        Circle c5 = new Circle(439, 214, 14);
        c5.setFill(Color.WHITE);
        c5.setStroke(Color.BLACK);
        c5.setStrokeWidth(2);
        
        Circle c6 = new Circle(489, 214, 14);
        c6.setFill(Color.WHITE);
        c6.setStroke(Color.BLACK);
        c6.setStrokeWidth(2);
        
        Circle c7 = new Circle(596, 214, 14);
        c7.setFill(Color.WHITE);
        c7.setStroke(Color.BLACK);
        c7.setStrokeWidth(2);
        
        Circle c8 = new Circle(646, 214, 14);
        c8.setFill(Color.WHITE);
        c8.setStroke(Color.BLACK);
        c8.setStrokeWidth(2);
        
        
        Group gp = new Group(grass, base, roofBase, roof, plack, door1, door2, door3, pillar1, pillar2, pillar3, pillar4, support1, support2,
                support3, support4, pilSupport1, pilSupport2, c1, c2, c3, c4, c5, c6, c7, c8);
        
        
        //this will add the steps infront of the house using a loop
        for(int i = 0; i<sizeSteps;i++) {
            steps[i] = new Rectangle(184 - (i * 14), 520 + (i * 12), 402 + (i * 28), 12);
            steps[i].setFill(Color.LIGHTGRAY);
            steps[i].setStroke(Color.BLACK);
            steps[i].setStrokeWidth(2);
        }
        gp.getChildren().addAll(steps);
        
        
        //these are the black spots on the first door
        for(int i = 0; i<sizeSpots;i++) {
          if (i < 2) {
          spots1[i] = new Rectangle(202 + (i%2) * 36, 375 + (i/2) * 30, 15, 14);
            spots1[i].setFill(Color.BLACK);
            spots1[i].setStroke(Color.BLACK);
            spots1[i].setStrokeWidth(2);
          }
          else {
          spots1[i] = new Rectangle(202 + (i%2) * 36, 370 + (i/2) * 30, 15, 21);
            spots1[i].setFill(Color.BLACK);
            spots1[i].setStroke(Color.BLACK);
            spots1[i].setStrokeWidth(2);
          }
        }
        gp.getChildren().addAll(spots1);
       
        //these are the black spots on the second door
        for(int i = 0; i<sizeSpots;i++) {
          if (i < 2) {
          spots2[i] = new Rectangle(360 + (i%2) * 36, 375 + (i/2) * 30, 15, 14);
            spots2[i].setFill(Color.BLACK);
            spots2[i].setStroke(Color.BLACK);
            spots2[i].setStrokeWidth(2);
          }
          else {
          spots2[i] = new Rectangle(360 + (i%2) * 36, 370 + (i/2) * 30, 15, 21);
            spots2[i].setFill(Color.BLACK);
            spots2[i].setStroke(Color.BLACK);
            spots2[i].setStrokeWidth(2);
          }
        }
        gp.getChildren().addAll(spots2);
         
        //these are the black spots on the third door
        for(int i = 0; i<sizeSpots;i++) {
          if (i < 2) {
          spots3[i] = new Rectangle(516 + (i%2) * 36, 375 + (i/2) * 30, 15, 14);
            spots3[i].setFill(Color.BLACK);
            spots3[i].setStroke(Color.BLACK);
            spots3[i].setStrokeWidth(2);
          }
          else {
          spots3[i] = new Rectangle(516 + (i%2) * 36, 370 + (i/2) * 30, 15, 21);
            spots3[i].setFill(Color.BLACK);
            spots3[i].setStroke(Color.BLACK);
            spots3[i].setStrokeWidth(2);
          }
        }
        gp.getChildren().addAll(spots3);
        
        
        var scene = new Scene(gp, 775, 726);
        //this is the background colors
        scene.setFill(Color.PALETURQUOISE);
        
        stage.setScene(scene);
        stage.setTitle("A House");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}