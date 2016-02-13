package com.epam.ap.entity;

import java.util.ArrayList;
import java.util.List;

public class CatalogueFactory {
    public static Catalogue getRandomCatalogue(int amount) {
        List<Article> result = new ArrayList<>();
        ArticleFactory factory = new ArticleFactory();
        for (int i = 0; i < amount; i++) {
            result.add(factory.getRandomArticle());

        }

        return new Catalogue(result);
    }

    public static Catalogue getRandomCatalogue() {
        return getRandomCatalogue(20);
    }
}
