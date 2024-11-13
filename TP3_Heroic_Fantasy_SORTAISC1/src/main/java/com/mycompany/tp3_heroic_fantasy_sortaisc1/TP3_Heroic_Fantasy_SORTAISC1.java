/*SORTAIS CASSANDRA
TDC GROUPE 1
23 Octobre 2024
6-13 Novembre 2024
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tp3_heroic_fantasy_sortaisc1;

import Armes.Baton;
import Armes.Epee;
import Personnages.Guerrier;
import Personnages.Magicien;
import Personnages.Personnage;

/**
 *
 * @author cassandrasortais
 */
public class TP3_Heroic_Fantasy_SORTAISC1 {

    public static void main(String[] args) {
        // TODO code application logic here
        // Création de deux épées
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);

        // Création de deux bâtons
        Baton chene = new Baton("Chêne", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);

        // Création des personnages
        Magicien magicien = new Magicien("Merlin", 100, false); // Le magicien n'est pas confirmé
        Guerrier guerrier = new Guerrier("Arthur", 150, true);  // Le guerrier est à cheval

        // Choix des armes pour chaque personnage
        magicien.equiperArme(charme); // Le magicien équipe le bâton "Charme"
        guerrier.equiperArme(durandal); // Le guerrier équipe l'épée "Durandal"

        // Affichage des armes équipées
        System.out.println(magicien.getNom() + " a equipe " + magicien.getArmeEquipee().getNom());
        System.out.println(guerrier.getNom() + " a equipe " + guerrier.getArmeEquipee().getNom());

        // Affichage des caractéristiques avant l'attaque
        System.out.println("\n=== Caracteristiques avant l'attaque ===");
        afficherCaracteristiques(magicien);
        afficherCaracteristiques(guerrier);

        // Faire attaquer le guerrier
        System.out.println("\n" + guerrier.getNom() + " attaque " + magicien.getNom());
        guerrier.attaquer(magicien);  // Le guerrier attaque le magicien

        // Faire attaquer le magicien
        System.out.println("\n" + magicien.getNom() + " attaque " + guerrier.getNom());
        magicien.attaquer(guerrier);  // Le magicien attaque le guerrier

        // Affichage des caractéristiques après l'attaque
        System.out.println("\n=== Caracteristiques apres l'attaque ===");
        afficherCaracteristiques(magicien);
        afficherCaracteristiques(guerrier);

        // Test si les personnages sont vivants
        System.out.println("\n=== Test de la vivacite ===");
        System.out.println(magicien.getNom() + " est vivant ? " + (magicien.estVivant() ? "Oui" : "Non"));
        System.out.println(guerrier.getNom() + " est vivant ? " + (guerrier.estVivant() ? "Oui" : "Non"));
    }

    // Méthode pour afficher les caractéristiques d'un personnage
    public static void afficherCaracteristiques(Personnage personnage) {
        System.out.println(personnage.getNom() + " | PV: " + personnage.getPointsDeVie()
                + " | Arme: " + personnage.getArmeEquipee().getNom());
    }
}
