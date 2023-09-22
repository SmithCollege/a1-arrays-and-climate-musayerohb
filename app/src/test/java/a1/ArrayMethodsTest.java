package a1;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert.*;

/**
 * Tests the methods created in class ArrayMethods. If any errors are present, it catches them and prints a
 * message for each test, whether passed or failed.
 */
public class ArrayMethodsTest {
    @Test public void wholeSumTest() {
        float[] array1 = {1.0f, 2.0f, 3.0f, 4.0f};
        float[] array2 = {-7.5f, 3.2f};
        float[] array3 = {};
        float[] array4 = {-3.0f, 5.0f};
        float[] array5 = {-6.0f, -6.0f};
        float[] array6 = {-4.0f};
        assertEquals("Test #1: [1.0, 2.0, 3.0, 4.0]", 10.0f, ArrayMethods.wholeSum(array1), 1e-6);
        assertEquals("Test #2: [-7.5, 3.2]", -4.3f, ArrayMethods.wholeSum(array2), 1e-6);
        assertEquals("Test #3: []", 0.0f, ArrayMethods.wholeSum(array3), 1e-6);
        assertEquals("Test #4: [-3.0, 5.0]", 2.0f, ArrayMethods.wholeSum(array4), 1e-6);
        assertEquals("Test #5: [-6.0, -6.0]", -12.0f, ArrayMethods.wholeSum(array5), 1e-6);
        assertEquals("Test #6: [-4.0]", -4.0f, ArrayMethods.wholeSum(array6), 1e-6);
    }

    /** Having trouble with test 6, lo is buggy when its value is lower than 2. Consistently prints inaccurate calculations, seems like java does not accept negative float value for the expected value.(9/16/23 1:53pm) */
    @Test public void sum() {
        float[] array1 = {1.0f, 2.0f, 3.0f, 4.0f};
        float[] array2 = {1.0f, 2.0f, 3.0f, 4.0f};
        float[] array3 = {1.0f, 2.0f, 3.0f, 4.0f};
        float[] array4 = {};
        float[] array5 = {-5.0f, 0.0f, 7.0f};
        float[] array6 = {-5.5f, 4.0f, -2.5f, 4.0f};
        assertEquals("Test #1: [1.0, 2.0, 3.0, 4.0]", 5.0f, ArrayMethods.sum(array1, 1, 3), 1e-6);
        assertEquals("Test #2: [1.0, 2.0, 3.0, 4.0]", 10.0f, ArrayMethods.sum(array2, 0, 4), 1e-6);
        assertEquals("Test #3: [1.0, 2.0, 3.0, 4.0]", 0.0f, ArrayMethods.sum(array3, 2, 2), 1e-6);
        assertEquals("Test #4: []", 0.0f, ArrayMethods.sum(array4, 0, 1), 1e-6);
        assertEquals("Test #5: [-5.0, 0.0, 7.0]", 0.0f, ArrayMethods.sum(array5, 1, 2), 1e-6);
        assertEquals("Test #6: [-5.5, 4.0, -2.5, 4.0]", -1.5f, ArrayMethods.sum(array6, 0, 2), 1e-6);
        /* For method overloading for sum */
        float[] wholeSumarray1 = {1.0f, 2.0f, 3.0f, 4.0f};
        float[] wholeSumarray2 = {-7.5f, 3.2f};
        float[] wholeSumarray3 = {};
        float[] wholeSumarray4 = {-3.0f, 5.0f};
        float[] wholeSumarray5 = {-6.0f, -6.0f};
        float[] wholeSumarray6 = {-4.0f};
        assertEquals("Test #1: [1.0, 2.0, 3.0, 4.0]", 10.0f, ArrayMethods.sum(wholeSumarray1), 1e-6);
        assertEquals("Test #2: [-7.5, 3.2]", -4.3f, ArrayMethods.sum(wholeSumarray2), 1e-6);
        assertEquals("Test #3: []", 0.0f, ArrayMethods.sum(wholeSumarray3), 1e-6);
        assertEquals("Test #4: [-3.0, 5.0]", 2.0f, ArrayMethods.sum(wholeSumarray4), 1e-6);
        assertEquals("Test #5: [-6.0, -6.0]", -12.0f, ArrayMethods.sum(wholeSumarray5), 1e-6);
        assertEquals("Test #6: [-4.0]", -4.0f, ArrayMethods.sum(wholeSumarray6), 1e-6);
    }

