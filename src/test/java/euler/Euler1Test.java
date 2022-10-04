package euler;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Euler1Test {


//    If we list all the natural numbers below 10 that are multiples of 3 or 5,
//    we get 3, 5, 6 and 9. The sum of these multiples is 23.
//
//    Find the sum of all the multiples of 3 or 5 below 1000.

    @Test
    void getResult() {
        Euler1 underTest = new Euler1();
        assertEquals(23, underTest.getResult(10));
        assertEquals(33, underTest.getResult(11));
        assertEquals(233168, underTest.getResult(1000));
    }
}