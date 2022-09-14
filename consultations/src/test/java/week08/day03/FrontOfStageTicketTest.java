package week08.day03;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class FrontOfStageTicketTest {


    @Test
    void createFrontOfStageTicket(){
        FrontOfStageTicket frontOfStageTicket = new FrontOfStageTicket("RHCP",
                25_000,
                LocalDateTime.of(2022,11,11,21,0),
                "XC567821");

        assertEquals("XC567821",frontOfStageTicket.getCode());
    }

    @Test
    void createFrontOfStageTicketAsTicket(){
        Ticket frontOfStageTicket = new FrontOfStageTicket("RHCP",
                25_000,
                LocalDateTime.of(2022,11,11,21,0),
                "XC567821");

        assertEquals("RHCP",frontOfStageTicket.getBand());
        assertEquals(32_500,frontOfStageTicket.getPrice());
    }
    @Test
    void testEntryTime(){
        Ticket frontOfStageTicket = new FrontOfStageTicket("RHCP",
                25_000,
                LocalDateTime.of(2022,11,11,21,0),
                "XC567821");

        assertEquals(LocalTime.of(19,0),frontOfStageTicket.entryTime());
    }

}