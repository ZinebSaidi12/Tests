package com.example;

import java.time.LocalDate;

public class BonLivraison {
    private int id;
    private String numeroBl;
    private LocalDate dateBl;
    private int clientId;

    // Constructor
    public BonLivraison(int id, String numeroBl, LocalDate dateBl, int clientId) {
        this.id = id;
        this.numeroBl = numeroBl;
        this.dateBl = dateBl;
        this.clientId = clientId;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNumeroBl() { return numeroBl; }
    public void setNumeroBl(String numeroBl) { this.numeroBl = numeroBl; }

    public LocalDate getDateBl() { return dateBl; }
    public void setDateBl(LocalDate dateBl) { this.dateBl = dateBl; }

    public int getClientId() { return clientId; }
    public void setClientId(int clientId) { this.clientId = clientId; }
}
