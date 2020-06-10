package RomanNumber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumberTest {

    @ParameterizedTest(name = "{0} -> {1}")
    @CsvSource({
            "1, I",
            "2, II",
            "5, V"
    })
    void oneGivesI(int arabicNumber, String expectedRomanNumber) {
        RomanNumber romanNumber = new RomanNumber();
        assertEquals(expectedRomanNumber, romanNumber.toRoman(arabicNumber));
    }

}
