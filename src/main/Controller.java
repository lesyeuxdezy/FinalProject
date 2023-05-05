package main;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    // input the current time
    TheTime time = new TheTime("12:0:0");


    @FXML
    private Text timer;

    @FXML
    private TextField alarmTime;

    // input the timeline overview
    Timeline timeline = new Timeline(
            new KeyFrame(Duration.seconds(0.005),
                    e -> {
                        if(time.getCurrentTime().equals(alarmTime.getText())){

                            System.out.println("TIME'S UP!");
                        }
                        time.oneSecondPassed();
                        timer.setText(time.getCurrentTime());
                    }));

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        timer.setText(time.getCurrentTime());

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
}