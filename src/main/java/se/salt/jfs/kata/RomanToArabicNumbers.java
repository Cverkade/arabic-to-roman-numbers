package se.salt.jfs.kata;

public class RomanToArabicNumbers {

    String romanNumeralValues[] = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
    public int romanToArabicConverter(String str) {

        switch (str){
            case "I": return 1;
            case "IV": return 4;
            case "V": return 5;
            case "IX": return 9;
            case "X": return 10 ;
            case "XL": return 40;
            case "L": return 50;
            case "XC": return 90;
            case "C": return 100;
            case "CD": return 400;
            case "D": return 500;
            case "CM": return 900;
            case "M": return 1000;
        }
        return 0;
    }

    public int calculateNumber(String romanNumber){

        int result = 0;

        for (String romanNumeral: romanNumeralValues) {
            while(romanNumber.endsWith(romanNumeral)){
                result += romanToArabicConverter(romanNumeral);
                romanNumber = romanNumber.substring(0,romanNumber.lastIndexOf(romanNumeral));
            }
        }
        return result;
    }
}
