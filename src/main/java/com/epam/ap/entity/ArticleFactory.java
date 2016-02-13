package com.epam.ap.entity;

import com.epam.ap.util.RandomLineGetter;
import org.joda.money.Money;

import java.security.SecureRandom;
import java.util.Random;

public class ArticleFactory {
    private static Random rnd = new SecureRandom();
    private int minPrice = 1000;
    private int maxPrice = 100_000;
    private RandomLineGetter lineGetter = new RandomLineGetter();

    public Article getRandomArticle() {
        Article article = new Article();

        int price = minPrice + rnd.nextInt(maxPrice);
        article.setPrice(Money.parse("KZT " + String.valueOf(price)));

        article.setName(lineGetter.getLineFrom(RandomLineGetter.EQUIPMENT));
        article.setDescription("asdasd");
        article.setType(new ArticleType());
        article.setId(rnd.nextLong());

        return article;
    }
}
