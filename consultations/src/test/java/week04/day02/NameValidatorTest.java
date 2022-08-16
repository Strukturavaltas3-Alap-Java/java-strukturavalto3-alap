package week04.day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameValidatorTest {

    NameValidator nameValidator = new NameValidator();

    @Test
    void testIsValidNameMoreParts(){
        assertTrue(nameValidator.isValidName("John Doe"));
    }

    @Test
    void testIsValidNameOnePart(){
        assertFalse(nameValidator.isValidName("Madonna"));
    }

    @Test
    void testIsValidNameUpperCaseParts(){
        assertTrue(nameValidator.isValidName("John T. Doe"));
    }

    @Test
    void testIsValidNameLowerCasePart(){
        assertFalse(nameValidator.isValidName("John doe"));
    }
}