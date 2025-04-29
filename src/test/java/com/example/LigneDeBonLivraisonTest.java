package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LigneDeBonLivraisonTest {

    @Test
    public void testCreationValide() {
        LigneDeBonLivraison ligne = new LigneDeBonLivraison(1, "Chaise", 10);

        assertEquals(1, ligne.getId());
        assertEquals("Chaise", ligne.getLibelle());
        assertEquals(10, ligne.getQte());
        assertTrue(ligne.getQte() >= 0, "La quantité ne doit pas être négative");
    }

    @Test
    public void testSetters() {
        LigneDeBonLivraison ligne = new LigneDeBonLivraison(0, "", 0);

        ligne.setId(2);
        ligne.setLibelle("Table");
        ligne.setQte(30);

        assertEquals(2, ligne.getId());
        assertEquals("Table", ligne.getLibelle());
        assertEquals(30, ligne.getQte());
    }

    @Test
    public void testQteNegativeInConstructor() {
        LigneDeBonLivraison ligne = new LigneDeBonLivraison(3, "Lampe", -15);
        assertEquals(0, ligne.getQte(), "La quantité doit être fixée à 0 si négative");
    }

    @Test
    public void testQteNegativeInSetter() {
        LigneDeBonLivraison ligne = new LigneDeBonLivraison(4, "Sofa", 5);
        ligne.setQte(-8);
        assertEquals(0, ligne.getQte(), "La quantité doit être 0 si elle est définie négative");
    }
}
