package week06.day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourierTest {

    Courier courier = new Courier();

    @Test
    void testAddRideEmptyListOkRide(){
        courier.addRide(new Ride(1,1,5));
        assertEquals(1, courier.getRides().size());

    }

    @Test
    void testAddRideEmptyListOkRideNotStartWithOne(){
        courier.addRide(new Ride(4,1,5));
        assertEquals(1, courier.getRides().size());
    }

    @Test
    void testAddRideEmptyListWrongRide(){
        assertThrows(IllegalArgumentException.class,()->courier.addRide(new Ride(1,2,3)));
    }

}