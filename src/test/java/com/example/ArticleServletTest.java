package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArticleServletTest {

	@Test
    public void testArticleCreation() {
        Article article = new Article(1, "REF001", "Stylish Chair", 20);

        assertEquals(1, article.getId());
        assertEquals("REF001", article.getRef());
        assertEquals("Stylish Chair", article.getLibelle());
        assertEquals(20, article.getQte_stock());
        assertTrue(article.getQte_stock() >= 0, "Stock quantity should not be negative");
    }

    @Test
    public void testSetters() {
        Article article = new Article(0, "", "", 0);

        article.setId(2);
        article.setRef("REF002");
        article.setLibelle("Modern Table");
        article.setQte_stock(50);

        assertEquals(2, article.getId());
        assertEquals("REF002", article.getRef());
        assertEquals("Modern Table", article.getLibelle());
        assertEquals(50, article.getQte_stock());
        assertTrue(article.getQte_stock() >= 0, "Stock quantity should not be negative");
    }

    @Test
    public void testNegativeStockInConstructor() {
        Article article = new Article(3, "REF003", "Vintage Lamp", -10);
        assertEquals(0, article.getQte_stock(), "Stock should be set to 0 if initialized with negative value");
    }

    @Test
    public void testNegativeStockInSetter() {
        Article article = new Article(4, "REF004", "Modern Sofa", 5);
        article.setQte_stock(-5);
        assertEquals(0, article.getQte_stock(), "Stock should be set to 0 if set with negative value");
    }

}
