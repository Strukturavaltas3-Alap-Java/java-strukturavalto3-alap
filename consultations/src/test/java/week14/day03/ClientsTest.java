package week14.day03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientsTest {

    Clients clients = new Clients();

    @BeforeEach
    void init(){
        clients.addClient(new Client("John","1"));
        clients.addClient(new Client("Jack","4"));
        clients.addClient(new Client("Jane","3"));
        clients.addClient(new Client("Jill","2"));
        clients.addClient(new Client("Jasmine","5"));
    }

    //BinarySearch
    @Test
    void testFindByRegNumber(){
        Client client = clients.findClientByRegNumber("3");

        assertEquals("Jane",client.getName());
    }

    //IndexOf
//    @Test
//    void testFindByRegNumberIndexOf(){
//        Client client = clients.findByRegNumberIndexOf("3");
//
//        assertEquals("Jane",client.getName());
//    }

    @Test
    void testFindByRegNumberOwnBinary(){
        Client client = clients.findByRegNumberOwnBinarySearch("3");

        assertEquals("Jane",client.getName());
    }


}