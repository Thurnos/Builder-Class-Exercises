package org.example;

import java.util.Date;
import java.util.List;

public class Book implements PrintAll{

    private final BookBuilder boo = new BookBuilder();

    public Book(String name, int pages, int VIN, String material_type, Date production) {
        this.boo.setName(name);
        this.boo.setPages(pages);
        this.boo.setVIN(VIN);
        this.boo.setMaterial_type(material_type);
        this.boo.setProduction(production);
    }


    public static <Type> void printAll(List<Type> list) {
        for (Type item : list) {
            System.out.println(item);
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "boo=" + boo +
                '}';
    }
}
