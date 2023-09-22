package a1;

import java.util.Arrays;

/**
 * Initializes the methods used for analyzing, calculating, and categorizing data from the downloaded text files.
 */
public class ArrayMethods {

    /**
     * Calculates the result of adding all the elements in a given array together.
     * @param array A given array of floats.
     * @return The sum after adding all of the array's elements together.
    */
    public static float wholeSum(float[] array) {
        System.out.println(array.toString());
        System.out.println(array.length);
        
        float wholeSumCurrentValue = 0;
        for (int i = 0; i < array.length; i++) {
            wholeSumCurrentValue += array[i];
        }
        return wholeSumCurrentValue;

    }

    /**
     * Calculates the result of adding up all the elements from a selected range of elements in a given array.
     * @param arr A given array of floats.
     * @param lo The lowest index at which the method will start adding elements together.
     * @param hi The highest index at which the method will stop adding elements together. 
     * @return The sum after adding up all of the elements from the a fixed range in the array together.
    */
    public static float sum(float[] arr, int lo, int hi) {
        if (arr.length == 0) {
            return 0.0f;
        }
        else {
            float wholeSumCurrentValue = 0;

            for (int i = lo; i < hi; i++) {
                //System.out.println(i);
                wholeSumCurrentValue += arr[i];
                //System.out.println(wholeSumCurrentValue);
            }
            //float end = -100.0f;
            return wholeSumCurrentValue;
        }
    }

    /**
     * Overloaded sum method that sets the lo and hi values automatically as the given array's lowest and highest indices.
     * @param arr A given array of floats.
     * @param lo The lowest index at which the method will start adding elements together.
     * @param hi The highest index at which the method will stop adding elements together. 
     * @return The sum after adding up all of the elements from the a fixed range in the array together.
    */
    public static float sum(float[] arr) {

        int hi = arr.length;
        int lo = 0;
        return sum(arr, lo, hi);

    }

    /**
     * Calculates the mean of a specified range of elements in a given array.
     * @param arr A given array of floats.
     * @param lo The lowest index at which the method will start computing the mean with.
     * @param hi The highest index at which the method will compute the mean with.  
     * @return The mean after adding up all of the specified elements together and then dividing by the amount of elements added. 
    */
    public static float mean(float[] arr, int lo, int hi) {
        if (arr.length == 0) {
            return 0.0f;
        }
        else {
            float wholeSumCurrentValue = 0;

            for (int i = lo; i < hi; i++) {
                wholeSumCurrentValue += arr[i];
            }
            float meanValue = wholeSumCurrentValue / (hi-lo);
            return meanValue;
        }
    }

    /**
     * Returns the minimum value found in the specified range of a given array.
     * @param arr A given array of floats.
     * @param lo The lowest index at which the method will start looking for a minimum value.
     * @param hi The highest index at which the method will stop looking for a minimum value.
     * @return The minimum value found in the array within the specified range.
    */
    public static float min(float[] arr, int lo, int hi) {
        if (arr.length == 0) {
                return Float.NaN;
            }
        
        else {
            float minValue = arr[lo];
            for (int i = lo; i < hi; i++) {
                    if (minValue > arr[i]) {
                        minValue = arr[i];
                    }
                    else {
                        continue;
                    }
                }
            return minValue;
            }
    }

    /**
     * Returns the maximum value found in the specified range of a given array.
     * @param arr A given array of floats.
     * @param lo The lowest index at which the method will start looking for a maximum value.
     * @param hi The highest index at which the method will stop looking for a maximum value.
     * @return The maximum value found in the array within the specified range.
    */
    public static float max(float[] arr, int lo, int hi) { 
        if (arr.length == 0 || hi == 0) {
                return Float.NaN;
            }
        
        else {
            float maxValue = arr[lo];
            for (int i = lo; i < hi; i++) {
                    if (maxValue < arr[i]) {
                        maxValue = arr[i];
                    }
                    else {
                        continue;
                    }
                }
            return maxValue;
            }
        
    }  

