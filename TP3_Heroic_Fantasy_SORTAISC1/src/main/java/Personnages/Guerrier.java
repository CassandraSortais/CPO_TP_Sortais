/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Epee;
import Armes.Arme;

/**
 *
 * @author cassandrasortais
 */
public class Guerrier extends Personnage {

    private boolean estAcheval; // Le guerrier est-il à cheval ?

    // Constructeur de la classe Guerrier
    public Guerrier(String nom, int pointsDeVie, boolean estAcheval) {
        super(nom, pointsDeVie);
        this.estAcheval = estAcheval;
    }

    public boolean estAcheval() {
        return estAcheval;
    }

    @Override
    public void attaquer(Personnage cible) {
        int degats = 30; // Le guerrier inflige 30 points de dégâts
        if (this.getArmeEquipee() instanceof Epee) {
            Epee epee = (Epee) this.getArmeEquipee();
            degats *= epee.getFinesse(); // Les dégâts sont multipliés par la finesse de l'épée
        }
        if (estAcheval) {
            degats /= 2; // Si le guerrier est à cheval, les dégâts sont divisés par 2
        }
        cible.estAttaque(degats);
        this.seFatiguer();
    }

    @Override
    public void equiperArme(Arme arme) {
        if (arme instanceof Epee) {
            super.equiperArme(arme); // Appel à la méthode de la classe mère pour l'épée
        } else {
            System.out.println("Le guerrier ne peut équiper que des épées.");
        }
    }
}
