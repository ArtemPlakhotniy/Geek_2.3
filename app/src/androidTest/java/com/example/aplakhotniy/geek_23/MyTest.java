package com.example.aplakhotniy.geek_23;

import junit.framework.TestCase;

/**
 * Created by Minorius on 15.10.2015.
 */
public class MyTest extends TestCase {

    public void testFactorial() throws Exception{
        assertEquals(0 ,HomeWork_2.factorial(0));
        assertEquals(1 ,HomeWork_2.factorial(1));
        assertEquals(2 ,HomeWork_2.factorial(2));
        assertEquals(120 ,HomeWork_2.factorial(5));
        assertEquals(720 ,HomeWork_2.factorial(6));
        assertEquals(479001600 ,HomeWork_2.factorial(12));
    }

    public void testFibonachi() throws Exception{
        assertEquals(0, HomeWork_2.fibonachi(0));
        assertEquals(1, HomeWork_2.fibonachi(1));
        assertEquals(2, HomeWork_2.fibonachi(2));
        assertEquals(3, HomeWork_2.fibonachi(3));
        assertEquals(5, HomeWork_2.fibonachi(4));
        assertEquals(8, HomeWork_2.fibonachi(5));
        assertEquals(34, HomeWork_2.fibonachi(8));
        assertEquals(89, HomeWork_2.fibonachi(10));

    }
}
