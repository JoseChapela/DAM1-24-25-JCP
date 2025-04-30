package examen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

public class BonusAssignerTest {
    @Test
    void checkParam() {
        try {
            BonusAssigner.assignBonus(0, 0, false);
            fail();
        }catch(Exception e){}

        try {
            BonusAssigner.assignBonus(1111, 0, false);
            fail();
        }catch(Exception e){}

        try {
            BonusAssigner.assignBonus(1,1111, false);
            fail();
        }catch(Exception e){}
    }
    @Test
    void checkdirectivoAntiguo() {
        assertEquals("P1", BonusAssigner.assignBonus(1, 12, true));
        assertEquals("P1", BonusAssigner.assignBonus(1, 13, true));
    }
    @Test
    void checkNodirectivoAntiguo() {
        assertEquals("P2", BonusAssigner.assignBonus(1, 12, false));
        assertEquals("P2", BonusAssigner.assignBonus(1, 13, false));
    }
    @Test
    void checkdirectivoNoAntiguo() {
        assertEquals("P3", BonusAssigner.assignBonus(1, 1, true));
        assertEquals("P3", BonusAssigner.assignBonus(1, 11, true));
    }
    @Test
    void checkNodirectivoNoAntiguo() {
        assertEquals("P4", BonusAssigner.assignBonus(1, 1, false));
        assertEquals("P4", BonusAssigner.assignBonus(1, 11, false));
    }
}
