package com.mycompany.tempconverter;
import java.util.*;
public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a farenheit value: ");
        double farenheit = scanner.nextDouble();
        System.out.print("Enter a celsius value: ");
        double celsius = scanner.nextDouble();
        
        temperatureConverter tCon = new temperatureConverter();
        
        double[] convertedTemps = {tCon.celsiusToFahrenheit(celsius),
                                    tCon.fahrenheitToCelsius(farenheit)};
        System.out.println("Celsius to Fahrenheit: " +  convertedTemps[0]);
        
        System.out.println("Fahrenheit to Celsius: " + convertedTemps[1]);
    }
}