    @Test public void mean() {
        float[] array1 = {1.0f, 2.0f, 3.0f, 4.0f};
        float[] array2 = {1.0f, 2.0f, 3.0f, 4.0f};
        float[] array3 = {};
        float[] array4 = {-3.0f, -2.0f, 6.0f, 8.0f};
        float[] array5 = {5.0f, 2.0f, -1.0f};
        float[] array6 = {8.0f};
        assertEquals("Test #1: [1.0, 2.0, 3.0, 4.0]", 3.5f, ArrayMethods.mean(array1, 2, 4), 1e-6);
        assertEquals("Test #2: [1.0, 2.0, 3.0, 4.0]", 2.5f, ArrayMethods.mean(array2, 1, 3), 1e-6);
        assertEquals("Test #3: []", 0.0f, ArrayMethods.mean(array3, 0, 1), 1e-6);
        assertEquals("Test #4: [-3.0, -2.0, 6.0, 8.0]", -2.5f, ArrayMethods.mean(array4, 0, 2), 1e-6);
        assertEquals("Test #5: [5.0, 2.0, -1.0]", 3.5f, ArrayMethods.mean(array5, 0, 2), 1e-6);
        assertEquals("Test #6: [8.0]", 8.0f, ArrayMethods.mean(array6, 0, 1), 1e-6);
        /* For method overloading for mean */
        float[] overloadarray1 = {1.0f, -9999.0f, 3.0f, 2.0f};
        float[] overloadarray2 = {-9999.0f, 10.0f, 5.0f, 9.0f};
        float[] overloadarray3 = {-9999.0f, -9999.0f, -9999.0f, -9999.0f};
        boolean[] test1boolean = {true, false, true, true};
        boolean[] test2boolean = {false, true, true, true};
        boolean[] test3boolean = {false, false, false, false};
        assertEquals("Test #1: [1.0, -9999.0, 3.0, 2.0]", 2.0f, ArrayMethods.mean(overloadarray1, test1boolean, 0, 4), 1e-6);
        assertEquals("Test #2: [-9999.0, 10.0, 5.0, 9.0]", 8.0f, ArrayMethods.mean(overloadarray2, test2boolean, 0, 4), 1e-6);
        assertEquals("Test #3: [-9999.0, -9999.0, -9999.0, -9999.0]", Float.NaN, ArrayMethods.mean(overloadarray3, test3boolean, 0, 4), 1e-6);

    }

    @Test public void min() {
        float[] array1 = {1.0f, 3.0f, 2.0f, 4.0f};
        float[] array2 = {1.0f, 3.0f, 2.0f, 4.0f};
        float[] array3 = {};
        float[] array4 = {-4.0f, 2.0f, 3.0f};
        float[] array5 = {-8.0f, -3.0f, -10.0f, -1.0f};
        float[] array6 = {4.0f, 3.0f, -5.0f, -6.0f};

        assertEquals("Test #1: [1.0, 3.0, 2.0, 4.0]", 2.0f, ArrayMethods.min(array1, 1, 4), 1e-6);
        assertEquals("Test #2: [1.0, 3.0, 2.0, 4.0]", 1.0f, ArrayMethods.min(array2, 0, 4), 1e-6);
        assertEquals("Test #3: []", Float.NaN, ArrayMethods.min(array3, 0, 4), 1e-6);
        assertEquals("Test #4: [-4.0, 2.0, 3.0]", -4.0f, ArrayMethods.min(array4, 0, 3), 1e-6);
        assertEquals("Test #5: [-8.0, -3.0, -10.0, -1.0]", -8.0f, ArrayMethods.min(array5, 0, 2), 1e-6);
        assertEquals("Test #6: [4.0, 3.0, -5.0, -6.0]", -6.0f, ArrayMethods.min(array6, 3, 4), 1e-6);
    }

