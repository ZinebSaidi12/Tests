package com.example;

public class Article {
    private int id;
    private String ref;
    private String libelle;
    private int qte_stock;

    // Constructor
    public Article(int id, String ref, String libelle, int qte_stock) {
        this.id = id;
        this.ref = ref;
        this.libelle = libelle;
        setQte_stock(qte_stock); // Use setter to check negative value
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getRef() { return ref; }
    public void setRef(String ref) { this.ref = ref; }

    public String getLibelle() { return libelle; }
    public void setLibelle(String libelle) { this.libelle = libelle; }

    public int getQte_stock() { return qte_stock; }
    
    public void setQte_stock(int qte_stock) {
        if (qte_stock < 0) {
            this.qte_stock = 0; // Force 0 if negative
        } else {
            this.qte_stock = qte_stock;
        }
    }
}
