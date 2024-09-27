
import java.util.Random;
import java.util.Scanner;

/*
SORTAIS CASSANDRA 
TDC - GROUPE 1
27 Septembre 2024
package tp1_guessmynumber_nom1;

/**
 *
 * @author virgi
 */
public class TP1_guessMyNumber_NOM1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Random generateurAleat = new Random();
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Choisissez un niveau de difficulte :");
        System.out.println("1) Facile");
        System.out.println("2) Normal");
        System.out.println("3) Difficile");
        int difficulte = scanner.nextInt();

        int maxTentatives;
        int plageNombre;

        
        switch (difficulte) {
            case 1 -> {
                // Facile
                maxTentatives = 10;
                plageNombre = 50; 
            }
            case 2 -> {
                // Normal
                maxTentatives = 7;
                plageNombre = 100; 
            }
            case 3 -> {
                // Difficile
                maxTentatives = 5;
                plageNombre = 100; 
            }
            default -> {
                System.out.println("Difficulte non valide. Par defaut, normal est selectionne.");
                maxTentatives = 7;
                plageNombre = 100;
            }
        }

        
        int n = generateurAleat.nextInt(plageNombre + 1); 

        System.out.println("Bienvenue ! Essayez de deviner le nombre aléatoire entre 0 et " + plageNombre + ".");

        
        int utilisateurNombre = -1; 
        int tentatives = 0; 

        while (utilisateurNombre != n && tentatives < maxTentatives) {
            
            System.out.print("Veuillez saisir un nombre entre 0 et " + plageNombre + ": ");
            utilisateurNombre = scanner.nextInt();
            tentatives++; 

            
            if (utilisateurNombre < 0 || utilisateurNombre > plageNombre) {
                System.out.println("Le nombre saisi n'est pas valide. Veuillez saisir un nombre entre 0 et " + plageNombre + ".");
                tentatives--;
            } else {
                
                if (utilisateurNombre < n) {
                    if (n - utilisateurNombre > 20) {
                        System.out.println("Vraiment trop petit !");
                    } else {
                        System.out.println("Trop petit !");
                    }
                } else if (utilisateurNombre > n) {
                    if (utilisateurNombre - n > 20) {
                        System.out.println("Vraiment trop grand !");
                    } else {
                        System.out.println("Trop grand !");
                    }
                } else {
                    System.out.println("Gagne !");
                }
            }
        }

    }
}
