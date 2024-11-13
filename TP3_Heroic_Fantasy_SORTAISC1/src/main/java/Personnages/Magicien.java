/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Baton;

/**
 *
 * @author cassandrasortais
 */
public class Magicien extends Personnage {

    private boolean estConfirme; // Détermine si le magicien est confirmé

    // Constructeur avec 3 paramètres
    public Magicien(String nom, int pointsDeVie, boolean estConfirme) {
        super(nom, pointsDeVie);
        this.estConfirme = estConfirme;
    }

    public boolean estConfirme() {
        return estConfirme;
    }

    @Override
    public void attaquer(Personnage cible) {
        int degats = 20; // Le magicien inflige 20 points de dégâts
        if (this.getArmeEquipee() instanceof Baton) {
            Baton baton = (Baton) this.getArmeEquipee();
            degats *= baton.getAge(); // Les dégâts sont multipliés par l'âge du bâton
        }
        if (estConfirme) {
            degats /= 2; // Si le magicien est confirmé, les dégâts sont divisés par 2
        }
        cible.estAttaque(degats);
        this.seFatiguer();
    }
}
