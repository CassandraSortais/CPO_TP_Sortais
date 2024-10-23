/*
SORTAIS Cassandra
TDC-Groupe1
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cassandrasortais
 */
public class Tartiflette {

    // Attribut nbCalories de type int
    private int nbCalories;

    // Constructeur qui initialise nbCalories
    public Tartiflette(int nbCalories) {
        this.nbCalories = nbCalories;
    }

    // Méthode pour obtenir les calories
    public int getNbCalories() {
        return nbCalories;
    }

    // Méthode pour afficher les informations sur la Tartiflette
    @Override
    public String toString() {
        return "Tartiflette: " + nbCalories + " calories.";
    }

    public void increaseCalories(int calories) {
        this.nbCalories += calories;
    }
}
