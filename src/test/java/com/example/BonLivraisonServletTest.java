package com.example;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class BonLivraisonServletTest {
//nigga
    @Test
    public void testCreationValide() {
        BonLivraison bon = new BonLivraison(1, "BL001", LocalDate.of(2024, 4, 29), 101);

        assertEquals(1, bon.getId());
        assertEquals("BL001", bon.getNumeroBl());
        assertEquals(LocalDate.of(2024, 4, 29), bon.getDateBl());
        assertEquals(101, bon.getClientId());
    }

    @Test
    public void testSetters() {
        BonLivraison bon = new BonLivraison(0, "", LocalDate.now(), 0);

        bon.setId(2);
        bon.setNumeroBl("BL002");
        bon.setDateBl(LocalDate.of(2024, 5, 1));
        bon.setClientId(202);

        assertEquals(2, bon.getId());
        assertEquals("BL002", bon.getNumeroBl());
        assertEquals(LocalDate.of(2024, 5, 1), bon.getDateBl());
        assertEquals(202, bon.getClientId());
    }

    @Test
    public void testDateNotNull() {
        BonLivraison bon = new BonLivraison(3, "BL003", LocalDate.of(2024, 6, 1), 303);
        assertNotNull(bon.getDateBl(), "La date ne doit pas être nulle");
    }
}
