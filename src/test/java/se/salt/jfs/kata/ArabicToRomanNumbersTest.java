package se.salt.jfs.kata;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArabicToRomanNumbersTest {

    ArabicToRomanNumbers arabicToRomanNumbers = new ArabicToRomanNumbers();

    @Test
    public void arabicToRomanConverter5ShouldBeV(){
        assertEquals("V", arabicToRomanNumbers.calculateNumber(5));
    }

    @Test
    public void arabicToRomanConverter100ShouldBeC(){
        assertEquals("C", arabicToRomanNumbers.arabicToRomanConverter(100));
    }

    @Test
    public void arabicToRomanConverter8ShouldBeVIII(){
        assertEquals("VIII", arabicToRomanNumbers.calculateNumber(8));
    }

    @Test
    public void arabicToRomanConverter9ShouldBeIX(){
        assertEquals("IX", arabicToRomanNumbers.calculateNumber(9));
    }

    @Test
    public void arabicToRomanConverter4ShouldBeIV(){
        assertEquals("IV", arabicToRomanNumbers.calculateNumber(4));
    }

    @Test
    public void arabicToRomanConverter30ShouldBeXXX(){
        assertEquals("XXX", arabicToRomanNumbers.calculateNumber(30));
    }
    @Test
    public void arabicToRomanConverter40ShouldBeXL(){
        assertEquals("XL", arabicToRomanNumbers.calculateNumber(40));
    }
    @Test
    public void arabicToRomanConverter39ShouldBeXXXIX(){
        assertEquals("XXXIX", arabicToRomanNumbers.calculateNumber(39));
    }

    @Test
    public void arabicToRomanConverter246ShouldBeCCXLVI(){
        assertEquals("CCXLVI", arabicToRomanNumbers.calculateNumber(246));
    }
    @Test
    public void arabicToRomanConverter789ShouldBeDCCLXXXIX(){
        assertEquals("DCCLXXXIX", arabicToRomanNumbers.calculateNumber(789));
    }
    @Test
    public void arabicToRomanConverter2421ShouldBeMMCDXXI(){
        assertEquals("MMCDXXI", arabicToRomanNumbers.calculateNumber(2421));
    }

}