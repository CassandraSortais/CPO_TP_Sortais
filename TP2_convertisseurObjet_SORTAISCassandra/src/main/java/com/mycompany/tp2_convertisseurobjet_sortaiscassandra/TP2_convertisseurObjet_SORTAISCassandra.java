/*
SORTAIS Cassandra
TDC Groupe 1
TP2-EXERCICE2
16 Ooctobre 2024
 */
package com.mycompany.tp2_convertisseurobjet_sortaiscassandra;

import java.util.Scanner;

/**
 *
 * @author cassandrasortais
 */
public class TP2_convertisseurObjet_SORTAISCassandra {

    public static void main(String[] args) {
       
        try ( 
                Scanner scanner = new Scanner(System.in)) {
            
            Convertisseur convertisseur = new Convertisseur();
            while (true) {
               
                System.out.println("\n--- Menu de Conversion de Temperatures ---");
                System.out.println("1) De Celsius vers Kelvin");
                System.out.println("2) De Kelvin vers Celsius");
                System.out.println("3) De Fahrenheit vers Celsius");
                System.out.println("4) De Celsius vers Fahrenheit");
                System.out.println("5) De Kelvin vers Fahrenheit");
                System.out.println("6) De Fahrenheit vers Kelvin");
                System.out.println("7) Quitter");
                System.out.print("Choisissez une option (1-7): ");

                
                int choix = scanner.nextInt();

                
                if (choix == 7) {
                    System.out.println("Merci d'avoir utilise le convertisseur !");
                    break; 
                }

                
                System.out.print("Saisissez la temperature a convertir: ");
                double temperature = scanner.nextDouble();

                
                double resultat = 0.0;
                String uniteInitiale = "";
                String uniteFinale = "";

                
                switch (choix) {
                    case 1:
                        resultat = convertisseur.CelciusVersKelvin(temperature);
                        uniteInitiale = "Celsius";
                        uniteFinale = "Kelvin";
                        break;
                    case 2:
                        resultat = convertisseur.KelvinVersCelcius(temperature);
                        uniteInitiale = "Kelvin";
                        uniteFinale = "Celsius";
                        break;
                    case 3:
                        resultat = convertisseur.FarenheitVersCelcius(temperature);
                        uniteInitiale = "Fahrenheit";
                        uniteFinale = "Celsius";
                        break;
                    case 4:
                        resultat = convertisseur.CelciusVersFarenheit(temperature);
                        uniteInitiale = "Celsius";
                        uniteFinale = "Fahrenheit";
                        break;
                    case 5:
                        resultat = convertisseur.KelvinVersFarenheit(temperature);
                        uniteInitiale = "Kelvin";
                        uniteFinale = "Fahrenheit";
                        break;
                    case 6:
                        resultat = convertisseur.FarenheitVersKelvin(temperature);
                        uniteInitiale = "Fahrenheit";
                        uniteFinale = "Kelvin";
                        break;
                    default:
                        System.out.println("Choix non valide. Veuillez reessayer.");
                        continue; 
                }

                
                System.out.printf("%.2f degres %s est egal a %.2f degres %s.\n", temperature, uniteInitiale, resultat, uniteFinale);

                
                System.out.println("Nombre total de conversions effectuees: " + convertisseur);

                
                break;
            }
            
        }
    }
}
