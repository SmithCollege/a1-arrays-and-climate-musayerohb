package a1;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Scanner;

import org.checkerframework.checker.units.qual.degrees;

import java.util.Arrays;

/**
 * Analyzes and categorizes data from a collection of text files covering multiple years of data, including the average daily temperature of the full year, the first day with an average temperature that exceeds the annual average from the first year of data, and the number of days with temperatures over 30 degrees Celcius.
 */
public class ClimateStudy {
    public static void main(String[] args) {
      
      /* 2016 */
      int i = 0;
      float[] dailyTemperatures = new float[366];
     
      String filename = (args.length > 0) ? args[0] : "CRND0103-2016-NY_Millbrook_3_W.txt";
      Scanner file = null;
      try {
        file = new Scanner(new File(filename));
      } catch (FileNotFoundException e) {
        System.err.println("Cannot locate file.");
        System.exit(-1);
      }
      while (file.hasNextLine()) {
        String line = file.nextLine();
        String[] fields = line.split("\\s+");
        String date = fields[1];
        float temperature = Float.valueOf(fields[8]);
        dailyTemperatures[i] = temperature;
        //System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
        i++;
      }
      System.out.println("Source file: " + filename);
      boolean[] validArray = ArrayMethods.isEqualTo(dailyTemperatures, -9999.0f);
      System.out.println("Average daily temperature of the full year: " + ArrayMethods.mean(dailyTemperatures, ArrayMethods.logicalNot(validArray), 0, 366));
      boolean[] greaterThan30 = ArrayMethods.isGreaterThan(dailyTemperatures, 30);
      System.out.println("Number of days with temperatures over 30 degrees Celcius: " + ArrayMethods.count(greaterThan30));
      file.close();
      


      /* 2017 */
      i = 0;
      dailyTemperatures = new float[365];

      filename = (args.length > 0) ? args[0] : "CRND0103-2017-NY_Millbrook_3_W.txt";
      file = null;
      try {
        file = new Scanner(new File(filename));
      } catch (FileNotFoundException e) {
        System.err.println("Cannot locate file.");
        System.exit(-1);
      }
      while (file.hasNextLine()) {
        String line = file.nextLine();
        String[] fields = line.split("\\s+");
        String date = fields[1];
        float temperature = Float.valueOf(fields[8]);
        dailyTemperatures[i] = temperature;
        //System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
        i++;
      }

      System.out.println("\nSource file: " + filename);
      validArray = ArrayMethods.isEqualTo(dailyTemperatures, -9999.0f);
      System.out.println("Average daily temperature of the full year: " + ArrayMethods.mean(dailyTemperatures, ArrayMethods.logicalNot(validArray), 0, 365));
      
      boolean[] greaterThanFirstYear = ArrayMethods.isGreaterThan(dailyTemperatures, 10.522132f);
      System.out.println("The first day with an average temperature that exceeds the annual average from the first year of data: " + ArrayMethods.count(greaterThanFirstYear) + "th day.");

      greaterThan30 = ArrayMethods.isGreaterThan(dailyTemperatures, 30);
      System.out.println("Number of days with temperatures over 30 degrees Celcius: " + ArrayMethods.count(greaterThan30));
      file.close();



      /* 2018 */
      i = 0;
      dailyTemperatures = new float[365];

      filename = (args.length > 0) ? args[0] : "CRND0103-2018-NY_Millbrook_3_W.txt";
      file = null;
      try {
        file = new Scanner(new File(filename));
      } catch (FileNotFoundException e) {
        System.err.println("Cannot locate file.");
        System.exit(-1);
      }
      while (file.hasNextLine()) {
        String line = file.nextLine();
        String[] fields = line.split("\\s+");
        String date = fields[1];
        float temperature = Float.valueOf(fields[8]);
        dailyTemperatures[i] = temperature;
        //System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
        i++;
      }

      System.out.println("\nSource file: " + filename);
      validArray = ArrayMethods.isEqualTo(dailyTemperatures, -9999.0f);
      System.out.println("Average daily temperature of the full year: " + ArrayMethods.mean(dailyTemperatures, ArrayMethods.logicalNot(validArray), 0, 365));
      
      greaterThanFirstYear = ArrayMethods.isGreaterThan(dailyTemperatures, 10.522132f);
      System.out.println("The first day with an average temperature that exceeds the annual average from the first year of data: " + ArrayMethods.count(greaterThanFirstYear) + "th day.");

      greaterThan30 = ArrayMethods.isGreaterThan(dailyTemperatures, 30);
      System.out.println("Number of days with temperatures over 30 degrees Celcius: " + ArrayMethods.count(greaterThan30));
      file.close();



      /* 2019 */
      i = 0;
      dailyTemperatures = new float[365];

      filename = (args.length > 0) ? args[0] : "CRND0103-2019-NY_Millbrook_3_W.txt";
      file = null;
      try {
        file = new Scanner(new File(filename));
      } catch (FileNotFoundException e) {
        System.err.println("Cannot locate file.");
        System.exit(-1);
      }
      while (file.hasNextLine()) {
        String line = file.nextLine();
        String[] fields = line.split("\\s+");
        String date = fields[1];
        float temperature = Float.valueOf(fields[8]);
        dailyTemperatures[i] = temperature;
        //System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
        i++;
      }

      System.out.println("\nSource file: " + filename);
      validArray = ArrayMethods.isEqualTo(dailyTemperatures, -9999.0f);
      System.out.println("Average daily temperature of the full year: " + ArrayMethods.mean(dailyTemperatures, ArrayMethods.logicalNot(validArray), 0, 365));
      
      greaterThanFirstYear = ArrayMethods.isGreaterThan(dailyTemperatures, 10.522132f);
      System.out.println("The first day with an average temperature that exceeds the annual average from the first year of data: " + ArrayMethods.count(greaterThanFirstYear) + "th day.");

      greaterThan30 = ArrayMethods.isGreaterThan(dailyTemperatures, 30);
      System.out.println("Number of days with temperatures over 30 degrees Celcius: " + ArrayMethods.count(greaterThan30));
      file.close();



      /* 2020 */
      i = 0;
      dailyTemperatures = new float[366];

      filename = (args.length > 0) ? args[0] : "CRND0103-2020-NY_Millbrook_3_W.txt";
      file = null;
      try {
        file = new Scanner(new File(filename));
      } catch (FileNotFoundException e) {
        System.err.println("Cannot locate file.");
        System.exit(-1);
      }
      while (file.hasNextLine()) {
        String line = file.nextLine();
        String[] fields = line.split("\\s+");
        String date = fields[1];
        float temperature = Float.valueOf(fields[8]);
        dailyTemperatures[i] = temperature;
        //System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
        i++;
      }

      System.out.println("\nSource file: " + filename);
      validArray = ArrayMethods.isEqualTo(dailyTemperatures, -9999.0f);
      System.out.println("Average daily temperature of the full year: " + ArrayMethods.mean(dailyTemperatures, ArrayMethods.logicalNot(validArray), 0, 366));
      
      greaterThanFirstYear = ArrayMethods.isGreaterThan(dailyTemperatures, 10.522132f);
      System.out.println("The first day with an average temperature that exceeds the annual average from the first year of data: " + ArrayMethods.count(greaterThanFirstYear) + "th day.");

      greaterThan30 = ArrayMethods.isGreaterThan(dailyTemperatures, 30);
      System.out.println("Number of days with temperatures over 30 degrees Celcius: " + ArrayMethods.count(greaterThan30));
      file.close();



      /* 2021 */
      i = 0;
      dailyTemperatures = new float[365];

      filename = (args.length > 0) ? args[0] : "CRND0103-2021-NY_Millbrook_3_W.txt";
      file = null;
      try {
        file = new Scanner(new File(filename));
      } catch (FileNotFoundException e) {
        System.err.println("Cannot locate file.");
        System.exit(-1);
      }
      while (file.hasNextLine()) {
        String line = file.nextLine();
        String[] fields = line.split("\\s+");
        String date = fields[1];
        float temperature = Float.valueOf(fields[8]);
        dailyTemperatures[i] = temperature;
        //System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
        i++;
      }

      System.out.println("\nSource file: " + filename);
      validArray = ArrayMethods.isEqualTo(dailyTemperatures, -9999.0f);
      System.out.println("Average daily temperature of the full year: " + ArrayMethods.mean(dailyTemperatures, ArrayMethods.logicalNot(validArray), 0, 365));
      
      greaterThanFirstYear = ArrayMethods.isGreaterThan(dailyTemperatures, 10.522132f);
      System.out.println("The first day with an average temperature that exceeds the annual average from the first year of data: " + ArrayMethods.count(greaterThanFirstYear) + "th day.");

      greaterThan30 = ArrayMethods.isGreaterThan(dailyTemperatures, 30);
      System.out.println("Number of days with temperatures over 30 degrees Celcius: " + ArrayMethods.count(greaterThan30));
      file.close();



      /* 2022 */
      i = 0;
      dailyTemperatures = new float[365];

      filename = (args.length > 0) ? args[0] : "CRND0103-2022-NY_Millbrook_3_W.txt";
      file = null;
      try {
        file = new Scanner(new File(filename));
      } catch (FileNotFoundException e) {
        System.err.println("Cannot locate file.");
        System.exit(-1);
      }
      while (file.hasNextLine()) {
        String line = file.nextLine();
        String[] fields = line.split("\\s+");
        String date = fields[1];
        float temperature = Float.valueOf(fields[8]);
        dailyTemperatures[i] = temperature;
        //System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
        i++;
      }

      System.out.println("\nSource file: " + filename);
      validArray = ArrayMethods.isEqualTo(dailyTemperatures, -9999.0f);
      System.out.println("Average daily temperature of the full year: " + ArrayMethods.mean(dailyTemperatures, ArrayMethods.logicalNot(validArray), 0, 365));
      
      greaterThanFirstYear = ArrayMethods.isGreaterThan(dailyTemperatures, 10.522132f);
      System.out.println("The first day with an average temperature that exceeds the annual average from the first year of data: " + ArrayMethods.count(greaterThanFirstYear) + "th day.");

      greaterThan30 = ArrayMethods.isGreaterThan(dailyTemperatures, 30);
      System.out.println("Number of days with temperatures over 30 degrees Celcius: " + ArrayMethods.count(greaterThan30));
      file.close();



      /* 2023 */
      i = 0;
      dailyTemperatures = new float[264];

      filename = (args.length > 0) ? args[0] : "CRND0103-2023-NY_Millbrook_3_W.txt";
      file = null;
      try {
        file = new Scanner(new File(filename));
      } catch (FileNotFoundException e) {
        System.err.println("Cannot locate file.");
        System.exit(-1);
      }
      while (file.hasNextLine()) {
        String line = file.nextLine();
        String[] fields = line.split("\\s+");
        String date = fields[1];
        float temperature = Float.valueOf(fields[8]);
        dailyTemperatures[i] = temperature;
        //System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
        i++;
      }

      System.out.println("\nSource file: " + filename);
      validArray = ArrayMethods.isEqualTo(dailyTemperatures, -9999.0f);
      System.out.println("Average daily temperature of the full year: " + ArrayMethods.mean(dailyTemperatures, ArrayMethods.logicalNot(validArray), 0, 264));
      
      greaterThanFirstYear = ArrayMethods.isGreaterThan(dailyTemperatures, 10.522132f);
      System.out.println("The first day with an average temperature that exceeds the annual average from the first year of data: " + ArrayMethods.count(greaterThanFirstYear) + "th day.");

      greaterThan30 = ArrayMethods.isGreaterThan(dailyTemperatures, 30);
      System.out.println("Number of days with temperatures over 30 degrees Celcius: " + ArrayMethods.count(greaterThan30));
      file.close();
    
    float[] averageDailyTemperatures8Years = {10.522132f, 9.990107f, 9.877471f, 9.164425f, 10.701091f, 10.422866f, 10.209043f, 12.022135f};
    System.out.println(Arrays.toString(averageDailyTemperatures8Years));
    float[] greaterThanFirstYear7Years = {193, 177, 172, 174, 191, 186, 151};
    System.out.println(Arrays.toString(greaterThanFirstYear7Years));
    float[] greaterThan308Years = {0, 0, 0, 0, 0, 0, 0, 0};
    System.out.println(Arrays.toString(greaterThan308Years));

    // // Now divide the period into a first half and a second half, and compute the average of each of these quantities for both groups.
    // // Does the second half seem warmer than the first? (Of course, one should do a much more rigorous statistical analysis before drawing any real conclusions. However, that would go far beyond the scope of this assignment.)

    // //Half One: 2016-2019
    System.out.println("\n2016-2019: \nAverage Daily Temperature: " + ArrayMethods.mean(averageDailyTemperatures8Years, 0, 3));
    System.out.println("\nThe first day with an average temperature that exceeds the annual average from the first year of data: : " + ArrayMethods.mean(greaterThanFirstYear7Years, 0, 3));
    System.out.println("\nNumber of days with temperatures over 30 degrees Celcius: " + ArrayMethods.mean(greaterThan308Years, 0, 3));;

    //Half Two: 2020-2023
    System.out.println("\n2020-2023: \nAverage Daily Temperature: " + ArrayMethods.mean(averageDailyTemperatures8Years, 4, 7));
    System.out.println("\nThe first day with an average temperature that exceeds the annual average from the first year of data: : " + ArrayMethods.mean(greaterThanFirstYear7Years, 4, 7));
    System.out.println("\nNumber of days with temperatures over 30 degrees Celcius: " + ArrayMethods.mean(greaterThan308Years, 4, 7));;
    
    
    }


}