package a1;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Reads and prints data from the 'YUMA_2023' text file, including the annual mean temperature, the minimum average daily temperature, and the mean temperature in specific months.
 */
public class ClimateQueries {

   
    public static void main(String[] args) {
      int i = 0;
      float[] dailyTemperatures = new float[226];

      String filename = (args.length > 0) ? args[0] : "YUMA_2023.txt";
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
      System.out.println("Annual mean temperature: " + ArrayMethods.mean(dailyTemperatures, 0, 226) + " degrees Celsius.");
      System.out.println("Minimum average daily temperature: " + ArrayMethods.min(dailyTemperatures, 0, 226) + " degrees Celsius.");
      System.out.println("Mean temperature in January: " + ArrayMethods.mean(dailyTemperatures, 0, 31) + " degrees Celsius.");
      System.out.println("Mean temperature in July: " + ArrayMethods.mean(dailyTemperatures, 181, 212) + " degrees Celsius.");
      file.close();
    }
}


/*
Source file: YUMA_2023.txt
Annual mean temperature: 25.6 degrees Celsius
Minimum average daily temperature: -2.7 degrees Celsius
Maximum average daily temperature: 37.4 degrees Celsius
Mean temperature in January: 8.4 degrees Celsius
Mean temperature in July: 29.8 degrees Celsius
*/