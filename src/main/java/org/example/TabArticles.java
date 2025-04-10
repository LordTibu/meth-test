package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TabArticles {
    private Map<String, Article> articles = new HashMap<>();

    public void addArticle(String nom, double prix) {
        String id = String.valueOf(articles.size() + 1);
        articles.put(id, new Article(nom, id, prix));
    }

    public void deleteArticle(String id) {
        articles.remove(id);
    }

    public Article getArticle(String id) {
        return articles.get(id);
    }

    public List<Article> getArticles() {
        return new ArrayList<>(articles.values());
    }


}
