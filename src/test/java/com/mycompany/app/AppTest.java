package com.mycompany.app;
import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    
    public void testArrayIndexOutOfBounds() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().search(array,array2,6, 2));
    }

    public void testArray2IndexOutOfBounds() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().search(array,array2,3,5));
    }

    public void testIsArrayCharacterNotEqual() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
	ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().search(array,array2, 1,2));
    }

    public void testIsArrayNegativeIndex() {
	ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
	ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().search(array,array2,-2, 3));
    }

    public void testAllPassed() {
	ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
	ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertTrue(new App().search(array, array2 , 2 , 2));
    }

}
