package RomanNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumberTest {

    @Test
    void oneGivesI() {
        RomanNumber romanNumber = new RomanNumber();
        assertEquals("I", romanNumber.toRoman(1));
    }

    @Test
    void twoGivesII() {
        RomanNumber romanNumber = new RomanNumber();
        assertEquals("II", romanNumber.toRoman(2));
    }
}
