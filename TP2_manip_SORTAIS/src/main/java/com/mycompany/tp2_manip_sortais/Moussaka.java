/*
SORTAIS Cassandra
TDC-Groupe1
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_manip_sortais;

/**
 *
 * @author cassandrasortais
 */
class Moussaka {

    // Attribut nbCalories de type int
    int nbCalories;

    // Constructeur
    public Moussaka(int calories) {
        this.nbCalories = calories;
    }

    // Méthode pour obtenir les calories
    public int getNbCalories() {
        return nbCalories;
    }

    // Méthode pour afficher les informations sur la Moussaka
    @Override
    public String toString() {
        return "Moussaka: " + nbCalories + " calories.";
    }
}
