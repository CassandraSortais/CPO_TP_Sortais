/*
SORTAIS Cassandra
TDC- Groupe 1  
23 Septembre 2024
 */
package tp1_convertisseur_sortais;

import java.util.Scanner;

/**
 *
 * @author virgi
 */
public class TP1_convertisseur_SORTAIS {

    public static double CelciusVersKelvin(double tCelcius) {
        return tCelcius + 273.15;
    }

    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15;
    }

    // Méthode de conversion des degrés Fahrenheit en degrés Celsius
    public static double FarenheitVersCelcius(double tFahrenheit) {
        return (tFahrenheit - 32) * 5 / 9;
    }

    // Méthode de conversion des degrés Celsius en degrés Fahrenheit
    public static double CelciusVersFarenheit(double tCelcius) {
        return (tCelcius * 9 / 5) + 32;
    }

    // Méthode de conversion des degrés Kelvin en degrés Fahrenheit (via Celsius)
    public static double KelvinVersFarenheit(double tKelvin) {
        double tCelcius = KelvinVersCelcius(tKelvin);
        return CelciusVersFarenheit(tCelcius);
    }

    // Méthode de conversion des degrés Fahrenheit en degrés Kelvin (via Celsius)
    public static double FarenheitVersKelvin(double tFahrenheit) {
        double tCelcius = FarenheitVersCelcius(tFahrenheit);
        return CelciusVersKelvin(tCelcius);

    }

    public static void main(String[] args) {

        try ( Scanner scanner = new Scanner(System.in)) {

            System.out.print("Bonjour, saisissez une valeur : ");

            double valeur = scanner.nextDouble();

            double temperatureKelvin = valeur + 273.15;

            System.out.println("La température saisie en degrés Celsius est : " + valeur + "°C");

            System.out.println("La température correspondante en degrés Kelvin est : " + temperatureKelvin + "K");

            System.out.println("Saisissez la conversion que vous souhaitez effectuer : ");
            System.out.println("1) De Celsius vers Kelvin");
            System.out.println("2) De Kelvin vers Celsius");
            System.out.println("3) De Fahrenheit vers Celsius");
            System.out.println("4) De Celsius vers Fahrenheit");
            System.out.println("5) De Kelvin vers Fahrenheit");
            System.out.println("6) De Fahrenheit vers Kelvin");

            // Lecture du choix de l'utilisateur
            System.out.print("Votre choix : ");
            int choix = scanner.nextInt();

            // Traitement du choix
            switch (choix) {
                case 1 -> {
                    // Conversion de Celsius vers Kelvin
                    double tempKelvin = CelciusVersKelvin(valeur);
                    System.out.println(valeur + " degrés Celsius est égal à " + tempKelvin + " degrés Kelvin.");
                }

                case 2 -> {
                    // Conversion de Kelvin vers Celsius
                    double tempCelsiusFromKelvin = KelvinVersCelcius(valeur);
                    System.out.println(valeur + " degrés Kelvin est égal à " + tempCelsiusFromKelvin + " degrés Celsius.");
                }

                case 3 -> {
                    // Conversion de Fahrenheit vers Celsius
                    double tempCelsiusFromFahrenheit = FarenheitVersCelcius(valeur);
                    System.out.println(valeur + " degrés Fahrenheit est égal à " + tempCelsiusFromFahrenheit + " degrés Celsius.");
                }

                case 4 -> {
                    // Conversion de Celsius vers Fahrenheit
                    double tempFahrenheit = CelciusVersFarenheit(valeur);
                    System.out.println(valeur + " degrés Celsius est égal à " + tempFahrenheit + " degrés Fahrenheit.");
                }

                case 5 -> {
                    // Conversion de Kelvin vers Fahrenheit
                    double tempFahrenheitFromKelvin = KelvinVersFarenheit(valeur);
                    System.out.println(valeur + " degrés Kelvin est égal à " + tempFahrenheitFromKelvin + " degrés Fahrenheit.");
                }

                case 6 -> {
                    // Conversion de Fahrenheit vers Kelvin
                    double tempKelvinFromFahrenheit = FarenheitVersKelvin(valeur);
                    System.out.println(valeur + " degrés Fahrenheit est égal à " + tempKelvinFromFahrenheit + " degrés Kelvin.");
                }

                default ->
                    System.out.println("Choix invalide. Veuillez relancer le programme.");
            }
        }
    }
}
