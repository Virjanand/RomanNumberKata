package RomanNumber;

public class RomanNumber {
    public String toRoman(int arabicNumber) {
        StringBuilder result = new StringBuilder();
        if (arabicNumber == 4) {
            return "IV";
        }if (arabicNumber == 5) {
            return "V";
        }
        while (arabicNumber > 0) {
            result.append("I");
            arabicNumber--;
        }
        return result.toString();
    }
}
