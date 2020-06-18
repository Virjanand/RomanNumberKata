package RomanNumber;

import java.util.*;

public class RomanNumber {
    Map<Integer, String> arabicToRoman;

    public RomanNumber() {
        arabicToRoman = new HashMap<>();
        arabicToRoman.put(1, "I");
        arabicToRoman.put(5, "V");
        arabicToRoman.put(10, "X");
        arabicToRoman.put(40, "XL");
        arabicToRoman.put(50, "L");
        arabicToRoman.put(90, "XC");
        arabicToRoman.put(100, "C");
        arabicToRoman.put(400, "CD");
        arabicToRoman.put(500, "D");
        arabicToRoman.put(900, "CM");
        arabicToRoman.put(1000, "M");
    }

    public String toRoman(int arabicNumberToConvert) {
        StringBuilder result = new StringBuilder();
        List<Integer> arabicNumbers = new ArrayList<>(arabicToRoman.keySet());
        arabicNumbers.sort(Comparator.reverseOrder());
        int previousNumber = arabicNumbers.get(0);
        for (Integer arabicNumber : arabicNumbers) {
            if (arabicNumberToConvert + 1 == previousNumber) {
                result.append("I").append(arabicToRoman.get(previousNumber));
                arabicNumberToConvert -= previousNumber - 1;
            } else {
                while (arabicNumberToConvert >= arabicNumber) {
                    result.append(arabicToRoman.get(arabicNumber));
                    arabicNumberToConvert -= arabicNumber;
                }
            }
            previousNumber = arabicNumber;
        }
        return result.toString();
    }
}
