import com.goit.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

 class SumCalculatorTests {
    private SumCalculator calc;

    @BeforeEach
    public void beforeEach() {
        calc = new SumCalculator();
    }


    @Test
    void testSumForValue1() {
        int actual = calc.sum(1);

        //Then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

     @Test
     void testSumForValue5() {
         int actual = calc.sum(5);

         //Then
         int expected = 15;
         Assertions.assertEquals(expected, actual);
     }

    @Test
    void sumThrowsExceptionWhenInputIsZero() {
        assertThrows(IllegalArgumentException.class, () -> calc.sum(0));
    }
}
