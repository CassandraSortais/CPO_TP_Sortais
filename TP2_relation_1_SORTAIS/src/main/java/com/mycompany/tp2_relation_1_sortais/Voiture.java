/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_relation_1_sortais;

/**
 *
 * @author cassandrasortais
 */
class Voiture {

    private String modele;
    private String marque;
    private int annee;
    private Personne proprietaire; // Ajout de l'attribut proprietaire

    // Constructeur
    public Voiture(String modele, String marque, int annee, Personne proprietaire) {
        this.modele = modele;
        this.marque = marque;
        this.annee = annee;
        this.proprietaire = proprietaire; // Initialisation du proprietaire
    }

    // Getter pour proprietaire
    public Personne getProprietaire() {
        return proprietaire;
    }

    // Setter pour proprietaire
    public void setProprietaire(Personne proprietaire) {
        this.proprietaire = proprietaire;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Voiture [Modele: " + modele + ", Marque: " + marque + ", Annee: " + annee + ", Proprietaire: " + (proprietaire != null ? proprietaire.toString() : "Aucun") + "]";
    }

}
