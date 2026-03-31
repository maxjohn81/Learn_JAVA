import ohatra.Etude;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.++--==
public class Main {
    public static void main(String[] args) {

        Afficher a = new Afficher();
        Etude e= new Etude();

        Scanner scaner = new Scanner(System.in);

        System.out.print("Veuillez entrer votre prénom : ");
        String prenom = scaner.nextLine();

        System.out.print("Votre etude supérieur : ");
        String etude = scaner.nextLine();


        System.out.println("Bonjour je m'appelle "+ a.afficher(prenom)+" et " +e.afficher_etude(etude));
    }
}