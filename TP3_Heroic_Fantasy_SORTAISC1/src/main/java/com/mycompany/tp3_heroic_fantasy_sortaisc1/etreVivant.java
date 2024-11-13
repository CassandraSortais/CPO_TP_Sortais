/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.tp3_heroic_fantasy_sortaisc1;

/**
 *
 * @author cassandrasortais
 */
public interface etreVivant {

    void seFatiguer();

    boolean estVivant();

    void estAttaque(int points);

    void attaquer(etreVivant cible);
}
