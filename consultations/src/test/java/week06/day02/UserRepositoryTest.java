package week06.day02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {


    UserRepository userRepository = new UserRepository(Arrays.asList(
            new User("john", "john@gmail.com"),
            new User("jack", "jack@gmail.com"),
            new User("jane", "jane@gmail.com")
    ));


    @Test
    void testFindUserByUsername(){
        User result = userRepository.findUserByUsername("jack");

        assertEquals(result.getEmail(),"jack@gmail.com");
    }

    @Test
    void testFindUserByUserNameNotFound(){
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                ()->userRepository.findUserByUsername("johnny"),
                "Cannot find user with username:johnny");

       // assertEquals("Cannot find user with username:johnny", iae.getMessage());
    }


}