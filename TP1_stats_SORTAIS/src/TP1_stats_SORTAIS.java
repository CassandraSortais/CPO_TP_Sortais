
import java.util.Random;
import java.util.Scanner;

/*
SORTAIS CASSANDRA
TDC - GROUPE 1
27 Septembre 2024

package tp1_stats_sortais;

/**
 *
 * @author virgi
 */
public class TP1_stats_SORTAIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random generateurAleat = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir un nombre entier m : ");
        int m = scanner.nextInt();

        int[] facesDe = new int[6];

        for (int i = 0; i < m; i++) {

            int nombreAleatoire = generateurAleat.nextInt(6);

            facesDe[nombreAleatoire]++;
        }

        System.out.println("Resultats des tirages (en pourcentage) :");
        for (int i = 0; i < facesDe.length; i++) {
            double pourcentage = (facesDe[i] / (double) m) * 100;
            System.out.printf("Face %d : %.2f%%\n", (i + 1), pourcentage);
        }

        scanner.close();
    }
}
