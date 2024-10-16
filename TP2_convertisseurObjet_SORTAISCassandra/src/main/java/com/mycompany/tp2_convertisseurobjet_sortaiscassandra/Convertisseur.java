/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_convertisseurobjet_sortaiscassandra;

/**
 *
 * @author cassandrasortais
 */
public class Convertisseur {

    private int nbConversions;

    public Convertisseur() {
        nbConversions = 0;
    }

    public double CelciusVersKelvin(double tCelsius) {
        nbConversions++;
        return tCelsius + 273.15;
    }

    public double KelvinVersCelcius(double tKelvin) {
        nbConversions++;
        return tKelvin - 273.15;
    }

    public double FarenheitVersCelcius(double tFahrenheit) {
        nbConversions++;
        return (tFahrenheit - 32) * 5 / 9;
    }

    public double CelciusVersFarenheit(double tCelsius) {
        nbConversions++;
        return (tCelsius * 9 / 5) + 32;
    }

    public double KelvinVersFarenheit(double tKelvin) {
        nbConversions++;
        double celsius = KelvinVersCelcius(tKelvin);
        return CelciusVersFarenheit(celsius);
    }

    public double FarenheitVersKelvin(double tFahrenheit) {
        nbConversions++;
        double celsius = FarenheitVersCelcius(tFahrenheit);
        return CelciusVersKelvin(celsius);
    }

    @Override
    public String toString() {
        return "nb de conversions: " + nbConversions;
    }
}
