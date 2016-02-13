package com.epam.ap.entity;

import org.joda.money.Money;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Catalogue {
    public static final Comparator<Article> COMPARE_PRICE = (o1, o2) -> o1.getPrice().compareTo(o2.getPrice());
    public static final Comparator<Article> COMPARE_NAME = (o1, o2) -> o1.getName().compareTo(o2.getName());

    List<Article> articles = new ArrayList<>();

    public Catalogue() {
    }

    public Catalogue(List<Article> articles) {
        this.articles = articles;
    }


    public void add(Article article) {
        if (article != null)
        articles.add(article);
    }

    public Article get(int index) {
        if (articles.size() <= index) throw new ArrayIndexOutOfBoundsException("Index: "+index+", Size: "+articles.size());
        return articles.get(index);
    }

    public int indexOf(Article article) {
        if (article == null) throw new IllegalArgumentException("Catalogue.indexOf() argument should not be null");
        return articles.indexOf(article);
    }

    public boolean remove(Article article) {
        if (article == null) throw new IllegalArgumentException("Catalogue.remove() argument should not be null");
        return articles.remove(article);
    }

    public void sort(Comparator<Article> c) {
        if (c == null) throw new IllegalArgumentException("Catalogue.sort() argument should not be null");
        articles.sort(c);
    }

    public List<Article> findByPrice(int min, int max) {
        if (min > max) throw new IllegalArgumentException("Min value should me greater or equal to max");
        Money minMoney = Money.parse("KZT "+ String.valueOf(min - 1));
        Money maxMoney = Money.parse("KZT "+ String.valueOf(max + 1));

        List<Article> result = new ArrayList<>();

        for (Article article : articles) {
            if (article.getPrice().isGreaterThan(minMoney)
                    && article.getPrice().isLessThan(maxMoney)) {
                result.add(article);
            }
        }

        return result;

    }

    @Override
    public String toString() {
        return "Catalogue{" +
                "articles=" + articles +
                '}';
    }
}
