package contornos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AgeClassifier_FIXEDTest {

    @ParameterizedTest
    @CsvSource({"0", "12"})
    void pruebaInfantil(int a) {
        assertEquals("Infantil", AgeClassifier_FIXED.classify(a));
    }

    @ParameterizedTest
    @CsvSource({"13", "17"})
    void pruebaAdolescente(int a) {
        assertEquals("Adolescente", AgeClassifier_FIXED.classify(a));
    }

    @ParameterizedTest
    @CsvSource({"18", "64"})
    void pruebaAdulto(int a) {
        assertEquals("Adulto", AgeClassifier_FIXED.classify(a));
    }

    @ParameterizedTest
    @CsvSource({"65", "120"})
    void pruebaSenior(int a) {
        assertEquals("Senior", AgeClassifier_FIXED.classify(a));
    }

    @ParameterizedTest
    @CsvSource({"-1", "121"})
    void testOutOfRangeClassify(int a) {

        try {

            AgeClassifier_FIXED.classify(a);
            fail("No genera exception");
        } catch (Exception e) {}
    }
}
