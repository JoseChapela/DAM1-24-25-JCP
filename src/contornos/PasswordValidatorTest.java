package contornos;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {
    @Test
    void testIsValid() {

        assertEquals(true, PasswordValidator.isValid("Holamun1"));
        assertEquals(true, PasswordValidator.isValid("HOlamu11"));
        assertEquals(false, PasswordValidator.isValid("holamund"));
        assertEquals(false, PasswordValidator.isValid("Holamund"));
        assertEquals(false, PasswordValidator.isValid("holamun1"));
        assertEquals(false, PasswordValidator.isValid("Holamu1"));
    }
}
