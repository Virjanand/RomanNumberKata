package RomanNumber;

import java.util.HashMap;
import java.util.Map;

public class RomanNumber {
    Map<Integer, String> arabicToRoman;

    public RomanNumber() {
        arabicToRoman = new HashMap<>();
        arabicToRoman.put(1, "I");
        arabicToRoman.put(4, "IV");
        arabicToRoman.put(5, "V");
        arabicToRoman.put(9, "IX");
        arabicToRoman.put(10, "X");
    }

    public String toRoman(int arabicNumberToConvert) {
        StringBuilder result = new StringBuilder();
        for (Integer arabicNumber : arabicToRoman.keySet()) {
            if (arabicNumberToConvert == arabicNumber) {
                return arabicToRoman.get(arabicNumber);
            }
        }
        while (arabicNumberToConvert > 0) {
            result.append("I");
            arabicNumberToConvert--;
        }
        return result.toString();
    }
}