    @Test public void max() {
        float[] array1 = {1.0f, 3.0f, 2.0f, 4.0f};
        float[] array2 = {1.0f, 3.0f, 2.0f};
        float[] array3 = {1.0f, 3.0f, 2.0f};
        float[] array4 = {-4.0f, 2.0f, 3.0f};
        float[] array5 = {-8.0f, -3.0f, -10.0f, -1.0f};
        float[] array6 = {4.0f, 3.0f, -5.0f, -6.0f};

        assertEquals("Test #1: [1.0, 3.0, 2.0, 4.0]", 4.0f, ArrayMethods.max(array1, 1, 4), 1e-6);
        assertEquals("Test #2: [1.0, 3.0, 2.0]", 3.0f, ArrayMethods.max(array2, 0, 2), 1e-6);
        assertEquals("Test #3: [1.0, 3.0, 2.0]", Float.NaN, ArrayMethods.max(array3, 0, 0), 1e-6);
        assertEquals("Test #4: [-4.0, 2.0, 3.0]", 3.0f, ArrayMethods.max(array4, 0, 3), 1e-6);
        assertEquals("Test #5: [-8.0, -3.0, -10.0, -1.0]", -3.0f, ArrayMethods.max(array5, 0, 2), 1e-6);
        assertEquals("Test #6: [4.0, 3.0, -5.0, -6.0]", -6.0f, ArrayMethods.max(array6, 3, 4), 1e-6);

    }

    @Test public void isEqualTo() {
        float[] array1 = {1.0f, 2.0f, 3.0f, 2.0f};
        float[] array2 = {1.0f, -9999.0f, 3.0f, 2.0f};
        float[] array3 = {8.0f, 8.0f, 0.0f, -1.0f};
        float[] array4 = {6.0f, 4.4f, 2.9f, -5.1f};
        boolean[] test1boolean = {false, true, false, true};
        boolean[] test2boolean = {false, true, false, false};
        boolean[] test3boolean = {true, true, false, false};
        boolean[] test4boolean = {false, false, false, true};

        assertArrayEquals("Test #1: [1.0, 2.0, 3.0, 2.0], 2.0", test1boolean, ArrayMethods.isEqualTo(array1, 2.0f));
        assertArrayEquals("Test #2: [1.0, -9999.0, 3.0, 2.0], -9999.0", test2boolean, ArrayMethods.isEqualTo(array2, -9999.0f));
        assertArrayEquals("Test #3: [8.0, 8.0, 0.0, -1.0], 8.0", test3boolean, ArrayMethods.isEqualTo(array3, 8.0f));
        assertArrayEquals("Test #4: [6.0, 4.4, 2.9, -5.1], -5.1", test4boolean, ArrayMethods.isEqualTo(array4, -5.1f));

    }

    @Test public void logicalNot() {
        boolean[] test1boolean = {false, true, false, false};
        boolean[] test1booleanNot = {true, false, true, true};
        boolean[] test2boolean = {false, false, true, false};
        boolean[] test2booleanNot = {true, true, false, true};
        boolean[] test3boolean = {true, false};
        boolean[] test3booleanNot = {false, true};
        boolean[] test4boolean = {true, true};
        boolean[] test4booleanNot = {false, false};

        assertArrayEquals("Test #1: [false, true, false, false]", test1booleanNot, ArrayMethods.logicalNot(test1boolean));
        assertArrayEquals("Test #2: [false, false, true, false]", test2booleanNot, ArrayMethods.logicalNot(test2boolean));
        assertArrayEquals("Test #3: [true, false]", test3booleanNot, ArrayMethods.logicalNot(test3boolean));
        assertArrayEquals("Test #4: [true, true]", test4booleanNot, ArrayMethods.logicalNot(test4boolean));

    }

