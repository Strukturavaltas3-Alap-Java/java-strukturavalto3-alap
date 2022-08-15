package week03.day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {

    @Test
    void createPlane() {
        Plane plane = new Plane(180);

        assertEquals(180, plane.getMaxCapacity());
    }

    @Test
    void testAddPassengerCanSit() {
        Plane plane = new Plane(180); //Given


        //Then
        assertTrue(plane.addPassenger(new Passenger("John", "FK8921", 2)));
        assertEquals(1, plane.getPassengers().size());
        assertEquals("FK8921", plane.getPassengers().get(0).getTicketId());
    }

    @Test
    void testAddPassengerCannotSit() {
        Plane plane = new Plane(1);
        plane.addPassenger(new Passenger("John Doe", "JK987", 1));

        boolean result = plane.addPassenger(new Passenger("Jane", "9872hjs", 1));

        assertFalse(result);
        assertEquals(1, plane.getPassengers().size());
    }

    @Test
    void testNumberOfPackagesEmptyPlane() {
        Plane plane = new Plane(134);

        assertEquals(0, plane.numberOfPackages());
    }

    @Test
    void  testNumberOfPackages(){
        Plane plane = new Plane(134);
        plane.addPassenger(new Passenger("John Doe","GH78",2));
        plane.addPassenger(new Passenger("Jane Doe","GH79",0));
        plane.addPassenger(new Passenger("Jack Doe","GH710",1));

        assertEquals(3, plane.numberOfPackages());
    }

}