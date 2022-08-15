package week03.day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    @Test
    void createPassenger(){
        Passenger passenger = new Passenger("John Doe","FK123",3); //Given

        assertEquals("John Doe",passenger.getName());
        assertEquals("FK123",passenger.getTicketId());
        assertEquals(3,passenger.getNumberOfLuggage());
    }


}