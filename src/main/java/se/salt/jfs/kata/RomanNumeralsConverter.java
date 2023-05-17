package se.salt.jfs.kata;

public class RomanNumeralsConverter {

    public String arabicToRomanConverter(int num) {

        switch (num){
            case 1: return "I";
            case 5: return "V";
            case 10: return "X";
            case 50: return "L";
            case 100: return "C";
            case 500: return "D";
            case 1000: return "M";
        }
        return null;
    }

    public String oneDigitArabicToRomanConverter( int num , int powerTen) {
        String result = "" ;
        int multiplyToPowerTen =  (int) Math.pow(10,powerTen) ;
        int remainder = num % (5* multiplyToPowerTen) ;
        int divisor =  num /(5 * multiplyToPowerTen);


        if(  remainder == (4*multiplyToPowerTen) ) {
            result += arabicToRomanConverter((1*multiplyToPowerTen)) ;
            if( divisor > 0) {
                result += arabicToRomanConverter( (10*multiplyToPowerTen) );
            }else {
                result += arabicToRomanConverter( (5*multiplyToPowerTen)) ;
            }
        }else {
            if ( divisor > 0 ){
                result += arabicToRomanConverter( (5*multiplyToPowerTen)) ;
            }
            for( int i= remainder/multiplyToPowerTen ; i > 0 ; i--){
                result += arabicToRomanConverter((1* multiplyToPowerTen)) ;
            }
        }
        return result ;
    }

    public  String separateDigit( int number) {
        String result = "" ;
        int length = String.valueOf(number).length() ;
        for( int i = length -1  ; i >= 0  ; i--){
            int powerTen = (int) Math.pow(10, i) ;
            int digit = number / powerTen ;
            number = number - digit* powerTen ;
            result += oneDigitArabicToRomanConverter( digit*powerTen , i) ;

        }
        return  result ;
    }


}
