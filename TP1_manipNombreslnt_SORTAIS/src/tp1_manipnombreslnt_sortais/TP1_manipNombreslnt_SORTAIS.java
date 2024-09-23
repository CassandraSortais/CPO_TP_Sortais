/*
SORTAIS Cassandra
TDC - Groupe 1 
23 Septembre 2024
 */
package tp1_manipnombreslnt_sortais;

import java.util.Scanner;

/**
 *
 * @author virgi
 */
public class TP1_manipNombreslnt_SORTAIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try ( Scanner scanner = new Scanner(System.in)) {
            System.out.print("Veuillez saisir le premier entier : ");
            int entier1 = scanner.nextInt();

            System.out.print("Veuillez saisir le deuxième entier : ");
            int entier2 = scanner.nextInt();

            System.out.println("Le premier entier saisi est : " + entier1);
            System.out.println("Le deuxième entier saisi est : " + entier2);

            int somme = entier1 + entier2;
            int difference = entier1 - entier2;
            int produit = entier1 * entier2;

            System.out.println("La somme des deux nombres est : " + somme);
            System.out.println("La différence entre les deux nombres est : " + difference);
            System.out.println("Le produit des deux nombres est : " + produit);

            if (entier2 != 0) {
                int quotient = entier1 / entier2;
                int reste = entier1 % entier2;

                
                System.out.println("Le quotient entier de la division du premier par le deuxième est : " + quotient);
                System.out.println("Le reste de la division euclidienne du premier par le deuxième est : " + reste);
            } else {
                System.out.println("La division par zéro n'est pas possible.");
            }
            scanner.close();
        }
    }

}
