package celsiustofahrenheit;

public class Utils {
    private static final double ZERO_ABSOLUTO = -459.67;    // Zero absoluto em Fahrenheit

    private Utils() {
    }

    public static double toCelsius(double temp) throws FahrenheitException {
        if (temp < ZERO_ABSOLUTO)
            throw new FahrenheitException("Temperatura passada (" + temp + "°F) menor do que o zero absoluto em Fahrenheit (" + ZERO_ABSOLUTO + "°F)");

        return 5 * ((temp - 32) / 9);
    }

}
