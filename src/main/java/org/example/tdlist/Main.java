package org.example.tdlist;

public class Main {

    public static void main(String[] args) {
        //test const param
        Etudiant etudiant1 = new Etudiant(1, "Ben Fadhel", "Sana");

        //test constru non param
        Etudiant etudiant2 = new Etudiant();
        etudiant2.setId(2);
        etudiant2.setNom("Dridi");
        etudiant2.setPrenom("Feten");

        System.out.println("Etudiant 1: " + etudiant1);
        System.out.println("Etudiant 2: " + etudiant2);

        // Test getters
        System.out.println("Etudiant 1 Nom: " + etudiant1.getNom());
        System.out.println("Etudiant 2 Prenom: " + etudiant2.getPrenom());

        // Testing equals
        Etudiant etudiant3 = new Etudiant(1, "Fehri", "Sami");
        System.out.println("Etudiant 1 is equal to Etudiant 3: " + etudiant1.equals(etudiant3));
        System.out.println("Etudiant 1 is equal to Etudiant 2: " + etudiant1.equals(etudiant2));




    }
}