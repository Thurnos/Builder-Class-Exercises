package org.example;

import java.util.Date;

public class Book {

    private final BookBuilder boo = new BookBuilder();

    public Book(String name, int pages, int VIN, String material_type, Date production) {
        this.boo.setName(name);
        this.boo.setPages(pages);
        this.boo.setVIN(VIN);
        this.boo.setMaterial_type(material_type);
        this.boo.setProduction(production);
    }
}
