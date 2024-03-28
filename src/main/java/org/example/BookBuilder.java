package org.example;

import java.util.Date;

public class BookBuilder implements BookInt {
    private String name;
    private int pages;
    private int vin;
    private String materialType;
    private Date production;

    @Override
    public BookBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public BookBuilder setPages(int pages) {
        this.pages = pages;
        return this;
    }

    @Override
    public BookBuilder setVIN(int vin) {
        this.vin = vin;
        return this;
    }

    @Override
    public BookBuilder setMaterial_type(String materialType) {
        this.materialType = materialType;
        return this;
    }

    @Override
    public BookBuilder setProduction(Date production) {
        this.production = production;
        return this;
    }

    @Override
    public Book createBook() {
        return new Book(name, pages, vin, materialType, production);
    }

    @Override
    public String toString() {
        return "BookBuilder{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", vin=" + vin +
                ", materialType='" + materialType + '\'' +
                ", production=" + production +
                '}';
    }
}