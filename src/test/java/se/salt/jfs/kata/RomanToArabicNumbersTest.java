package se.salt.jfs.kata;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RomanToArabicNumbersTest {

    RomanToArabicNumbers romanToArabicNumbers = new RomanToArabicNumbers();
    @Test
    public void romanToArabicConverter8ShouldBeVIII(){
        assertEquals(8, romanToArabicNumbers.calculateNumber("VIII"));
    }

    @Test
    public void romanToArabicConverter9ShouldBeIX(){
        assertEquals(9, romanToArabicNumbers.calculateNumber("IX"));
    }

    @Test
    public void romanToArabicConverter4ShouldBeIV(){
        assertEquals(4, romanToArabicNumbers.calculateNumber("IV"));
    }
    @Test
    public void romanToArabicConverter789ShouldBeDCCLXXXIX(){
        assertEquals(789, romanToArabicNumbers.calculateNumber("DCCLXXXIX"));
    }
    @Test
    public void romanToArabicConverter30ShouldBeXXX(){
        assertEquals(30, romanToArabicNumbers.calculateNumber("XXX"));
    }
    @Test
    public void romanToArabicConverter40ShouldBeXL(){
        assertEquals(40, romanToArabicNumbers.calculateNumber("XL"));
    }
    @Test
    public void romanToArabicConverter39ShouldBeXXXIX(){
        assertEquals(39, romanToArabicNumbers.calculateNumber("XXXIX"));
    }

    @Test
    public void romanToArabicConverter246ShouldBeCCXLVI(){
        assertEquals(246, romanToArabicNumbers.calculateNumber("CCXLVI"));
    }

    @Test
    public void romanToArabicConverter2421ShouldBeMMCDXXI(){
        assertEquals(2421, romanToArabicNumbers.calculateNumber("MMCDXXI"));
    }


}