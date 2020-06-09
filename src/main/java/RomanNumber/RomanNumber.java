package RomanNumber;

public class RomanNumber {
    public String toRoman(int arabicNumber) {
        StringBuilder result = new StringBuilder();
        while (arabicNumber > 0) {
            result.append("I");
            arabicNumber--;
        }
        return result.toString();
    }
}
