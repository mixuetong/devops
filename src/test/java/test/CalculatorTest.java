package test;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mixata@chanjet.com
 * @date 2019-08-15
 */
public class CalculatorTest {

    @Test
    public void add() {
        Long a = 2L;
        Long b = 3L;

        Long result = Calculator.add(a, b);
        assertEquals(5L, result.longValue());
    }
}