
import tp2_bieres_sortais.BouteilleBiere;

/*
SORTAIS Cassandra
TDC Groupe 1
11 Octobre 2024
package tp2_bieres_sortais;

/**
 *
 * @author virgi
 */
public class TP2_Bieres_SORTAIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        // TODO code application logic here
       
    // Création de plusieurs bouteilles de bière
    BouteilleBiere uneBiere1 = new BouteilleBiere("Cuvee des trolls", 7.0f, "Dubuisson");
    BouteilleBiere uneBiere2 = new BouteilleBiere("Leffe", 6.6f, "Abbaye de Leffe");
    BouteilleBiere uneBiere3 = new BouteilleBiere("Chimay Bleue", 9.0f, "Abbaye de Scourmont");
    BouteilleBiere uneBiere4 = new BouteilleBiere("Heineken", 5.0f, "Heineken International");
    BouteilleBiere uneBiere5 = new BouteilleBiere("Guinness", 4.2f, "St. James's Gate Brewery");

    // Affichage des étiquettes avant décapsulage
    System.out.println("Avant decapsulage :");
    System.out.println(uneBiere1);
    System.out.println(uneBiere2);
    System.out.println(uneBiere3);
    System.out.println(uneBiere4);
    System.out.println(uneBiere5);

    // Décapsulage de quelques bières
    uneBiere1.Decapsuler(); // Décapsule la première bière
    uneBiere3.Decapsuler(); // Décapsule la troisième bière
    uneBiere4.Decapsuler(); // Décapsule la quatrième bière

    // Affichage des étiquettes après décapsulage
    System.out.println("\nApres decapsulage :");
    System.out.println(uneBiere1);
    System.out.println(uneBiere2);
    System.out.println(uneBiere3);
    System.out.println(uneBiere4);
    System.out.println(uneBiere5);
    }
} // TODO code application logic here
    
