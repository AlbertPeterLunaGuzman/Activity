package com.mycompany.tempconverter;
public class temperatureConverter extends TempConverter{
    public double celsiusToFahrenheit (double celsius) { return (celsius * 9 / 5) + 32; }
    public double fahrenheitToCelsius (double farenheit){ return (farenheit - 32)* 5 / 9; }
}
