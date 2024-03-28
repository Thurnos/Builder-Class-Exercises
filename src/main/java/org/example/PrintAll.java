package org.example;

import java.util.List;

public interface PrintAll {
    static <Type> void printAll(List<Type> list) {
        for (Type item : list) {
            System.out.println(item);
        }
    }
}
