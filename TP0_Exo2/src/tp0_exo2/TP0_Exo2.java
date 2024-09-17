/*
TP0-Exercice2
TD2-Groupe1
SORTAIS Cassandra
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_exo2;

import java.util.Scanner;

/**
 *
 * @author virgi
 */
public class TP0_Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
  
//Declaration des variables
int nb; // nombre dentiers a additionner
int result; // resultat
int ind; //indice
//nb=5;
result=0;
Scanner sc = new Scanner(System.in);
System.out.println("\n Entrer le nombre :");
nb=sc.nextInt(); // On demande a sc de donner le prochain entier
// Addition des nb premiers entiers
ind=1;
while (ind <= nb) {
result=result+ind;
ind++;
}
// Affichage du resultat
System.out.println();
System.out.println("La somme des "+ nb + "entiers est: "+result);    
    }
    
}