    @Test public void isGreaterThan() {
        float[] array1 = {1.0f, 2.0f, 3.0f, 2.5f};
        boolean[] test1boolean = {false, false, true, false};
        float[] array2 = {5.0f, 8.0f, -3.0f, 7.0f};
        boolean[] test2boolean = {false, true, false, true};
        float[] array3 = {3.0f, 2.0f, 11.0f, 6.0f};
        boolean[] test3boolean = {true, true, true, true};

        assertArrayEquals("Test #1: [1.0, 2.0, 3.0, 2.5], 2.5", test1boolean, ArrayMethods.isGreaterThan(array1, 2.5f));
        assertArrayEquals("Test #2: [5.0, 8.0, -3.0, 7.0], 6.0", test2boolean, ArrayMethods.isGreaterThan(array2, 6.0f));
        assertArrayEquals("Test #3: [3.0, 2.0, 11.0, 6.0], 1.0", test3boolean, ArrayMethods.isGreaterThan(array3, 1.0f));

    }

    @Test public void datesBetween() {
        String[] array1 = {"20230101", "20230214", "20230704"};
        boolean[] test1boolean = {false, true, false};
        String[] array2 = {"20230731", "20230715", "20230814"};
        boolean[] test2boolean = {false, false, false};
        String[] array3 = {"20230513", "20230620", "20230823", "20231020"};
        boolean[] test3boolean = {false, false, true, false};
        assertArrayEquals("Test #1: [20230101, 20230214, 20230704]", test1boolean, ArrayMethods.datesBetween(array1, "20230101", "20230704"));
        assertArrayEquals("Test #2: [20230731, 20230715, 20230813]", test2boolean, ArrayMethods.datesBetween(array2, "20230715", "20230814"));
        assertArrayEquals("Test #3: [20230513, 20230620, 20230823, 20231020]", test3boolean, ArrayMethods.datesBetween(array3, "20230620", "20231020"));
    }

    @Test public void LogicalAnd() {
        boolean[] test1boolean = {false, true, true, false};
        boolean[] test1boolean2 = {false, true, false, true};
        boolean[] test1result = {false, true, false, false};
        boolean[] test2boolean = {true, true, true, false};
        boolean[] test2boolean2 = {true, false, false, false};
        boolean[] test2result = {true, false, false, false};
        boolean[] test3boolean = {false, true, false, true};
        boolean[] test3boolean2 = {true, false, false, true};
        boolean[] test3result = {false, false, false, true};

        assertArrayEquals("Test #1: [false, true, true, false], [false, true, false, true]", test1result, ArrayMethods.logicalAnd(test1boolean, test1boolean2));
        assertArrayEquals("Test #2: [true, true, true, true], [true, false, false, false]", test2result, ArrayMethods.logicalAnd(test2boolean, test2boolean2));
        assertArrayEquals("Test #3: [false, true, false, true], [true, false, false, true]", test3result, ArrayMethods.logicalAnd(test3boolean, test3boolean2));

    } 

    @Test public void count() {

        boolean[] test1boolean = {false, true, true, false, true};
        boolean[] test2boolean = {true, true, false, true, true};
        boolean[] test3boolean = {false, false, false, false, true, false, true, false, false};


        assertEquals("Test #1: [false, true, true, false, true]", 3.0, ArrayMethods.count(test1boolean), 1e-6);
        assertEquals("Test #2: [false, true, false, true, true]", 4.0, ArrayMethods.count(test2boolean), 1e-6);
        assertEquals("Test #3: [false, false, false, false, true, false, true, false, false]", 2.0, ArrayMethods.count(test3boolean), 1e-6);

    }
        
    @Test public void findFirst() {

        boolean[] test1boolean = {false, false, true, false, true};
        boolean[] test2boolean = {false, false, false};
        boolean[] test3boolean = {true, false, true};
        boolean[] test4boolean = {false, false, false, true, false};

        assertEquals("Test #1: [false, false, true, false, true]", 2.0, ArrayMethods.findFirst(test1boolean), 1e-6);
        assertEquals("Test #2: [false, false, false]", -1.0, ArrayMethods.findFirst(test2boolean), 1e-6);
        assertEquals("Test #3: [true, false, true]", 0.0, ArrayMethods.findFirst(test3boolean), 1e-6);
        assertEquals("Test #4: [false, false, false, true, false]", 3.0, ArrayMethods.findFirst(test4boolean), 1e-6);

    }

