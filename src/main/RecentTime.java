package main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RecentTime {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:MM:SS");
    LocalDateTime now = LocalDateTime.now();

    public RecentTime(){
    }

    public String currentTime(){
        return dtf.format(now);
    }
}