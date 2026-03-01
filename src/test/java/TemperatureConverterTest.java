import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest
{
    TemperatureConverter temperatureConverter = new TemperatureConverter();

    @DisplayName("fahrenheitToCelsius")
    @Test
    void fahrenheitToCelsius()
    {
        assertEquals(5.00d, temperatureConverter.fahrenheitToCelsius(41.00d));
        assertEquals(0.00d, temperatureConverter.fahrenheitToCelsius(32.00d));
        assertEquals(-15.00d, temperatureConverter.fahrenheitToCelsius(5.00d));
    }

    @DisplayName("celsiusToFahrenheit")
    @Test
    void celsiusToFahrenheit()
    {
        assertEquals(41.00d, temperatureConverter.celsiusToFahrenheit(5.00d));
        assertEquals(32.00d, temperatureConverter.celsiusToFahrenheit(0.00d));
        assertEquals(-31.00d, temperatureConverter.celsiusToFahrenheit(-35.00d));
    }

    @DisplayName("isExtremeTemperature")
    @Test
    void isExtremeTemperature() {
        assertTrue(temperatureConverter.isExtremeTemperature(-41.0));
        assertTrue(temperatureConverter.isExtremeTemperature(51.0));
        assertFalse(temperatureConverter.isExtremeTemperature(-20.0));
        assertFalse(temperatureConverter.isExtremeTemperature(20.0));
        assertFalse(temperatureConverter.isExtremeTemperature(0.0));
    }

    @DisplayName("kelvinToCelsius")
    @Test
    void kelvinToCelsius()
    {
        assertEquals(26.85d, temperatureConverter.kelvinToCelsius(300.00d), 0.001d);
        assertEquals(0.00d, temperatureConverter.kelvinToCelsius(273.15d), 0.001d);
        assertEquals(-273.15d, temperatureConverter.kelvinToCelsius(0.00d), 0.001d);
    }
}
