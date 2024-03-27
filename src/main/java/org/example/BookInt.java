package org.example;

import java.util.Date;

public interface BookInt {
    BookBuilder setName(String name);

    BookBuilder setPages(int pages);

    BookBuilder setVIN(int vin);

    BookBuilder setMaterial_type(String materialType);

    BookBuilder setProduction(Date production);

    Book createBook();
}
