package com.epam.ap.entity;

import org.joda.money.Money;

public class Article extends BaseEntity {
    private Money price;
    private String name;
    private String description;
    private ArticleType type;

    public Article() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArticleType getType() {
        return type;
    }

    public void setType(ArticleType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Article{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
