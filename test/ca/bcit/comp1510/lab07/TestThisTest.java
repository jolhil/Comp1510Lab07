package ca.bcit.comp1510.lab07;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestThisTest {
    
    /** Number 3. */
    private static final int THREE = 3;
    
    /** Number 4. */
    private static final int FOUR = 4;
    
    /** Number 32*/
    private static final int THIRTYTWO = 32;
    
    /** The TestThis object to test.*/
    private TestThis test;
    
    /**
     * Creates a new TestThis objects before each test is executed.
     * 
     * @throws Exception
     *             if a TestThis object cannot be created.
     */
    @BeforeEach
    public void setUp() throws Exception {
        test = new TestThis();
    }
    
    
    /** 
     * Test largest method with integer 1, 2, 3.
     */
    @Test
    void testLargestIntIntInt1() {
        int max = test.largest(1, 2, THREE);
        assertEquals(THREE, max);
    }
    
    /** 
     * Test largest method with integer 1, 4, 3.
     */
    @Test
    void testLargestIntIntInt2() {
        int max = test.largest(1, FOUR, THREE);
        assertEquals(FOUR, max);
    }
    
    /** 
     * Test largest method with integer 32, 4, 3.
     */
    @Test
    void testLargestIntIntInt3() {
        int max = test.largest(THIRTYTWO, FOUR, THREE);
        assertEquals(THIRTYTWO, max);
    }

    /**
     * Test largest list method with list [1, 2, 3]
     */
    @Test
    void testLargestListOfInteger1() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(THREE);
        int max = test.largest(list);
        assertEquals(THREE, max);
    }
    
    /**
     * Test largest list method with list [2, 4, 1, 3]
     */
    @Test
    void testLargestListOfInteger2() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(FOUR);
        list.add(1);
        list.add(THREE);
        int max = test.largest(list);
        assertEquals(FOUR, max);
    }
    
    /**
     * Test largest list method with list [1, 3, 32, 4, 2]
     */
    @Test
    void testLargestListOfInteger3() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(THREE);
        list.add(THIRTYTWO);
        list.add(FOUR);
        list.add(2);
        int max = test.largest(list);
        assertEquals(THIRTYTWO, max);
    }
}
