import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    @DisplayName("test add method with empty string")
    void testAddMethodWithEmptySting(){
        int numString = calc.add("");
        assertEquals(numString,0);
    }
    @Test
    @DisplayName("test add method with one number string")
    void testAddMethodWithOneNumberSting(){
        int numString = calc.add("50");
        assertEquals(numString,50);
    }
    @Test
    @DisplayName("test add method with two numbers")
    void testAddMethodWithTwoNumbers(){
        int numString = calc.add("5,6");
        assertEquals(numString,11);
    }

    @Test
    @DisplayName("test add method with two numbers containing spaces")
    void testAddMethodWithTwoNumbersContainSpaces(){
        int numString = calc.add("5 ,6 ");
        assertEquals(numString,11);
    }

    @Test
    @DisplayName("test add method with two numbers one of them is just space")
    void testAddMethodWithOneEmptyNumber(){
        int numString = calc.add("5 , ");
        assertEquals(numString,5);
    }

    @Test
    @DisplayName("test add method with unknown number of numbers")
    void testAddMethodWithMoreThanThreeNumbers(){
        int numString = calc.add("5 ,6 , 7 ");
        assertEquals(numString,18);
    }
}