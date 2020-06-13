package RomanNumber;

import java.util.*;

public class RomanNumber {
    Map<Integer, String> arabicToRoman;

    public RomanNumber() {
        arabicToRoman = new HashMap<>();
        arabicToRoman.put(1, "I");
        arabicToRoman.put(4, "IV");
        arabicToRoman.put(5, "V");
        arabicToRoman.put(9, "IX");
        arabicToRoman.put(10, "X");
        arabicToRoman.put(20, "XX");
    }

    public String toRoman(int arabicNumberToConvert) {
        StringBuilder result = new StringBuilder();
        List<Integer> arabicNumbers = new ArrayList<>(arabicToRoman.keySet());
        arabicNumbers.sort(Comparator.reverseOrder());
        for (Integer arabicNumber : arabicNumbers) {
            while (arabicNumberToConvert >= arabicNumber) {
                result.append(arabicToRoman.get(arabicNumber));
                arabicNumberToConvert -= arabicNumber;
            }
        }
        return result.toString();
    }
}
