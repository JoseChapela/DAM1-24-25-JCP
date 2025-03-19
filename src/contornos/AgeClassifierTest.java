package contornos;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AgeClassifierTest {
    @Test
    void testClassify() {

        assertEquals("Infantil", AgeClassifier.classify(1));
        assertEquals("Adolescente", AgeClassifier.classify(13));
        assertEquals("Adulto", AgeClassifier.classify(23));
        assertEquals("Senior", AgeClassifier.classify(73));
    }

    @Test
    void testOutOfRangeClassify() {

        try {

            AgeClassifier.classify(-1);
            fail("No genera exception");
        } catch (Exception e) {}

        try {

            AgeClassifier.classify(121);
            fail("No genera exception");
        } catch (Exception e) {}
    }

}
