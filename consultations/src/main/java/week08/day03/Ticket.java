package week08.day03;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {

    private String band;
    private int price;
    private LocalDateTime startTime;

    public Ticket(String band, int price, LocalDateTime startTime) {
        this.band = band;
        this.price = price;
        this.startTime = startTime;
    }

    public LocalTime entryTime(){
        return LocalTime.of(startTime.getHour(),startTime.getMinute()).minusHours(1);
    }


    public String getBand() {
        return band;
    }

    public int getPrice() {
        return price;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }
}
