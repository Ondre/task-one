package com.epam.ap.entity;

public abstract class BaseEntity {
    private Long id;

    public Long getId() {
        return id;
    }

    protected void setId(Long id) {
        this.id = id;
    }
}
