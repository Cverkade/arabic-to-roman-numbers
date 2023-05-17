package se.salt.jfs.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {

    RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

    @Test
    public void arabicToRomanConverter5ShouldBeV(){
        assertEquals("V", romanNumeralsConverter.arabicToRomanConverter(5));
    }

    @Test
    public void arabicToRomanConverter100ShouldBeC(){
        assertEquals("C", romanNumeralsConverter.arabicToRomanConverter(100));
    }

    @Test
    public void arabicToRomanConverter8ShouldBeVIII(){
        assertEquals("VIII", romanNumeralsConverter.oneDigitArabicToRomanConverter(8 , 0 ));
    }

    @Test
    public void arabicToRomanConverter9ShouldBeIX(){
        assertEquals("IX", romanNumeralsConverter.oneDigitArabicToRomanConverter(9 , 0));
    }

    @Test
    public void arabicToRomanConverter4ShouldBeIV(){
        assertEquals("IV", romanNumeralsConverter.oneDigitArabicToRomanConverter(4,0));
    }

    @Test
    public void arabicToRomanConverter30ShouldBeXXX(){
        assertEquals("XXX", romanNumeralsConverter.oneDigitArabicToRomanConverter(30, 1 ));
    }
    @Test
    public void arabicToRomanConverter40ShouldBeXL(){
        assertEquals("XL", romanNumeralsConverter.oneDigitArabicToRomanConverter(40 , 1));
    }
    @Test
    public void arabicToRomanConverter39ShouldBeXXXIX(){
        assertEquals("XXXIX", romanNumeralsConverter.separateDigit(39 ));
    }

    @Test
    public void arabicToRomanConverter246ShouldBeCCXLVI(){
        assertEquals("CCXLVI", romanNumeralsConverter.separateDigit(246 ));
    }
    @Test
    public void arabicToRomanConverter789ShouldBeDCCLXXXIX(){
        assertEquals("DCCLXXXIX", romanNumeralsConverter.separateDigit(789 ));
    }
    @Test
    public void arabicToRomanConverter2421ShouldBeMMCDXXI(){
        assertEquals("MMCDXXI", romanNumeralsConverter.separateDigit(2421 ));
    }

}