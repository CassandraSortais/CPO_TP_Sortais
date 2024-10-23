/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_relation_1_sortais;

/**
 *
 * @author cassandrasortais
 */
class Personne {

    private String nom;
    private String prenom;
    private int age;
    private Voiture[] liste_voitures; // Tableau pour stocker les voitures
    private int nbVoitures; // Compteur pour le nombre de voitures possédées

    // Constructeur
    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.liste_voitures = new Voiture[3]; // Réservation de mémoire pour 3 voitures
        this.nbVoitures = 0; // Initialisation à 0
    }

    // Méthode pour ajouter une voiture
    public boolean ajouterVoiture(Voiture voiture_a_ajouter) {
        // Vérifie si la voiture a déjà un propriétaire
        if (voiture_a_ajouter.getProprietaire() != null) {
            System.out.println("Cette voiture a déjà un propriétaire !");
            return false;
        }

        // Vérifie si le propriétaire a déjà 3 voitures
        if (nbVoitures >= liste_voitures.length) {
            System.out.println("Le propriétaire a déjà 3 voitures.");
            return false;
        }

        // Ajoute la voiture dans la première cellule disponible
        liste_voitures[nbVoitures] = voiture_a_ajouter;
        nbVoitures++;

        // Met à jour le propriétaire de la voiture
        voiture_a_ajouter.setProprietaire(this);

        return true; // Ajout réussi
    }

    // Getter pour liste_voitures
    public Voiture[] getListeVoitures() {
        return liste_voitures;
    }

    // Getter pour nbVoitures
    public int getNbVoitures() {
        return nbVoitures;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Personne [Nom: " + nom + ", Prenom: " + prenom + ", Age: " + age + "]";
    }
}
