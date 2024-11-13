/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author cassandrasortais
 */
public class Epee extends Arme {

    private int finesse;

    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque);
        this.finesse = finesse;
    }

    public int getFinesse() {
        return finesse;
    }

    @Override
    public void afficherDetails() {
        System.out.println("Epee : " + getNom() + " | Attaque : " + getNiveauAttaque() + " | Finesse : " + finesse);
    }
}
