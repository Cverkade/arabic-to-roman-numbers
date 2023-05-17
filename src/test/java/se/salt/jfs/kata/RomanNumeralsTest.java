package se.salt.jfs.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {

    RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

    @Test
    public void arabicToRomanConverter5ShouldBeV(){
        assertEquals("V", romanNumeralsConverter.calculateNumber(5));
    }

    @Test
    public void arabicToRomanConverter100ShouldBeC(){
        assertEquals("C", romanNumeralsConverter.arabicToRomanConverter(100));
    }

    @Test
    public void arabicToRomanConverter8ShouldBeVIII(){
        assertEquals("VIII", romanNumeralsConverter.calculateNumber(8));
    }

    @Test
    public void arabicToRomanConverter9ShouldBeIX(){
        assertEquals("IX", romanNumeralsConverter.calculateNumber(9));
    }

    @Test
    public void arabicToRomanConverter4ShouldBeIV(){
        assertEquals("IV", romanNumeralsConverter.calculateNumber(4));
    }

    @Test
    public void arabicToRomanConverter30ShouldBeXXX(){
        assertEquals("XXX", romanNumeralsConverter.calculateNumber(30));
    }
    @Test
    public void arabicToRomanConverter40ShouldBeXL(){
        assertEquals("XL", romanNumeralsConverter.calculateNumber(40));
    }
    @Test
    public void arabicToRomanConverter39ShouldBeXXXIX(){
        assertEquals("XXXIX", romanNumeralsConverter.calculateNumber(39));
    }

    @Test
    public void arabicToRomanConverter246ShouldBeCCXLVI(){
        assertEquals("CCXLVI", romanNumeralsConverter.calculateNumber(246));
    }
    @Test
    public void arabicToRomanConverter789ShouldBeDCCLXXXIX(){
        assertEquals("DCCLXXXIX", romanNumeralsConverter.calculateNumber(789));
    }
    @Test
    public void arabicToRomanConverter2421ShouldBeMMCDXXI(){
        assertEquals("MMCDXXI", romanNumeralsConverter.calculateNumber(2421));
    }

}