    @Test public void find() {

        boolean[] test1boolean = {false, true, true, false, true};
        int[] test1result = {1, 2, 4};
        boolean[] test2boolean = {false, false, false};
        int[] test2result = {};
        boolean[] test3boolean = {true, true, false, false, true, false};
        int[] test3result = {0, 1, 4};
        boolean[] test4boolean = {false, false, false, true, false};
        int[] test4result = {3};
    
        assertArrayEquals("Test #1: [false, true, true, false, true]", test1result, ArrayMethods.find(test1boolean));
        assertArrayEquals("Test #2: [false, false, false]", test2result, ArrayMethods.find(test2boolean));
        assertArrayEquals("Test #3: [true, true, false, false, true, false]", test3result, ArrayMethods.find(test3boolean));
        assertArrayEquals("Test #4: [false, false, false, true, false]", test4result, ArrayMethods.find(test4boolean));

    }

    @Test public void highest() {

        float[] test1 = {1.0f, 3.0f, 2.0f, 4.0f};
        float[] test1result = {4.0f, 3.0f};
        float[] test2 = {4.0f, 3.0f};
        float[] test2result = {4.0f, 3.0f, Float.NaN};
        float[] test3 = {2.0f, 5.0f, 7.0f, 11.0f};
        float[] test3result = {11.0f, 7.0f};
        float[] test4 = {-5.0f, 2.0f, 6.0f, 1.0f};
        float[] test4result = {6.0f, 2.0f};

        assertEquals("Test #1: [1.0, 3.0, 2.0, 4.0", Arrays.toString(test1result), Arrays.toString(ArrayMethods.highest(test1, 0, 4, 2)));
        assertEquals("Test #2: [4.0, 3.0]", Arrays.toString(test2result), Arrays.toString(ArrayMethods.highest(test2, 0, 2, 3)));
        assertEquals("Test #3: [2.0f, 5.0f, 7.0f, 11.0f]", Arrays.toString(test3result), Arrays.toString(ArrayMethods.highest(test3, 0, 3, 2)));
        assertEquals("Test #4: [-5.0f, 2.0f, 6.0f, 1.0f]", Arrays.toString(test4result), Arrays.toString(ArrayMethods.highest(test4, 1, 3, 2)));

    }

    @Test public void lowest() {
        float[] test1 = {1.0f, 3.0f, 2.0f, 4.0f};
        float[] test1result = {1.0f, 2.0f};
        float[] test2 = {2.0f, 3.0f, 2.0f, 3.0f};
        float[] test2result = {2.0f, 2.0f, 3.0f};
        float[] test3 = {4.0f, 3.0f, 2.0f, 1.0f};
        float[] test3result = {2.0f, 1.0f};
        float[] test4 = {4.0f, 3.0f, 2.0f, 1.0f};
        float[] test4result = {1.0f};
        float[] test5 = {4.0f, 3.0f};
        float[] test5result = {4.0f, 3.0f, Float.NaN};

        assertEquals("Test #1: [1.0, 3.0, 2.0, 4.0]", Arrays.toString(test1result), Arrays.toString(ArrayMethods.lowest(test1, 0, 4, 2)));
        assertEquals("Test #2: [2.0, 3.0, 2.0, 3.0]", Arrays.toString(test2result), Arrays.toString(ArrayMethods.lowest(test2, 0, 4, 3)));
        assertEquals("Test #3: [4.0, 3.0, 2.0, 1.0]", Arrays.toString(test3result), Arrays.toString(ArrayMethods.lowest(test3, 0, 4, 2)));
        assertEquals("Test #4: [4.0, 3.0, 2.0, 1.0]", Arrays.toString(test4result), Arrays.toString(ArrayMethods.lowest(test4, 0, 4, 1)));
        assertEquals("Test #5: [4.0, 3.0]", Arrays.toString(test4result), Arrays.toString(ArrayMethods.lowest(test4, 0, 4, 3)));


    }
}