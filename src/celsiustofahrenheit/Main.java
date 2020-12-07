package celsiustofahrenheit;

public class Main {

    public static void main(String[] args) throws FahrenheitException {
        System.out.println("87°F -> " + Utils.toCelsius(87) + "°C");
        System.out.println("-459.67°F -> " + Utils.toCelsius(-459.67) + "°C");
        System.out.println("-500°F -> " + Utils.toCelsius(-500) + "°C");
    }
}
