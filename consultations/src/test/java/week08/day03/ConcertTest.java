package week08.day03;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class ConcertTest {


    @Test
    void testAddValidPersonToConcert() {
        Concert concert = new Concert();
        Ticket ticket = new Ticket("RHCP", 25_000, LocalDateTime.of(2022, 11, 11, 21, 0));

        concert.addPerson(new Person(ticket), LocalTime.of(20, 1));

        assertEquals(1, concert.getAudience().size());
    }


    @Test
    void testAddInvalidPersonToConcert() {
        Concert concert = new Concert();
        FrontOfStageTicket frontOfStageTicket = new FrontOfStageTicket("RHCP",
                25_000,
                LocalDateTime.of(2022, 11, 11, 21, 0),
                "XC567821");

       assertThrows(IllegalArgumentException.class,
               ()->concert.addPerson(new Person(frontOfStageTicket), LocalTime.of(18, 59)));
    }

}