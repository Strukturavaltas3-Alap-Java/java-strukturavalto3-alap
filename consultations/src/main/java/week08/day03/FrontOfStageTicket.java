package week08.day03;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FrontOfStageTicket extends Ticket{

    private String code;

    public FrontOfStageTicket(String band, int price, LocalDateTime startTime, String code) {
        super(band, Math.round(price*1.3f), startTime);
        this.code = code;
    }

    @Override
    public LocalTime entryTime() {
        return super.entryTime().minusHours(1);
    }

    public String getCode() {
        return code;
    }
}
