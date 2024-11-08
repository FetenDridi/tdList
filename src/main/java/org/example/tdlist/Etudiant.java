package org.example.tdlist;

public class Etudiant {
    private int id;
    private String nom;
    private String prenom;

    //constructor sans parametres
    public Etudiant() {
    }


    //constructor avec parametres
    public Etudiant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    //les getters et setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    //méthode boolean equals(Object o):tester 2 étudiants selon l’id
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Etudiant p = (Etudiant) obj;
        return this.id == p.id &&
                this.nom.equals(p.nom) &&
                this.prenom.equals(p.prenom);
    }

    //méthode toString():

    @Override
    public String toString() {
        return "ID: " + id + ", Nom: " + nom + ", Prenom: " + prenom;
    }




}
