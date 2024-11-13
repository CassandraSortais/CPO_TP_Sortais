/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;

/**
 *
 * @author cassandrasortais
 */
public abstract class Personnage {

    protected String nom;
    protected int pointsDeVie;
    protected Arme armeEquipee;

    public Personnage(String nom, int pointsDeVie) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
    }

    public String getNom() {
        return nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public Arme getArmeEquipee() {
        return armeEquipee;
    }

    public void equiperArme(Arme arme) {
        this.armeEquipee = arme;
    }

    public abstract void attaquer(Personnage cible);

    public void estAttaque(int points) {
        this.pointsDeVie -= points;
        if (pointsDeVie < 0) {
            pointsDeVie = 0;
        }
    }

    public boolean estVivant() {
        return pointsDeVie > 0;
    }

    public void seFatiguer() {
        this.pointsDeVie -= 10;
        if (pointsDeVie < 0) {
            pointsDeVie = 0;
        }
    }
}
