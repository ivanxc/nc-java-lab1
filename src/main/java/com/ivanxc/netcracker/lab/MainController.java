package com.ivanxc.netcracker.lab;

import com.ivanxc.netcracker.lab.parttwo.Ball;
import com.ivanxc.netcracker.lab.parttwo.Container;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class MainController implements Initializable {

    @FXML
    private Label leftTopCoordinates;

    @FXML
    private Label rightBottomCoordinates;

    @FXML
    private AnchorPane scene;

    @FXML
    private Rectangle rectangle;

    @FXML
    private TextField x;

    @FXML
    private TextField y;

    @FXML
    private TextField radius;

    @FXML
    private TextField speed;

    @FXML
    private TextField direction;

    Container container;
    Map<Ball, Circle> balls = new HashMap<>();

    Timeline timeline = new Timeline(new KeyFrame(Duration.millis(100), new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
            List<Ball> ballsToDelete = new LinkedList<>();

            for(Entry ballCircle : balls.entrySet()) {
                Ball ball = (Ball) ballCircle.getKey();
                Circle circle = (Circle) ballCircle.getValue();
                if (!container.collides(ball)) {
                    ballsToDelete.add(ball);
                    continue;
                }
                checkPosition(ball, container);
                ball.move();

                circle.setCenterX(ball.getX());
                circle.setCenterY(ball.getY());
            }

            for(Ball ball : ballsToDelete) {
                scene.getChildren().remove(balls.get(ball));
                balls.remove(ball);
            }
        }
    }));


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        container = new Container((int)rectangle.getLayoutX(), (int)rectangle.getLayoutY(),
            (int)(rectangle.getWidth()), (int)(rectangle.getHeight()));
        leftTopCoordinates.setText("(" + container.getX() + "," + container.getY() + ")");
        rightBottomCoordinates.setText("(" + (container.getX() + container.getWidth()) + "," +
            (container.getY() + container.getHeight()) + ")");
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    public void addBall(ActionEvent actionEvent) {
        int x = Integer.parseInt(this.x.getText());
        int y = Integer.parseInt(this.y.getText());
        int radius = Integer.parseInt(this.radius.getText());
        int speed = Integer.parseInt(this.speed.getText());
        int direction = Integer.parseInt(this.direction.getText());
        Ball ball = new Ball(x, y, radius, speed, direction);
        Circle circle = new Circle(ball.getX(), ball.getY(), radius);
        circle.toFront();
        Color randomColor = Color.rgb((int)(Math.random() * 255),
            (int)(Math.random() * 255), (int)(Math.random() * 255));
        circle.setFill(randomColor);
        scene.getChildren().add(circle);
        balls.put(ball, circle);
    }

    public void checkPosition(Ball ball, Container container) {
        float newX = ball.getX() + ball.getXDelta();
        float newY = ball.getY() + ball.getYDelta();

        float extremePointLeft = newX - ball.getRadius();
        float extremePointRight = newX + ball.getRadius();
        float extremePointTop = newY - ball.getRadius();
        float extremePointBottom = newY + ball.getRadius();
        if (extremePointLeft <= container.getX() ||
            extremePointRight >= container.getX() + container.getWidth()) {
            ball.reflectHorizontal();
        }
        if (extremePointTop <= container.getY() ||
            extremePointBottom >= container.getY() + container.getHeight()) {
            ball.reflectVertical();
        }
    }
}