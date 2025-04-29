package com.example;

public class LigneDeBonLivraison {
    private int id;
    private String libelle;
    private int qte;

    // Constructor
    public LigneDeBonLivraison(int id, String libelle, int qte) {
        this.id = id;
        this.libelle = libelle;
        setQte(qte); // Vérifie valeur négative via le setter
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getLibelle() { return libelle; }
    public void setLibelle(String libelle) { this.libelle = libelle; }

    public int getQte() { return qte; }
    public void setQte(int qte) {
        if (qte < 0) {
            this.qte = 0; // Forcer à 0 si négatif
        } else {
            this.qte = qte;
        }
    }
}
