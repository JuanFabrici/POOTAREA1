public class ConversorTemperatura {
    public static void main(String[] args) {
        // Temperatura en Celsius como un tipo primitivo
        double temperaturaCelsius = 25.0;

        // Conversión a Fahrenheit
        double temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;

        // Conversión a Kelvin
        double temperaturaKelvin = temperaturaCelsius + 273.15;

        // Imprimimos las conversiones
        System.out.println("Temperatura en Celsius: " + temperaturaCelsius);
        System.out.println("Temperatura en Fahrenheit: " + temperaturaFahrenheit);
        System.out.println("Temperatura en Kelvin: " + temperaturaKelvin);
    }
}
