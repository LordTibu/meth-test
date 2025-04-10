package org.example;

import junit.framework.TestCase;
public class TabArticlesTest extends TestCase {

    public void testAddArticle() {
        TabArticles tabArticles = new TabArticles();
        tabArticles.addArticle("Pierna", 39.99);
        Article resultat = tabArticles.getArticle("1");
        Article attendue= new Article("Pierna", "1", 39.99);
        assertEquals(attendue.getName(),resultat.getName());
        assertEquals(attendue.getId(),resultat.getId());
        assertEquals(attendue.getPrice(),resultat.getPrice());
    }

    public void testDeleteArticle() {
        TabArticles tabArticles = new TabArticles();
        tabArticles.addArticle("Pierna", 39.99);
        tabArticles.addArticle("Piernota", 49.99);
        tabArticles.deleteArticle("1");
        assertEquals(1, tabArticles.getArticles().size());
        tabArticles.deleteArticle("2");
        assertTrue(tabArticles.getArticles().isEmpty());
    }

    public void testGetArticles() {
        TabArticles tabArticles = new TabArticles();
        tabArticles.addArticle("Pierna", 39.99);
        tabArticles.addArticle("Piernota", 49.99);
        assertEquals(2, tabArticles.getArticles().size());
    }
}