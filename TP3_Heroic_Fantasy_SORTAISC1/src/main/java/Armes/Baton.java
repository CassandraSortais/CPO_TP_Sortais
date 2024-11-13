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
public class Baton extends Arme {

    private int age;

    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void afficherDetails() {
        System.out.println("Baton : " + getNom() + " | Attaque : " + getNiveauAttaque() + " | Age : " + age);
    }
}
