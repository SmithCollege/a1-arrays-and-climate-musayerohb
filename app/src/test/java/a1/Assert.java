package a1;

import org.junit.Test;

import java.util.regex.Matcher;

/**
 * This class is designed to use with JUnit at the
 * command line. It catches errors and prints a
 * message for each test, whether passed or failed.
 */
public class Assert {
    /** Asserts that two boolean arrays are equal. */
    static void assertArrayEquals(boolean[] expecteds, boolean[] actuals) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two byte arrays are equal. */
    static void assertArrayEquals(byte[] expecteds, byte[] actuals) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two char arrays are equal. */
    static void assertArrayEquals(char[] expecteds, char[] actuals) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two double arrays are equal. */
    static void assertArrayEquals(double[] expecteds, double[] actuals, double delta) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals, delta);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two float arrays are equal. */
    static void assertArrayEquals(float[] expecteds, float[] actuals, float delta) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals, delta);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two int arrays are equal. */
    static void assertArrayEquals(int[] expecteds, int[] actuals) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two long arrays are equal. */
    static void assertArrayEquals(long[] expecteds, long[] actuals) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two object arrays are equal. */
    static void assertArrayEquals(Object[] expecteds, Object[] actuals) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two short arrays are equal. */
    static void assertArrayEquals(short[] expecteds, short[] actuals) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two boolean arrays are equal. */
    static void assertArrayEquals(String message, boolean[] expecteds, boolean[] actuals) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that two byte arrays are equal. */
    static void assertArrayEquals(String message, byte[] expecteds, byte[] actuals) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that two char arrays are equal. */
    static void assertArrayEquals(String message, char[] expecteds, char[] actuals) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that two double arrays are equal. */
    static void assertArrayEquals(String message, double[] expecteds, double[] actuals, double delta) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals, delta);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that two float arrays are equal. */
    static void assertArrayEquals(String message, float[] expecteds, float[] actuals, float delta) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals, delta);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that two int arrays are equal. */
    static void assertArrayEquals(String message, int[] expecteds, int[] actuals) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that two long arrays are equal. */
    static void assertArrayEquals(String message, long[] expecteds, long[] actuals) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that two object arrays are equal. */
    static void assertArrayEquals(String message, Object[] expecteds, Object[] actuals) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that two short arrays are equal. */
    static void assertArrayEquals(String message, short[] expecteds, short[] actuals) {
        try {
            org.junit.Assert.assertArrayEquals(expecteds, actuals);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

      /**
     * Deprecated. Use assertEquals(double expected, double actual, double delta)
     * instead
     */
    @SuppressWarnings("deprecation")
    static void assertEquals(double expected, double actual) {
        try {
            org.junit.Assert.assertEquals(expected, actual);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two doubles are equal to within a positive delta. */
    static void assertEquals(double expected, double actual, double delta) {
        try {
            org.junit.Assert.assertEquals(expected, actual, delta);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two floats are equal to within a positive delta. */
    static void assertEquals(float expected, float actual, float delta) {
        try {
            org.junit.Assert.assertEquals(expected, actual, delta);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two longs are equal. */
    static void assertEquals(long expected, long actual) {
        try {
            org.junit.Assert.assertEquals(expected, actual);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Deprecated. use assertArrayEquals */
    @SuppressWarnings("deprecation")
    static void assertEquals(Object[] expecteds, Object[] actuals) {
        try {
            org.junit.Assert.assertEquals(expecteds, actuals);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /** Asserts that two objects are equal. */
    static void assertEquals(Object expected, Object actual) {
        try {
            org.junit.Assert.assertEquals(expected, actual);
            System.out.println("Passed.");
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + e.getMessage());
        }
    }

    /**
     * Deprecated. Use assertEquals(String message, double expected, double actual,
     * double delta) instead
     */
    @SuppressWarnings("deprecation")
    static void assertEquals(String message, double expected, double actual) {
        try {
            org.junit.Assert.assertEquals(expected, actual);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that two doubles are equal to within a positive delta. */
    static void assertEquals(String message, double expected, double actual, double delta) {
        try {
            org.junit.Assert.assertEquals(expected, actual, delta);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that two floats are equal to within a positive delta. */
    static void assertEquals(String message, float expected, float actual, float delta) {
        try {
            org.junit.Assert.assertEquals(expected, actual, delta);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that two longs are equal. */
    static void assertEquals(String message, long expected, long actual) {
        try {
            org.junit.Assert.assertEquals(expected, actual);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Deprecated. use assertArrayEquals */
    @SuppressWarnings("deprecation")
    static void assertEquals(String message, Object[] expecteds, Object[] actuals) {
        try {
            org.junit.Assert.assertEquals(expecteds, actuals);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  " + message);
        }
    }

    /** Asserts that two objects are equal. */
    static void assertEquals(String message, Object expected, Object actual) {
        try {
            org.junit.Assert.assertEquals(expected, actual);
            System.out.println("Passed:  " + message);
        } catch (AssertionError e) {
            System.out.println("Test failed:  &quo...");
        }
    }
}
