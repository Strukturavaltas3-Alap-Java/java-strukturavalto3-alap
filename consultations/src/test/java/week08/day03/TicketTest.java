package week08.day03;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {


    @Test
    void testCreateTicket(){
        Ticket ticket = new Ticket("RHCP",25_000, LocalDateTime.of(2022,11,11,21,0));

        assertEquals("RHCP",ticket.getBand());
        assertEquals(25_000,ticket.getPrice());
    }


    @Test
    void testEntryTime(){
        Ticket ticket = new Ticket("RHCP",25_000, LocalDateTime.of(2022,11,11,21,0));

        assertEquals(LocalTime.of(20,0),ticket.entryTime());
    }

}