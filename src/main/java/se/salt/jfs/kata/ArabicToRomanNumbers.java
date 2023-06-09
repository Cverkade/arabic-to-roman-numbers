package se.salt.jfs.kata;

public class ArabicToRomanNumbers {

    int ArabicNumeralValues[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

    public String arabicToRomanConverter(int num) {

        switch (num){
            case 1: return "I";
            case 4: return "IV";
            case 5: return "V";
            case 9: return "IX";
            case 10: return "X";
            case 40: return "XL";
            case 50: return "L";
            case 90: return "XC";
            case 100: return "C";
            case 400: return "CD";
            case 500: return "D";
            case 900: return "CM";
            case 1000: return "M";
        }
        return null;
    }

    public String calculateNumber(int arabicNumber){

        String result = new String();

        for (int arabicNumeralValue: ArabicNumeralValues) {
            while (arabicNumber >= arabicNumeralValue){
                result += arabicToRomanConverter(arabicNumeralValue);
                arabicNumber -= arabicNumeralValue;
            }
        }
        return result;
    }
}
