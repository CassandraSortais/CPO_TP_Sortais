/*
SORTAIS Cassandra
TDC - Groupe 1
23 Octobre 2024
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp2_relation_1_sortais;

/**
 *
 * @author cassandrasortais
 */
public class TP2_relation_1_SORTAIS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        // Création des objets Personne
        Personne bob = new Personne("Bobby", "Sixkiller", 30);
        Personne reno = new Personne("Reno", "Raines", 28);
 
        // Création des objets Voiture
        Voiture uneClio = new Voiture("Clio", "Renault", 5, null);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5, null);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6, null);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4, null);
 
        // Test de l'ajout des voitures à Bob
        bob.ajouterVoiture(uneClio);
        bob.ajouterVoiture(uneAutreClio);
 
        // Test de l'ajout des voitures à Reno
        reno.ajouterVoiture(une2008);
        reno.ajouterVoiture(uneMicra);
 
        // Affichage des voitures de Bob
        System.out.println("Les voitures de Bob : ");
        for (int i = 0; i < bob.getNbVoitures(); i++) {
            System.out.println(bob.getListeVoitures()[i]);
        }
 
        // Affichage des voitures de Reno
        System.out.println("Les voitures de Reno : ");
        for (int i = 0; i < reno.getNbVoitures(); i++) {
            System.out.println(reno.getListeVoitures()[i]);
        }
    }
}
    
