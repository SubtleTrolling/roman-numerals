import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {
    @Test
    void convertsOneToI() {
        assertEquals("I", RomanNumerals.convert(1));
    }
    @Test
    void convertsTwoToII() {
        assertEquals("II", RomanNumerals.convert(2));
    }
    @Test
    void convertsThreeToIII() {
        assertEquals("III", RomanNumerals.convert(3));
    }
    @Test
    void convertsFourToIV() {
        assertEquals("IV", RomanNumerals.convert(4));
    }
    @Test
    void convertsFiveToV() {
        assertEquals("V", RomanNumerals.convert(5));
    }
    @Test
    void convertsSixToVI() {
        assertEquals("VI", RomanNumerals.convert(6));
    }
    @Test
    void convertsSevenToVII() {
        assertEquals("VII", RomanNumerals.convert(7));
    }
    @Test
    void convertsEightToVII() {
        assertEquals("VIII", RomanNumerals.convert(8));
    }
} 