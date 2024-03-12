

public class main {
    /**
     * @param args
     */
    public static void Main(String[] args) {
        double celsius = 25;
        double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);
        double kelvin = TemperatureConverter.celsiusToKelvin(celsius);

        System.out.printf("%.2f°C is equal to %.2f°F and %.2fK%n", celsius, fahrenheit, kelvin);
    }
}
