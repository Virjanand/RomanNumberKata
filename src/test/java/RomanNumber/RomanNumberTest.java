package RomanNumber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumberTest {

    @ParameterizedTest(name = "{0} -> {1}")
    @CsvSource({
            "1, I",
            "2, II",
            "4, IV",
            "5, V",
            "7, VII",
            "9, IX",
            "10, X",
            "19, XIX",
            "20, XX",
            "40, XL",
            "50, L",
            "90, XC",
            "100, C",
            "400, CD",
            "500, D",
            "900, CM",
            "1000, M",
            "1984, MCMLXXXIV",
    })
    void oneGivesI(int arabicNumber, String expectedRomanNumber) {
        RomanNumber romanNumber = new RomanNumber();
        assertEquals(expectedRomanNumber, romanNumber.toRoman(arabicNumber));
    }
}