    /**
     * Checks to see if any of the values in a given array is equivalent to a given float value.
     * @param arr A given array of floats.
     * @param n A given float value that will be checked for in the array.
     * @return An array of booleans, with each value corresponding to the ones in the given array. A value of false indicates a un-matched value, while 'true' indicates a match. 
    */
    public static boolean[] isEqualTo(float[] arr, float n) {
        boolean[] indicatorVariables = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                indicatorVariables[i] = true;
            }
            else {
                indicatorVariables[i] = false;
            }
        }
        return indicatorVariables;
    }

    /**
     * Takes in a boolean array and returns another one with corresponding, but opposite boolean values.
     * @param arr A given array of booleans.
     * @return Another boolean array that has changed every 'true' and 'false' in the original array to 'false' and 'true'.
    */
    public static boolean[] logicalNot(boolean[] arr) {
        boolean[] indicatorVariables = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true) {
                indicatorVariables[i] = false;
            }
            else {
                indicatorVariables[i] = true;
            } 
        }
        return indicatorVariables;
    }

    /**
     * Overloaded mean method, calculates the mean of a given array of floats but removes a specified invalid value from the array before calculating.  
     * @param arr A given array of floats.
     * @param indicatorVariables A given array of booleans.
     * @param lo The lowest index at which the method will start calculating the mean with.
     * @param hi The highest index at which the method will stop calculating the mean with. 
     * @return The mean after adding up all of the specified elements together and then dividing by the amount of elements added.
    */
    public static float mean(float[] arr, boolean[] indicatorVariables, int lo, int hi) {
        int numberOfElements = 0;
        float total = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (indicatorVariables[i] == true) {
                numberOfElements++;
                total += arr[i];
            }
        }
        return total/numberOfElements;
    }

    /**
     * Checks to see if any of the values in a given array are greater than a given float value.
     * @param arr A given array of floats.
     * @param maxValue A given float value that elements in the array will be compared to.
     * @return An array of booleans with values of 'true' indicating values in arr that are greater than maxValue, and values of 'false' indicating those that aren't.
     */
    public static boolean[] isGreaterThan(float[] arr, float maxValue) {
        boolean[] indicatorVariables = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {

                if (maxValue < arr[i]) {
                    indicatorVariables[i] = true;
                }
                else {
                    indicatorVariables[i] = false;
                }
        }
        return indicatorVariables;
    }

    /**
     * Returns an array of booleans that indicate what date values are between a chosen start date and end date in a given array.
     * @param datesarr A given array of Strings with dates value.
     * @param startDate A specified start date within the array.
     * @param endDate A specified end date within the array.
     * @return An array of booleans with 'true' values indicating all the elements between the chosen startDate and endDate.
     */
    public static boolean[] datesBetween(String[] datesarr, String startDate, String endDate) {
        boolean[] indicatorVariables = new boolean[datesarr.length];
        boolean startBeingTrue = false;

        for (int i = 0; i < datesarr.length; i++) {
            if (datesarr[i].equals(startDate)) {
                indicatorVariables[i] = false;
                startBeingTrue = true;
            }
            else if (startBeingTrue == true && !datesarr[i].equals(endDate)) {
                indicatorVariables[i] = true;
            }
            else if (datesarr[i].equals(endDate)) {
                indicatorVariables[i] = false;
                startBeingTrue = false;
            }
            else {
                indicatorVariables[i] = false;
            }
             
        }

        return indicatorVariables;
    }
    
    /**
     * Checks through two arrays of booleans to see if corresponding values match and combines them based on matching values.
     * @param arr1 The first given array of booleans.
     * @param arr2 The second given array of booleans.
     * @return An array of booleans corresponding to the other two arrays. It's values at any given index are 'true'/'false' if both arr1 and arr2 are true/false at that index, and false if both arrays don't match at a given index. 
     */
    public static boolean[] logicalAnd(boolean[] arr1, boolean[] arr2) {
        boolean[] indicatorVariables = new boolean[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                if (arr1[i] == false) {
                    indicatorVariables[i] = false;
                }
                else {
                    indicatorVariables[i] = true;
                }
            }
            else {
                indicatorVariables[i] = false;
            }
        }
        
        return indicatorVariables;
    }

    /**
     * Checks through an array of booleans and counts the number of booleans that are true.
     * @param arr The given array of booleans.
     * @return The number of booleans in the array that are true.
     */
    public static int count(boolean[] arr) {
        int theCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true) {
                theCount = theCount + 1;
            }
            else if (arr[i] == false) {
                continue;
            }

        }

        return theCount;
    }

    /**
     * Indexes through an array of booleans and returns the index of the first boolean in the array that is true, if there are any. If no booleans are true, it returns -1.
     * @param arr The given array of booleans.
     * @return The index of the first true boolean in the array, or -1 if no booleans in the array are true.
     */
    public static int findFirst(boolean[] arr) {
        int index = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true) {
                return i;
            }
            else {
                continue;
            }
        }

        return index;
    }

    /**
     * Indexes through an array of booleans and returns an array with the indexes of true booleans in the array, if there are any. If there are none, the method returns an empty array.
     * @param arr The given array of booleans.
     * @return The indexes of true booleans in the array or an empty array, [], if there are none.
     */
    public static int[] find(boolean[] arr) {
        int theCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true) {
                theCount++;
            }
            else {
                continue;
            }
        }
        int[] locations = new int[theCount];
        int counter2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true) {
                locations[counter2] = i;
                counter2++;
            }
            else {
                continue;
            }
        }

        return locations;
    }

    /**
     * Takes in an array and returns the largest k values, a value that is defined based on when the method is called, in an array the length of k. Fills in each empty value with float.NaN if the value of k is larger than the size of the range.
     * @param arr The given array of floats.
     * @param lo The lowest value representing the beginning of the range.
     * @param hi The highest value representing the end of the range.
     * @param k The number of values returned.
     * @return The k value in an array the length of k.
     */
    public static float[] highest(float[] arr, int lo, int hi, int k) {
        float[] highestValues = new float[k];
        
        for (int j = 0; j < k; j++) {
            
            for (int i = 0; i < arr.length; i++) {
                float currentHighestValue = arr[i];
                
                if (highestValues[j] < arr[i]) {
                    System.out.println(Arrays.toString(arr) + " " + Arrays.toString(highestValues));
                    System.out.println(highestValues[j] + " prev value: " + currentHighestValue);
                    
                    if (j != 0 && highestValues[j-1] != highestValues[j]) {
                        System.out.println("in here!");
                        
                        if (currentHighestValue == highestValues[j-1]) {
                            if (k > arr.length) {
                                for (int q = 0; q < highestValues.length; q++) {
                                    if (currentHighestValue == highestValues[q]) {
                                        highestValues[q+1] = arr[j];
                                        highestValues[q+2] = Float.NaN;
                                    }
                                }
                            }
                            break;
                        }
                        else {
                            highestValues[j] = currentHighestValue;
                        }
                    }
                    highestValues[j] = arr[i];
                }
            }
        }
            
        return highestValues;
    }

    /**
     * Takes in an array and returns the smallest k values, a value that is defined based on when the method is called, in an array the length of k. Fills in each empty value with float.NaN if the value of k is larger than the size of the range.
     * @param arr The given array of floats.
     * @param lo The lowest value representing the beginning of the range.
     * @param hi The highest value representing the end of the range.
     * @param k The number of values returned.
     * @return The kth lowest numbers in the given array.
     */
    public static float[] lowest(float[] arr, int lo, int hi, int k) {
        float[] lowestValues = new float[k];
        lowestValues[0] = 99999;
        //Initializing all of the lowest values as 9999.
        for (int e = 0; e < k; e++) {
            lowestValues[e] = 99999;
        }
        
        for (int j = 0; j < k; j++) {
            
            for (int i = 0; i < arr.length; i++) {
                float currentLowestValue = arr[i]; 
                
                if (lowestValues[j] > arr[i]) {
                    System.out.println(Arrays.toString(arr) + " " + Arrays.toString(lowestValues));
                    System.out.println(lowestValues[j] + " prev value: " + currentLowestValue);
                    
                    if (j != 0 && lowestValues[j-1] != lowestValues[j]) {
                        System.out.println("in here!");
                        
                        if (currentLowestValue == lowestValues[j-1]) {
                            if (k > arr.length) {
                                for (int q = 0; q < lowestValues.length; q++) {
                                    if (currentLowestValue == lowestValues[q]) {
                                        lowestValues[q] = arr[j];
                                        lowestValues[q+1] = Float.NaN;
                                    }
                                }
                            }
                            break;
                        }
                        else {
                            lowestValues[j] = currentLowestValue;
                        }
                    }
                    lowestValues[j] = arr[i];
                }
            }
        }
            
        return lowestValues;
    }

    

    
    public static void main(String[] args) {

        float[] arr = {1.0f, -9999.0f, 3.0f, 2.0f};
        boolean[] indicatorVariables = {true, false, true, true};
        System.out.println(mean(arr, indicatorVariables, 0, 4));

        // float[] arr2 = {1.0f, 2.0f, 3.0f, 4.0f};
        // System.out.println(Arrays.toString(highest(arr2, 0, 4, 2)));

        float[] arr3 = {4.0f, 3.0f};
        System.out.println((Arrays.toString(lowest(arr3, 0, 2, 3))));






    

    }
   
}
