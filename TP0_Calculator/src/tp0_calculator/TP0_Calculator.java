/* 
SORTAIS Cassandra
TD C - Groupe 1 
Septembre 2024

 */
package tp0_calculator;

import java.util.Scanner;

/**
 *
 * @author virgi
 */
public class TP0_Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /* EXERCICE 2
         */
        
        System.out.println("Entrer le premier opérateur:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");

        // EXERCICE 3  
        try ( 
                 Scanner scanner = new Scanner(System.in)) {
            
            int Operateur = scanner.nextInt();
            
            System.out.println("Opérateur choisi : " + Operateur);
            
            // EXERCICE 4 
        System.out.println("Entrer le premier opérateur (Operateur1):");
        double Operateur1 = scanner.nextDouble();

       
        System.out.println("Opérateur1 : " + Operateur1);

        
        // EXERCICE 5 
        System.out.println("Entrer le premier opérateur (Operateur2):");
        double Operateur2 = scanner.nextDouble();

        // EXERCICE 6 
        double resultat = 0;
        boolean operationValide = true;

        switch (Operateur) {
            case 1: // Addition
                resultat = Operateur1 + Operateur2;
                break;
            case 2: // Soustraction
                resultat = Operateur1 - Operateur2;
                break;
            case 3: // Multiplication
                resultat = Operateur1 * Operateur2;
                break;
            case 4: // Division
                if (Operateur2 != 0) {
                    resultat = Operateur1 / Operateur2;
                } else {
                    System.out.println("Erreur : Division par zéro!");
                    operationValide = false;
                }
                break;
            case 5: // Modulo
                if (Operateur2 != 0) {
                    resultat = Operateur1 % Operateur2;
                } else {
                    System.out.println("Erreur : Division par zéro pour le modulo!");
                    operationValide = false;
                }
                break;
            default:
                System.out.println("Erreur : Opérateur invalide.");
                operationValide = false;
                break;
        }

        // Afficher le résultat si l'opération est valide
        if (operationValide) {
            System.out.println("Le résultat de l'opération est : " + resultat);
        }

        // Fermeture du scanner
        scanner.close();
            
        }
    }
}
