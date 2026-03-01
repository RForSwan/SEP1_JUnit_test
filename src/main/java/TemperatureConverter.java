public class TemperatureConverter
{
    public double fahrenheitToCelsius(double tempFahrenheit)
    {
        return (tempFahrenheit - 32) * 5 / 9;
    }

    public double celsiusToFahrenheit(double tempCelsius)
    {
        return tempCelsius * 9 / 5 + 32;
    }

    public boolean isExtremeTemperature(double tempCelsius)
    {
        return tempCelsius < -40 || tempCelsius > 50;
    }

    public double kelvinToCelsius(double tempKelvin)
    {
        return tempKelvin - 273.15;
    }



}

