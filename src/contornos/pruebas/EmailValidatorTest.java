package contornos.pruebas;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class EmailValidatorTest {
    
    @Test
    void checkCorrecto() {
        assertEquals(true, EmailValidator.isValid("a@."));
    }

    @Test
    void checkIsNull() {
        assertEquals(false, EmailValidator.isValid(null));
    }

    @Test
    void checkNoContieneUnArroba() {
        assertEquals(false, EmailValidator.isValid("a."));
    }

    @Test
    void checkSinPuntoEnDominio() {
        assertEquals(false, EmailValidator.isValid("a@"));
    }

    @Test
    void checkSinVacioEnNombre() {
        assertEquals(false, EmailValidator.isValid("@."));
    }
}

